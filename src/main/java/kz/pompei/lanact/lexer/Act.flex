package kz.pompei.lanact.gen.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import kz.pompei.lanact.lexer.ActElementStr;
import kz.pompei.lanact.gen.language.ActTokenTypes;
import com.intellij.psi.TokenType;

%%

%class ActLexer
%public
%implements FlexLexer
%unicode
%line
%column
%function advance
%type IElementType
%eof{  return;
%eof}

%{

  public int yyline, yycolumn;

  private boolean strPart = false;

  public StringBuffer str = new StringBuffer();

%}


CRLF=\R
WHITE_SPACE=[\ \n\t\f]

WORD=[[:letter:]_][[:letter:]_0-9]*
NUMBER=[+-]?[0-9]([0-9_]*[0-9])*(\.[0-9]([0-9_]*[0-9])*)?([eE][+-]?[0-9]+)?([a-zA-Z][a-zA-Z0-9_]*)?

COMMENT = {INNERT_COMMENT} | {END_OF_LINE_COMMENT}

INPUT_CHARACTER = [^\r\n]

END_OF_LINE_COMMENT="\\"{INPUT_CHARACTER}*
INNERT_COMMENT="\\|" {COMMENT_CONTENT} "|"+ "\\"
COMMENT_CONTENT= ( [^|] |  \|+ [^\\] )*

STR_LEFT ="{" ( [^\{\}]*  [^\\] )? "{"
STR_INNER="}" ( [^\{\}]*  [^\\] )? "{"
STR_RIGHT="}" ( [^\{\}]*  [^\\] )? "}"
STR_CONST="{" ( [^\{\}]*  [^\\] )? "}"

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return ActTokenTypes.COMMENT;   }

<YYINITIAL> "class"                                         { yybegin(YYINITIAL); return ActTokenTypes.CLASS;     }
<YYINITIAL> "do"                                            { yybegin(YYINITIAL); return ActTokenTypes.DO;        }
<YYINITIAL> "done"                                          { yybegin(YYINITIAL); return ActTokenTypes.DONE;      }
<YYINITIAL> "if"                                            { yybegin(YYINITIAL); return ActTokenTypes.IF;        }
<YYINITIAL> "elsif"                                         { yybegin(YYINITIAL); return ActTokenTypes.ELSIF;     }
<YYINITIAL> "else"                                          { yybegin(YYINITIAL); return ActTokenTypes.ELSE;      }
<YYINITIAL> "end"                                           { yybegin(YYINITIAL); return ActTokenTypes.END;       }
<YYINITIAL> "let"                                           { yybegin(YYINITIAL); return ActTokenTypes.LET;       }
<YYINITIAL> "yes"                                           { yybegin(YYINITIAL); return ActTokenTypes.YES;       }
<YYINITIAL> "no"                                            { yybegin(YYINITIAL); return ActTokenTypes.NO;        }
<YYINITIAL> "("                                             { yybegin(YYINITIAL); return ActTokenTypes.PAR_OPEN;  }
<YYINITIAL> ")"                                             { yybegin(YYINITIAL); return ActTokenTypes.PAR_CLOSE; }
<YYINITIAL> "["                                             { yybegin(YYINITIAL); return ActTokenTypes.SQ_OPEN;  }
<YYINITIAL> "]"                                             { yybegin(YYINITIAL); return ActTokenTypes.SQ_CLOSE; }
<YYINITIAL> "<-"                                            { yybegin(YYINITIAL); return ActTokenTypes.ASSIGN;    }

<YYINITIAL> {WORD}                                          { yybegin(YYINITIAL); return ActTokenTypes.WORD; }

<YYINITIAL> {NUMBER}                                        { yybegin(YYINITIAL); return ActTokenTypes.NUMBER; }

<YYINITIAL> {COMMENT}                                        { yybegin(YYINITIAL); return ActTokenTypes.COMMENT; }

<YYINITIAL> ({CRLF}|{WHITE_SPACE})+                         { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<YYINITIAL> {STR_LEFT}                                      { yybegin(YYINITIAL); return ActTokenTypes.STR_LEFT; }
<YYINITIAL> {STR_INNER}                                     { yybegin(YYINITIAL); return ActTokenTypes.STR_INNER; }
<YYINITIAL> {STR_RIGHT}                                     { yybegin(YYINITIAL); return ActTokenTypes.STR_RIGHT; }
<YYINITIAL> {STR_CONST}                                     { yybegin(YYINITIAL); return ActTokenTypes.STR_CONST; }

[^]                                                         { return TokenType.BAD_CHARACTER; }

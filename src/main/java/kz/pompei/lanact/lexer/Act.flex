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
WORD=[[:letter:]_][[:letter:]0-9_]*
NUMBER=[+-]?[0-9]([0-9_]*[0-9])*(\.[0-9]([0-9_]*[0-9])*)?([eE][+-]?[0-9]+)?([a-zA-Z][a-zA-Z0-9_]*)?

COMMENT = {TRADITIONAL_COMMENT} | {END_OF_LINE_COMMENT} | {DOC_COMMENT}

LINE_TERMINATOR = \r|\n|\r\n
INPUT_CHARACTER = [^\r\n]

TRADITIONAL_COMMENT = "/*" [^*] ~"*/" | "/*" "*"+ "/"
END_OF_LINE_COMMENT = "///" {INPUT_CHARACTER}* {LINE_TERMINATOR}?
DOC_COMMENT = "/**" {COMMENT_CONTENT} "*"+ "/"
COMMENT_CONTENT       = ( [^*] | \*+ [^/*] )*

%state STRING

%%

<YYINITIAL> {WHITE_SPACE}                                   { yybegin(YYINITIAL); return ActTokenTypes.WHITE_SPACE; }

<YYINITIAL> "import"                                        { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD_STARTER; }
<YYINITIAL> "fun"                                           { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD_STARTER; }
<YYINITIAL> "operator"                                      { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD_STARTER; }
<YYINITIAL> "class"                                         { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD_STARTER; }
<YYINITIAL> "interface"                                     { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD_STARTER; }
<YYINITIAL> "let"                                           { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD_STARTER; }
<YYINITIAL> "mul"                                           { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD_STARTER; }
<YYINITIAL> "ret"                                           { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD_STARTER; }

<YYINITIAL> "if"                                            { yybegin(YYINITIAL); return ActTokenTypes.IF; }
<YYINITIAL> "elsif"                                         { yybegin(YYINITIAL); return ActTokenTypes.ELSIF; }
<YYINITIAL> "else"                                          { yybegin(YYINITIAL); return ActTokenTypes.ELSE; }
<YYINITIAL> "fi"                                            { yybegin(YYINITIAL); return ActTokenTypes.FI; }

<YYINITIAL> "ROOT"                                          { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD; }
<YYINITIAL> "nil"                                           { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD; }
<YYINITIAL> "yes"                                           { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD; }
<YYINITIAL> "no"                                            { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD; }
<YYINITIAL> "me"                                            { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD; }
<YYINITIAL> "Me"                                            { yybegin(YYINITIAL); return ActTokenTypes.KEYWORD; }

<YYINITIAL> "do"                                            { yybegin(YYINITIAL); return ActTokenTypes.DO; }
<YYINITIAL> "done"                                          { yybegin(YYINITIAL); return ActTokenTypes.DONE; }

<YYINITIAL> "("                                             { yybegin(YYINITIAL); return ActTokenTypes.PARENTHESIS_OPEN; }
<YYINITIAL> ")"                                             { yybegin(YYINITIAL); return ActTokenTypes.PARENTHESIS_CLOSE; }
<YYINITIAL> "["                                             { yybegin(YYINITIAL); return ActTokenTypes.SQUARE_OPEN; }
<YYINITIAL> "]"                                             { yybegin(YYINITIAL); return ActTokenTypes.SQUARE_CLOSE; }

<YYINITIAL> "and"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "or"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "not"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "xor"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }

<YYINITIAL> {WORD}                                          { yybegin(YYINITIAL); return ActTokenTypes.WORD; }

<YYINITIAL> {NUMBER}                                        { yybegin(YYINITIAL); return ActTokenTypes.NUMBER; }

<YYINITIAL> {COMMENT}                                       { /*Nothing to do*/ }

<YYINITIAL> ";"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> ","                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }

<YYINITIAL> "<-"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> ":::"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "::"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> ":"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "<=="                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "->"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "==>"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "=>"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "==="                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "=="                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "="                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "!="                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "<>"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "<=>"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "<="                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "-<"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "<<<"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "<<"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "<"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> ">="                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> ">-"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> ">>>"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> ">>"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> ">"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "@"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "@@"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "%%"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "%"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "//"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "/"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "**"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "*"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "--"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "-|"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "-"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "++"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "+"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "!"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "!~"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "^"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "~"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "&&&"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "&&"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "&"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "|||"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "||"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "|-"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "|"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "##"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "#~"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "#"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "???"                                           { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "??"                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> "?"                                             { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }

<YYINITIAL> \.\.\.                                          { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }
<YYINITIAL> \.\.                                            { yybegin(YYINITIAL); return ActTokenTypes.SIGN; }

<YYINITIAL> \.                                              { yybegin(YYINITIAL); return ActTokenTypes.DOT; }

<YYINITIAL> "{"                                             { str.setLength(0); strPart = false; yybegin(STRING); }
<YYINITIAL> "}"                                             { str.setLength(0); strPart = true;  yybegin(STRING); }

<YYINITIAL> .                                               { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER; }


<STRING> "{"        { yybegin(YYINITIAL);
                      return new ActElementStr(strPart ? ActElementStr.STR_INNER : ActElementStr.STR_OPEN, str.toString()); }
<STRING> "}"        { yybegin(YYINITIAL);
                      return new ActElementStr(strPart ? ActElementStr.STR_CLOSE : ActElementStr.STR_FULL, str.toString()); }

<STRING> [^\n\r\{\}\\]+        { str.append( yytext() ); }
<STRING> \\t                   { str.append( '\t' ); }
<STRING> \\n                   { str.append( '\n' ); }

<STRING> \\r                   { str.append( '\r' ); }
<STRING> \\"{"                 { str.append( '{' );  }
<STRING> \\"}"                 { str.append( '}' );  }
<STRING> \\                    { str.append( '\\' ); }

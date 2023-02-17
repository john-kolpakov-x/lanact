package kz.pompei.lanact.gen.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import kz.pompei.lanact.lexer.ActElementStr;
import kz.pompei.lanact.lexer.ActLexerTypes;
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

<YYINITIAL> {WHITE_SPACE}                                   { yybegin(YYINITIAL); return ActLexerTypes.WHITE_SPACE; }

<YYINITIAL> "import"                                        { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD_STARTER; }
<YYINITIAL> "fun"                                           { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD_STARTER; }
<YYINITIAL> "operator"                                      { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD_STARTER; }
<YYINITIAL> "class"                                         { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD_STARTER; }
<YYINITIAL> "interface"                                     { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD_STARTER; }
<YYINITIAL> "let"                                           { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD_STARTER; }
<YYINITIAL> "mul"                                           { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD_STARTER; }
<YYINITIAL> "ret"                                           { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD_STARTER; }

<YYINITIAL> "if"                                            { yybegin(YYINITIAL); return ActLexerTypes.IF; }
<YYINITIAL> "elsif"                                         { yybegin(YYINITIAL); return ActLexerTypes.ELSIF; }
<YYINITIAL> "else"                                          { yybegin(YYINITIAL); return ActLexerTypes.ELSE; }
<YYINITIAL> "fi"                                            { yybegin(YYINITIAL); return ActLexerTypes.FI; }

<YYINITIAL> "ROOT"                                          { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD; }
<YYINITIAL> "nil"                                           { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD; }
<YYINITIAL> "yes"                                           { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD; }
<YYINITIAL> "no"                                            { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD; }
<YYINITIAL> "me"                                            { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD; }
<YYINITIAL> "Me"                                            { yybegin(YYINITIAL); return ActLexerTypes.KEYWORD; }

<YYINITIAL> "do"                                            { yybegin(YYINITIAL); return ActLexerTypes.DO; }
<YYINITIAL> "done"                                          { yybegin(YYINITIAL); return ActLexerTypes.DONE; }

<YYINITIAL> "("                                             { yybegin(YYINITIAL); return ActLexerTypes.PARENTHESIS_OPEN; }
<YYINITIAL> ")"                                             { yybegin(YYINITIAL); return ActLexerTypes.PARENTHESIS_CLOSE; }
<YYINITIAL> "["                                             { yybegin(YYINITIAL); return ActLexerTypes.SQUARE_OPEN; }
<YYINITIAL> "]"                                             { yybegin(YYINITIAL); return ActLexerTypes.SQUARE_CLOSE; }

<YYINITIAL> "and"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "or"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "not"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "xor"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }

<YYINITIAL> {WORD}                                          { yybegin(YYINITIAL); return ActLexerTypes.WORD; }

<YYINITIAL> {NUMBER}                                        { yybegin(YYINITIAL); return ActLexerTypes.NUMBER; }

<YYINITIAL> {COMMENT}                                       { /*Nothing to do*/ }

<YYINITIAL> ";"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> ","                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }

<YYINITIAL> "<-"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> ":::"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "::"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> ":"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "<=="                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "->"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "==>"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "=>"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "==="                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "=="                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "="                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "!="                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "<>"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "<=>"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "<="                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "-<"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "<<<"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "<<"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "<"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> ">="                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> ">-"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> ">>>"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> ">>"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> ">"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "@"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "@@"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "%%"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "%"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "//"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "/"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "**"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "*"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "--"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "-|"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "-"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "++"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "+"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "!"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "!~"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "^"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "~"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "&&&"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "&&"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "&"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "|||"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "||"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "|-"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "|"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "##"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "#~"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "#"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "???"                                           { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "??"                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> "?"                                             { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }

<YYINITIAL> \.\.\.                                          { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }
<YYINITIAL> \.\.                                            { yybegin(YYINITIAL); return ActLexerTypes.SIGN; }

<YYINITIAL> \.                                              { yybegin(YYINITIAL); return ActLexerTypes.DOT; }

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

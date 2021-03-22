grammar Expressions;

start  : filter ;

filter : '$filter=' cond;

cond   : left=cond op=(' and '|' or ') right=cond            #andOrExpr
       | 'contains(' key=cond ',' value=cond ')'             #containsKeyValueExpr
       | 'contains(' key=cond ')'                            #containsKeyExpr
       | 'regex(' key=cond ',' regex=REGEX ')'               #regexExpr
       | key=cond op=(' eq '|' gt '|' lt ') value=cond       #compareExpr
       | 'not' right=cond                                    #notExpr
       | '(' center=cond ')'                                 #parenthesisExpr
       | atom=STR                                            #atomExpr
       ;


STR               : ('a'..'z')+ ;

fragment RGX      : (.)+ ;
REGEX             : ('\'' RGX '\'');

WS                : [ \t\r\n]+ -> skip ;

grammar Antlr;
options {
backtrack=true;
output=AST;
rewrite=true;
ASTLabelType=CommonTree;}
//tokens {root;} // imaginary token

// START:members
@header {
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

}
@members {
/** Map variable name to Integer object holding value */
//HashMap memory = new HashMap();
/*try{
FileWriter opFile = new FileWriter("\\A:\\MyWorkspace\\Project\\Antlr\\src\\fileconversion\\ObjIntersectOfGrammar.g");
BufferedWriter out = new BufferedWriter(opFile);
catch[IOException e]{throws e;}*/

}

// END:members

// START:stat
//prog	: includes namespaceDecls regexpDefs productions ;
prog	: includes namespaceDecls regexpDefs productions ->;
includes: include * ->;
      //  | ;
include : 'include' '"' '"' ->;

namespaceDecls: namespaceDecl* ->;
          //     | ;

namespaceDecl : 'xmlns' '=' '"' '"' ->;

regexpDefs  : regexpDef* ->;
          // | ;
        
regexpDef : REGEXP  '='  REGEXP
			 OPTMAX ->;

/* 
 * Every production has a non-XML side and an XML side. If the nonterminal is omitted, the one from
 * the previous production is assumed. The first occurring nonterminal in the main file is the start nonterminal. 
 */

productions : production* ->;
            
           // | ;
            //term: INT ID  -> ^(MULT["*"] INT ID)
production : optNonterminal ':' leftItems rightItems 
 -> ^(optNonterminal leftItems rightItems);

optNonterminal : NONTERMINAL ;
             //  |  ;  
               
 leftItems : leftItem*  -> ^(leftItem);
//          | ;
         
rightItems: rightItem* -> ^(rightItem);
  //         | ;

leftItem : item -> item;

rightItem : item
         |element ;
//         -> ^(rightItem item element);
         
item       : '[' NONTERMINAL  optNameOrExample ']'//( options {greedy=true;} : . )*
     | '[' _ REGEXP optNameOrExample _ ']' 
    | '"' STRING '"' /*{System.out.println("item = "+$item.text);}*/
    ;
   // | '__'
    // | '_' __;

element : '<'  name attributes   '>' rightItems  '</>'
        | '<' name attributes '/>';
            
attributes : attribute*;
          // |;
           
attribute : NAME '=' '"' STRING '"'
        | name '=' '['  REGEXP optNameOrExample  ']'
         | name  '='  '['  NONTERMINAL optNameOrExample ']';

name: NCNAME
   // | <PREFIX> ':' <NCNAME>
    | ':' NCNAME
     | '[' REGEXP optNameOrExample  ']';
               
optNameOrExample  :  NAME
                | '"' STRING '"';
             //   |;

NONTERMINAL    	: ('a'..'z''a'..'z''A'..'Z''0'..'9'' ''.') * ;
//NONTERMINAL    	: ('A'..'Z')|('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'\'|'.') * ;
NAME           	:('a'..'z''A'..'Z''0'..'9'' ''.')+ ;
REGEXP         	: ('A'..'Z''a'..'z''A'..'Z''0'..'9'' ''.')* ; 
WHITESPACE     	: ('\ '|'\t'|'\n'|'\r'|'\f')+ ;
NUMBER      :	('0'..'9')+ ;
OPTMAX : ('(''MAX'')') ;
STRING  :	~('\b'|'\t'|'\n'|'\r'|'\f')*  ; 
NCNAME	:	~('\t'|'\n'|'\r'|':'|'>'|'='|'/')+ ;
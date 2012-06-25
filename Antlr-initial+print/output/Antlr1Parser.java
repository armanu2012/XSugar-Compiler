// $ANTLR 3.4 A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g 2012-06-25 16:45:09

import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Antlr1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "NCNAME", "NONTERMINAL", "NUMBER", "OPTMAX", "REGEXP", "STRING", "WHITESPACE", "'\"'", "'/>'", "':'", "'<'", "'</>'", "'='", "'>'", "'['", "']'", "'include'", "'xmlns'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int NAME=4;
    public static final int NCNAME=5;
    public static final int NONTERMINAL=6;
    public static final int NUMBER=7;
    public static final int OPTMAX=8;
    public static final int REGEXP=9;
    public static final int STRING=10;
    public static final int WHITESPACE=11;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Antlr1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Antlr1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return Antlr1Parser.tokenNames; }
    public String getGrammarFileName() { return "A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g"; }


    /** Map variable name to Integer object holding value */
    //HashMap memory = new HashMap();
    /*try{
    FileWriter opFile = new FileWriter("\\A:\\MyWorkspace\\Project\\Antlr\\src\\fileconversion\\ObjIntersectOfGrammar.g");
    BufferedWriter out = new BufferedWriter(opFile);
    catch[IOException e]{throws e;}*/



    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:31:1: prog : ( stat ) ;
    public final Antlr1Parser.prog_return prog() throws RecognitionException {
        Antlr1Parser.prog_return retval = new Antlr1Parser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.stat_return stat1 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:31:6: ( ( stat ) )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:31:8: ( stat )
            {
            root_0 = (CommonTree)adaptor.nil();


            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:31:8: ( stat )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:31:10: stat
            {
            pushFollow(FOLLOW_stat_in_prog44);
            stat1=stat();

            state._fsp--;

            adaptor.addChild(root_0, stat1.getTree());

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:35:1: stat : includes namespaceDecls regexpDefs productions ;
    public final Antlr1Parser.stat_return stat() throws RecognitionException {
        Antlr1Parser.stat_return retval = new Antlr1Parser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.includes_return includes2 =null;

        Antlr1Parser.namespaceDecls_return namespaceDecls3 =null;

        Antlr1Parser.regexpDefs_return regexpDefs4 =null;

        Antlr1Parser.productions_return productions5 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:35:6: ( includes namespaceDecls regexpDefs productions )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:35:8: includes namespaceDecls regexpDefs productions
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_includes_in_stat85);
            includes2=includes();

            state._fsp--;

            adaptor.addChild(root_0, includes2.getTree());

            pushFollow(FOLLOW_namespaceDecls_in_stat87);
            namespaceDecls3=namespaceDecls();

            state._fsp--;

            adaptor.addChild(root_0, namespaceDecls3.getTree());

            pushFollow(FOLLOW_regexpDefs_in_stat89);
            regexpDefs4=regexpDefs();

            state._fsp--;

            adaptor.addChild(root_0, regexpDefs4.getTree());

            pushFollow(FOLLOW_productions_in_stat91);
            productions5=productions();

            state._fsp--;

            adaptor.addChild(root_0, productions5.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class includes_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includes"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:36:1: includes : ( include )* ;
    public final Antlr1Parser.includes_return includes() throws RecognitionException {
        Antlr1Parser.includes_return retval = new Antlr1Parser.includes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.include_return include6 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:36:9: ( ( include )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:36:13: ( include )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:36:13: ( include )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:36:13: include
            	    {
            	    pushFollow(FOLLOW_include_in_includes100);
            	    include6=include();

            	    state._fsp--;

            	    adaptor.addChild(root_0, include6.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            System.out.println((include6!=null?input.toString(include6.start,include6.stop):null)==null?"include prod-null":(include6!=null?input.toString(include6.start,include6.stop):null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "includes"


    public static class include_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:39:1: include : 'include' '\"' '\"' ;
    public final Antlr1Parser.include_return include() throws RecognitionException {
        Antlr1Parser.include_return retval = new Antlr1Parser.include_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal7=null;
        Token char_literal8=null;
        Token char_literal9=null;

        CommonTree string_literal7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree char_literal9_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:39:9: ( 'include' '\"' '\"' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:39:11: 'include' '\"' '\"'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal7=(Token)match(input,21,FOLLOW_21_in_include121); 
            string_literal7_tree = 
            (CommonTree)adaptor.create(string_literal7)
            ;
            adaptor.addChild(root_0, string_literal7_tree);


            char_literal8=(Token)match(input,12,FOLLOW_12_in_include123); 
            char_literal8_tree = 
            (CommonTree)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);


            char_literal9=(Token)match(input,12,FOLLOW_12_in_include125); 
            char_literal9_tree = 
            (CommonTree)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "include"


    public static class namespaceDecls_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespaceDecls"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:42:1: namespaceDecls : ( namespaceDecl )* ;
    public final Antlr1Parser.namespaceDecls_return namespaceDecls() throws RecognitionException {
        Antlr1Parser.namespaceDecls_return retval = new Antlr1Parser.namespaceDecls_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.namespaceDecl_return namespaceDecl10 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:42:15: ( ( namespaceDecl )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:42:17: ( namespaceDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:42:17: ( namespaceDecl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:42:17: namespaceDecl
            	    {
            	    pushFollow(FOLLOW_namespaceDecl_in_namespaceDecls133);
            	    namespaceDecl10=namespaceDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, namespaceDecl10.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespaceDecls"


    public static class namespaceDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespaceDecl"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:46:1: namespaceDecl : 'xmlns' '=' '\"' '\"' ;
    public final Antlr1Parser.namespaceDecl_return namespaceDecl() throws RecognitionException {
        Antlr1Parser.namespaceDecl_return retval = new Antlr1Parser.namespaceDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal11=null;
        Token char_literal12=null;
        Token char_literal13=null;
        Token char_literal14=null;

        CommonTree string_literal11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree char_literal14_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:46:15: ( 'xmlns' '=' '\"' '\"' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:46:17: 'xmlns' '=' '\"' '\"'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal11=(Token)match(input,22,FOLLOW_22_in_namespaceDecl154); 
            string_literal11_tree = 
            (CommonTree)adaptor.create(string_literal11)
            ;
            adaptor.addChild(root_0, string_literal11_tree);


            char_literal12=(Token)match(input,17,FOLLOW_17_in_namespaceDecl156); 
            char_literal12_tree = 
            (CommonTree)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            char_literal13=(Token)match(input,12,FOLLOW_12_in_namespaceDecl158); 
            char_literal13_tree = 
            (CommonTree)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);


            char_literal14=(Token)match(input,12,FOLLOW_12_in_namespaceDecl160); 
            char_literal14_tree = 
            (CommonTree)adaptor.create(char_literal14)
            ;
            adaptor.addChild(root_0, char_literal14_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespaceDecl"


    public static class regexpDefs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "regexpDefs"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:49:1: regexpDefs : ( regexpDef )* ;
    public final Antlr1Parser.regexpDefs_return regexpDefs() throws RecognitionException {
        Antlr1Parser.regexpDefs_return retval = new Antlr1Parser.regexpDefs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.regexpDef_return regexpDef15 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:49:13: ( ( regexpDef )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:49:15: ( regexpDef )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:49:15: ( regexpDef )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==REGEXP) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:49:15: regexpDef
            	    {
            	    pushFollow(FOLLOW_regexpDef_in_regexpDefs170);
            	    regexpDef15=regexpDef();

            	    state._fsp--;

            	    adaptor.addChild(root_0, regexpDef15.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            System.out.println((regexpDef15!=null?input.toString(regexpDef15.start,regexpDef15.stop):null)==null?"regexpDef-null":(regexpDef15!=null?input.toString(regexpDef15.start,regexpDef15.stop):null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "regexpDefs"


    public static class regexpDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "regexpDef"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:53:1: regexpDef : REGEXP '=' REGEXP OPTMAX ;
    public final Antlr1Parser.regexpDef_return regexpDef() throws RecognitionException {
        Antlr1Parser.regexpDef_return retval = new Antlr1Parser.regexpDef_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REGEXP16=null;
        Token char_literal17=null;
        Token REGEXP18=null;
        Token OPTMAX19=null;

        CommonTree REGEXP16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree REGEXP18_tree=null;
        CommonTree OPTMAX19_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:53:11: ( REGEXP '=' REGEXP OPTMAX )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:53:13: REGEXP '=' REGEXP OPTMAX
            {
            root_0 = (CommonTree)adaptor.nil();


            REGEXP16=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_regexpDef202); 
            REGEXP16_tree = 
            (CommonTree)adaptor.create(REGEXP16)
            ;
            adaptor.addChild(root_0, REGEXP16_tree);


            char_literal17=(Token)match(input,17,FOLLOW_17_in_regexpDef205); 
            char_literal17_tree = 
            (CommonTree)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


            REGEXP18=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_regexpDef208); 
            REGEXP18_tree = 
            (CommonTree)adaptor.create(REGEXP18)
            ;
            adaptor.addChild(root_0, REGEXP18_tree);


            OPTMAX19=(Token)match(input,OPTMAX,FOLLOW_OPTMAX_in_regexpDef214); 
            OPTMAX19_tree = 
            (CommonTree)adaptor.create(OPTMAX19)
            ;
            adaptor.addChild(root_0, OPTMAX19_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "regexpDef"


    public static class productions_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "productions"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:61:1: productions : ( production )* ;
    public final Antlr1Parser.productions_return productions() throws RecognitionException {
        Antlr1Parser.productions_return retval = new Antlr1Parser.productions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.production_return production20 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:61:13: ( ( production )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:61:15: ( production )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:61:15: ( production )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NONTERMINAL) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:61:15: production
            	    {
            	    pushFollow(FOLLOW_production_in_productions225);
            	    production20=production();

            	    state._fsp--;

            	    adaptor.addChild(root_0, production20.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "productions"


    public static class production_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "production"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:65:1: production : optNonterminal ':' leftItems rightItems ;
    public final Antlr1Parser.production_return production() throws RecognitionException {
        Antlr1Parser.production_return retval = new Antlr1Parser.production_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal22=null;
        Antlr1Parser.optNonterminal_return optNonterminal21 =null;

        Antlr1Parser.leftItems_return leftItems23 =null;

        Antlr1Parser.rightItems_return rightItems24 =null;


        CommonTree char_literal22_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:65:12: ( optNonterminal ':' leftItems rightItems )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:65:14: optNonterminal ':' leftItems rightItems
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_optNonterminal_in_production272);
            optNonterminal21=optNonterminal();

            state._fsp--;

            adaptor.addChild(root_0, optNonterminal21.getTree());

            char_literal22=(Token)match(input,14,FOLLOW_14_in_production274); 
            char_literal22_tree = 
            (CommonTree)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);


            pushFollow(FOLLOW_leftItems_in_production276);
            leftItems23=leftItems();

            state._fsp--;

            adaptor.addChild(root_0, leftItems23.getTree());

            pushFollow(FOLLOW_rightItems_in_production278);
            rightItems24=rightItems();

            state._fsp--;

            adaptor.addChild(root_0, rightItems24.getTree());

            System.out.println((leftItems23!=null?input.toString(leftItems23.start,leftItems23.stop):null)==null?"prod leftItem-null":(leftItems23!=null?input.toString(leftItems23.start,leftItems23.stop):null));

            System.out.println((rightItems24!=null?input.toString(rightItems24.start,rightItems24.stop):null)==null?"prod righttItem-null":(rightItems24!=null?input.toString(rightItems24.start,rightItems24.stop):null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "production"


    public static class optNonterminal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optNonterminal"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:70:1: optNonterminal : NONTERMINAL ;
    public final Antlr1Parser.optNonterminal_return optNonterminal() throws RecognitionException {
        Antlr1Parser.optNonterminal_return retval = new Antlr1Parser.optNonterminal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NONTERMINAL25=null;

        CommonTree NONTERMINAL25_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:70:16: ( NONTERMINAL )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:70:18: NONTERMINAL
            {
            root_0 = (CommonTree)adaptor.nil();


            NONTERMINAL25=(Token)match(input,NONTERMINAL,FOLLOW_NONTERMINAL_in_optNonterminal295); 
            NONTERMINAL25_tree = 
            (CommonTree)adaptor.create(NONTERMINAL25)
            ;
            adaptor.addChild(root_0, NONTERMINAL25_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optNonterminal"


    public static class leftItems_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "leftItems"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:73:2: leftItems : ( leftItem )* ;
    public final Antlr1Parser.leftItems_return leftItems() throws RecognitionException {
        Antlr1Parser.leftItems_return retval = new Antlr1Parser.leftItems_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.leftItem_return leftItem26 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:73:12: ( ( leftItem )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:73:14: ( leftItem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:73:14: ( leftItem )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==NONTERMINAL) ) {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==NAME) ) {
                            int LA5_7 = input.LA(4);

                            if ( (LA5_7==20) ) {
                                alt5=1;
                            }


                        }
                        else if ( (LA5_4==12) ) {
                            int LA5_8 = input.LA(4);

                            if ( (LA5_8==STRING) ) {
                                int LA5_13 = input.LA(5);

                                if ( (LA5_13==12) ) {
                                    int LA5_16 = input.LA(6);

                                    if ( (LA5_16==20) ) {
                                        alt5=1;
                                    }


                                }


                            }


                        }


                    }
                    else if ( (LA5_1==REGEXP) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==NAME) ) {
                            int LA5_9 = input.LA(4);

                            if ( (LA5_9==20) ) {
                                alt5=1;
                            }


                        }
                        else if ( (LA5_5==12) ) {
                            int LA5_10 = input.LA(4);

                            if ( (LA5_10==STRING) ) {
                                int LA5_15 = input.LA(5);

                                if ( (LA5_15==12) ) {
                                    int LA5_17 = input.LA(6);

                                    if ( (LA5_17==20) ) {
                                        alt5=1;
                                    }


                                }


                            }


                        }


                    }


                }
                else if ( (LA5_0==12) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==STRING) ) {
                        int LA5_6 = input.LA(3);

                        if ( (LA5_6==12) ) {
                            alt5=1;
                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:73:14: leftItem
            	    {
            	    pushFollow(FOLLOW_leftItem_in_leftItems334);
            	    leftItem26=leftItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, leftItem26.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "leftItems"


    public static class rightItems_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rightItems"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:76:1: rightItems : ( rightItem )* ;
    public final Antlr1Parser.rightItems_return rightItems() throws RecognitionException {
        Antlr1Parser.rightItems_return retval = new Antlr1Parser.rightItems_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.rightItem_return rightItem27 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:76:11: ( ( rightItem )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:76:13: ( rightItem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:76:13: ( rightItem )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||LA6_0==15||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:76:13: rightItem
            	    {
            	    pushFollow(FOLLOW_rightItem_in_rightItems352);
            	    rightItem27=rightItem();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rightItem27.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rightItems"


    public static class leftItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "leftItem"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:79:1: leftItem : item -> item ;
    public final Antlr1Parser.leftItem_return leftItem() throws RecognitionException {
        Antlr1Parser.leftItem_return retval = new Antlr1Parser.leftItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.item_return item28 =null;


        RewriteRuleSubtreeStream stream_item=new RewriteRuleSubtreeStream(adaptor,"rule item");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:79:10: ( item -> item )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:79:12: item
            {
            pushFollow(FOLLOW_item_in_leftItem365);
            item28=item();

            state._fsp--;

            stream_item.add(item28.getTree());

            // AST REWRITE
            // elements: item
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 79:17: -> item
            {
                adaptor.addChild(root_0, stream_item.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "leftItem"


    public static class rightItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rightItem"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:81:1: rightItem : ( item | element );
    public final Antlr1Parser.rightItem_return rightItem() throws RecognitionException {
        Antlr1Parser.rightItem_return retval = new Antlr1Parser.rightItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.item_return item29 =null;

        Antlr1Parser.element_return element30 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:81:11: ( item | element )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12||LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:81:13: item
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_item_in_rightItem377);
                    item29=item();

                    state._fsp--;

                    adaptor.addChild(root_0, item29.getTree());

                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:82:11: element
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_element_in_rightItem389);
                    element30=element();

                    state._fsp--;

                    adaptor.addChild(root_0, element30.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rightItem"


    public static class item_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "item"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:85:1: item : ( '[' NONTERMINAL optNameOrExample ']' | '[' REGEXP optNameOrExample ']' | '\"' STRING '\"' );
    public final Antlr1Parser.item_return item() throws RecognitionException {
        Antlr1Parser.item_return retval = new Antlr1Parser.item_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal31=null;
        Token NONTERMINAL32=null;
        Token char_literal34=null;
        Token char_literal35=null;
        Token REGEXP36=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token STRING40=null;
        Token char_literal41=null;
        Antlr1Parser.optNameOrExample_return optNameOrExample33 =null;

        Antlr1Parser.optNameOrExample_return optNameOrExample37 =null;


        CommonTree char_literal31_tree=null;
        CommonTree NONTERMINAL32_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree REGEXP36_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree STRING40_tree=null;
        CommonTree char_literal41_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:85:12: ( '[' NONTERMINAL optNameOrExample ']' | '[' REGEXP optNameOrExample ']' | '\"' STRING '\"' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==NONTERMINAL) ) {
                    alt8=1;
                }
                else if ( (LA8_1==REGEXP) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA8_0==12) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:85:14: '[' NONTERMINAL optNameOrExample ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal31=(Token)match(input,19,FOLLOW_19_in_item414); 
                    char_literal31_tree = 
                    (CommonTree)adaptor.create(char_literal31)
                    ;
                    adaptor.addChild(root_0, char_literal31_tree);


                    NONTERMINAL32=(Token)match(input,NONTERMINAL,FOLLOW_NONTERMINAL_in_item416); 
                    NONTERMINAL32_tree = 
                    (CommonTree)adaptor.create(NONTERMINAL32)
                    ;
                    adaptor.addChild(root_0, NONTERMINAL32_tree);


                    pushFollow(FOLLOW_optNameOrExample_in_item419);
                    optNameOrExample33=optNameOrExample();

                    state._fsp--;

                    adaptor.addChild(root_0, optNameOrExample33.getTree());

                    char_literal34=(Token)match(input,20,FOLLOW_20_in_item421); 
                    char_literal34_tree = 
                    (CommonTree)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:86:8: '[' REGEXP optNameOrExample ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal35=(Token)match(input,19,FOLLOW_19_in_item430); 
                    char_literal35_tree = 
                    (CommonTree)adaptor.create(char_literal35)
                    ;
                    adaptor.addChild(root_0, char_literal35_tree);


                    REGEXP36=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_item433); 
                    REGEXP36_tree = 
                    (CommonTree)adaptor.create(REGEXP36)
                    ;
                    adaptor.addChild(root_0, REGEXP36_tree);


                    pushFollow(FOLLOW_optNameOrExample_in_item435);
                    optNameOrExample37=optNameOrExample();

                    state._fsp--;

                    adaptor.addChild(root_0, optNameOrExample37.getTree());

                    char_literal38=(Token)match(input,20,FOLLOW_20_in_item438); 
                    char_literal38_tree = 
                    (CommonTree)adaptor.create(char_literal38)
                    ;
                    adaptor.addChild(root_0, char_literal38_tree);


                    }
                    break;
                case 3 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:87:7: '\"' STRING '\"'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal39=(Token)match(input,12,FOLLOW_12_in_item447); 
                    char_literal39_tree = 
                    (CommonTree)adaptor.create(char_literal39)
                    ;
                    adaptor.addChild(root_0, char_literal39_tree);


                    STRING40=(Token)match(input,STRING,FOLLOW_STRING_in_item449); 
                    STRING40_tree = 
                    (CommonTree)adaptor.create(STRING40)
                    ;
                    adaptor.addChild(root_0, STRING40_tree);


                    char_literal41=(Token)match(input,12,FOLLOW_12_in_item451); 
                    char_literal41_tree = 
                    (CommonTree)adaptor.create(char_literal41)
                    ;
                    adaptor.addChild(root_0, char_literal41_tree);


                    System.out.println(input.toString(retval.start,input.LT(-1))==null?"item-null":input.toString(retval.start,input.LT(-1)));

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "item"


    public static class element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "element"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:92:1: element : ( '<' name attributes '>' rightItems '</>' | '<' name attributes '/>' );
    public final Antlr1Parser.element_return element() throws RecognitionException {
        Antlr1Parser.element_return retval = new Antlr1Parser.element_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal42=null;
        Token char_literal45=null;
        Token string_literal47=null;
        Token char_literal48=null;
        Token string_literal51=null;
        Antlr1Parser.name_return name43 =null;

        Antlr1Parser.attributes_return attributes44 =null;

        Antlr1Parser.rightItems_return rightItems46 =null;

        Antlr1Parser.name_return name49 =null;

        Antlr1Parser.attributes_return attributes50 =null;


        CommonTree char_literal42_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree string_literal51_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:92:9: ( '<' name attributes '>' rightItems '</>' | '<' name attributes '/>' )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:92:11: '<' name attributes '>' rightItems '</>'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal42=(Token)match(input,15,FOLLOW_15_in_element477); 
                    char_literal42_tree = 
                    (CommonTree)adaptor.create(char_literal42)
                    ;
                    adaptor.addChild(root_0, char_literal42_tree);


                    pushFollow(FOLLOW_name_in_element480);
                    name43=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name43.getTree());

                    pushFollow(FOLLOW_attributes_in_element482);
                    attributes44=attributes();

                    state._fsp--;

                    adaptor.addChild(root_0, attributes44.getTree());

                    char_literal45=(Token)match(input,18,FOLLOW_18_in_element486); 
                    char_literal45_tree = 
                    (CommonTree)adaptor.create(char_literal45)
                    ;
                    adaptor.addChild(root_0, char_literal45_tree);


                    pushFollow(FOLLOW_rightItems_in_element488);
                    rightItems46=rightItems();

                    state._fsp--;

                    adaptor.addChild(root_0, rightItems46.getTree());

                    string_literal47=(Token)match(input,16,FOLLOW_16_in_element491); 
                    string_literal47_tree = 
                    (CommonTree)adaptor.create(string_literal47)
                    ;
                    adaptor.addChild(root_0, string_literal47_tree);


                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:93:11: '<' name attributes '/>'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal48=(Token)match(input,15,FOLLOW_15_in_element503); 
                    char_literal48_tree = 
                    (CommonTree)adaptor.create(char_literal48)
                    ;
                    adaptor.addChild(root_0, char_literal48_tree);


                    pushFollow(FOLLOW_name_in_element505);
                    name49=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name49.getTree());

                    pushFollow(FOLLOW_attributes_in_element507);
                    attributes50=attributes();

                    state._fsp--;

                    adaptor.addChild(root_0, attributes50.getTree());

                    string_literal51=(Token)match(input,13,FOLLOW_13_in_element509); 
                    string_literal51_tree = 
                    (CommonTree)adaptor.create(string_literal51)
                    ;
                    adaptor.addChild(root_0, string_literal51_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "element"


    public static class attributes_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributes"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:95:1: attributes : ( attribute )* ;
    public final Antlr1Parser.attributes_return attributes() throws RecognitionException {
        Antlr1Parser.attributes_return retval = new Antlr1Parser.attributes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Antlr1Parser.attribute_return attribute52 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:95:12: ( ( attribute )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:95:14: ( attribute )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:95:14: ( attribute )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= NAME && LA10_0 <= NCNAME)||LA10_0==14||LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:95:14: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes529);
            	    attribute52=attribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribute52.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attributes"


    public static class attribute_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:98:1: attribute : ( NAME '=' '\"' STRING '\"' | name '=' '[' REGEXP optNameOrExample ']' | name '=' '[' NONTERMINAL optNameOrExample ']' );
    public final Antlr1Parser.attribute_return attribute() throws RecognitionException {
        Antlr1Parser.attribute_return retval = new Antlr1Parser.attribute_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NAME53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        Token STRING56=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token REGEXP61=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token NONTERMINAL67=null;
        Token char_literal69=null;
        Antlr1Parser.name_return name58 =null;

        Antlr1Parser.optNameOrExample_return optNameOrExample62 =null;

        Antlr1Parser.name_return name64 =null;

        Antlr1Parser.optNameOrExample_return optNameOrExample68 =null;


        CommonTree NAME53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree STRING56_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree REGEXP61_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree NONTERMINAL67_tree=null;
        CommonTree char_literal69_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:98:11: ( NAME '=' '\"' STRING '\"' | name '=' '[' REGEXP optNameOrExample ']' | name '=' '[' NONTERMINAL optNameOrExample ']' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt11=1;
                }
                break;
            case NCNAME:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==17) ) {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==19) ) {
                        int LA11_8 = input.LA(4);

                        if ( (LA11_8==REGEXP) ) {
                            alt11=2;
                        }
                        else if ( (LA11_8==NONTERMINAL) ) {
                            alt11=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
                }
                break;
            case 14:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==NCNAME) ) {
                    int LA11_6 = input.LA(3);

                    if ( (LA11_6==17) ) {
                        int LA11_5 = input.LA(4);

                        if ( (LA11_5==19) ) {
                            int LA11_8 = input.LA(5);

                            if ( (LA11_8==REGEXP) ) {
                                alt11=2;
                            }
                            else if ( (LA11_8==NONTERMINAL) ) {
                                alt11=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;

                }
                }
                break;
            case 19:
                {
                int LA11_4 = input.LA(2);

                if ( (LA11_4==REGEXP) ) {
                    int LA11_7 = input.LA(3);

                    if ( (LA11_7==NAME) ) {
                        int LA11_9 = input.LA(4);

                        if ( (LA11_9==20) ) {
                            int LA11_13 = input.LA(5);

                            if ( (LA11_13==17) ) {
                                int LA11_5 = input.LA(6);

                                if ( (LA11_5==19) ) {
                                    int LA11_8 = input.LA(7);

                                    if ( (LA11_8==REGEXP) ) {
                                        alt11=2;
                                    }
                                    else if ( (LA11_8==NONTERMINAL) ) {
                                        alt11=3;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 11, 8, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 11, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 13, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 9, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA11_7==12) ) {
                        int LA11_10 = input.LA(4);

                        if ( (LA11_10==STRING) ) {
                            int LA11_14 = input.LA(5);

                            if ( (LA11_14==12) ) {
                                int LA11_15 = input.LA(6);

                                if ( (LA11_15==20) ) {
                                    int LA11_13 = input.LA(7);

                                    if ( (LA11_13==17) ) {
                                        int LA11_5 = input.LA(8);

                                        if ( (LA11_5==19) ) {
                                            int LA11_8 = input.LA(9);

                                            if ( (LA11_8==REGEXP) ) {
                                                alt11=2;
                                            }
                                            else if ( (LA11_8==NONTERMINAL) ) {
                                                alt11=3;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 11, 8, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 11, 5, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 11, 13, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 11, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 14, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 10, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:98:13: NAME '=' '\"' STRING '\"'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NAME53=(Token)match(input,NAME,FOLLOW_NAME_in_attribute560); 
                    NAME53_tree = 
                    (CommonTree)adaptor.create(NAME53)
                    ;
                    adaptor.addChild(root_0, NAME53_tree);


                    char_literal54=(Token)match(input,17,FOLLOW_17_in_attribute562); 
                    char_literal54_tree = 
                    (CommonTree)adaptor.create(char_literal54)
                    ;
                    adaptor.addChild(root_0, char_literal54_tree);


                    char_literal55=(Token)match(input,12,FOLLOW_12_in_attribute564); 
                    char_literal55_tree = 
                    (CommonTree)adaptor.create(char_literal55)
                    ;
                    adaptor.addChild(root_0, char_literal55_tree);


                    STRING56=(Token)match(input,STRING,FOLLOW_STRING_in_attribute566); 
                    STRING56_tree = 
                    (CommonTree)adaptor.create(STRING56)
                    ;
                    adaptor.addChild(root_0, STRING56_tree);


                    char_literal57=(Token)match(input,12,FOLLOW_12_in_attribute568); 
                    char_literal57_tree = 
                    (CommonTree)adaptor.create(char_literal57)
                    ;
                    adaptor.addChild(root_0, char_literal57_tree);


                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:99:11: name '=' '[' REGEXP optNameOrExample ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_name_in_attribute580);
                    name58=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name58.getTree());

                    char_literal59=(Token)match(input,17,FOLLOW_17_in_attribute582); 
                    char_literal59_tree = 
                    (CommonTree)adaptor.create(char_literal59)
                    ;
                    adaptor.addChild(root_0, char_literal59_tree);


                    char_literal60=(Token)match(input,19,FOLLOW_19_in_attribute584); 
                    char_literal60_tree = 
                    (CommonTree)adaptor.create(char_literal60)
                    ;
                    adaptor.addChild(root_0, char_literal60_tree);


                    REGEXP61=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_attribute587); 
                    REGEXP61_tree = 
                    (CommonTree)adaptor.create(REGEXP61)
                    ;
                    adaptor.addChild(root_0, REGEXP61_tree);


                    pushFollow(FOLLOW_optNameOrExample_in_attribute589);
                    optNameOrExample62=optNameOrExample();

                    state._fsp--;

                    adaptor.addChild(root_0, optNameOrExample62.getTree());

                    char_literal63=(Token)match(input,20,FOLLOW_20_in_attribute592); 
                    char_literal63_tree = 
                    (CommonTree)adaptor.create(char_literal63)
                    ;
                    adaptor.addChild(root_0, char_literal63_tree);


                    }
                    break;
                case 3 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:100:12: name '=' '[' NONTERMINAL optNameOrExample ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_name_in_attribute605);
                    name64=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name64.getTree());

                    char_literal65=(Token)match(input,17,FOLLOW_17_in_attribute608); 
                    char_literal65_tree = 
                    (CommonTree)adaptor.create(char_literal65)
                    ;
                    adaptor.addChild(root_0, char_literal65_tree);


                    char_literal66=(Token)match(input,19,FOLLOW_19_in_attribute611); 
                    char_literal66_tree = 
                    (CommonTree)adaptor.create(char_literal66)
                    ;
                    adaptor.addChild(root_0, char_literal66_tree);


                    NONTERMINAL67=(Token)match(input,NONTERMINAL,FOLLOW_NONTERMINAL_in_attribute614); 
                    NONTERMINAL67_tree = 
                    (CommonTree)adaptor.create(NONTERMINAL67)
                    ;
                    adaptor.addChild(root_0, NONTERMINAL67_tree);


                    pushFollow(FOLLOW_optNameOrExample_in_attribute616);
                    optNameOrExample68=optNameOrExample();

                    state._fsp--;

                    adaptor.addChild(root_0, optNameOrExample68.getTree());

                    char_literal69=(Token)match(input,20,FOLLOW_20_in_attribute618); 
                    char_literal69_tree = 
                    (CommonTree)adaptor.create(char_literal69)
                    ;
                    adaptor.addChild(root_0, char_literal69_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:102:1: name : ( NCNAME | ':' NCNAME | '[' REGEXP optNameOrExample ']' );
    public final Antlr1Parser.name_return name() throws RecognitionException {
        Antlr1Parser.name_return retval = new Antlr1Parser.name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NCNAME70=null;
        Token char_literal71=null;
        Token NCNAME72=null;
        Token char_literal73=null;
        Token REGEXP74=null;
        Token char_literal76=null;
        Antlr1Parser.optNameOrExample_return optNameOrExample75 =null;


        CommonTree NCNAME70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree NCNAME72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree REGEXP74_tree=null;
        CommonTree char_literal76_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:102:5: ( NCNAME | ':' NCNAME | '[' REGEXP optNameOrExample ']' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case NCNAME:
                {
                alt12=1;
                }
                break;
            case 14:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:102:7: NCNAME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NCNAME70=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_name625); 
                    NCNAME70_tree = 
                    (CommonTree)adaptor.create(NCNAME70)
                    ;
                    adaptor.addChild(root_0, NCNAME70_tree);


                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:104:7: ':' NCNAME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal71=(Token)match(input,14,FOLLOW_14_in_name637); 
                    char_literal71_tree = 
                    (CommonTree)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);


                    NCNAME72=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_name639); 
                    NCNAME72_tree = 
                    (CommonTree)adaptor.create(NCNAME72)
                    ;
                    adaptor.addChild(root_0, NCNAME72_tree);


                    }
                    break;
                case 3 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:105:8: '[' REGEXP optNameOrExample ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal73=(Token)match(input,19,FOLLOW_19_in_name648); 
                    char_literal73_tree = 
                    (CommonTree)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);


                    REGEXP74=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_name650); 
                    REGEXP74_tree = 
                    (CommonTree)adaptor.create(REGEXP74)
                    ;
                    adaptor.addChild(root_0, REGEXP74_tree);


                    pushFollow(FOLLOW_optNameOrExample_in_name652);
                    optNameOrExample75=optNameOrExample();

                    state._fsp--;

                    adaptor.addChild(root_0, optNameOrExample75.getTree());

                    char_literal76=(Token)match(input,20,FOLLOW_20_in_name655); 
                    char_literal76_tree = 
                    (CommonTree)adaptor.create(char_literal76)
                    ;
                    adaptor.addChild(root_0, char_literal76_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"


    public static class optNameOrExample_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optNameOrExample"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:107:1: optNameOrExample : ( NAME | '\"' STRING '\"' );
    public final Antlr1Parser.optNameOrExample_return optNameOrExample() throws RecognitionException {
        Antlr1Parser.optNameOrExample_return retval = new Antlr1Parser.optNameOrExample_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NAME77=null;
        Token char_literal78=null;
        Token STRING79=null;
        Token char_literal80=null;

        CommonTree NAME77_tree=null;
        CommonTree char_literal78_tree=null;
        CommonTree STRING79_tree=null;
        CommonTree char_literal80_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:107:19: ( NAME | '\"' STRING '\"' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NAME) ) {
                alt13=1;
            }
            else if ( (LA13_0==12) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:107:22: NAME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NAME77=(Token)match(input,NAME,FOLLOW_NAME_in_optNameOrExample680); 
                    NAME77_tree = 
                    (CommonTree)adaptor.create(NAME77)
                    ;
                    adaptor.addChild(root_0, NAME77_tree);


                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial+print\\Antlr1.g:108:19: '\"' STRING '\"'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal78=(Token)match(input,12,FOLLOW_12_in_optNameOrExample700); 
                    char_literal78_tree = 
                    (CommonTree)adaptor.create(char_literal78)
                    ;
                    adaptor.addChild(root_0, char_literal78_tree);


                    STRING79=(Token)match(input,STRING,FOLLOW_STRING_in_optNameOrExample702); 
                    STRING79_tree = 
                    (CommonTree)adaptor.create(STRING79)
                    ;
                    adaptor.addChild(root_0, STRING79_tree);


                    char_literal80=(Token)match(input,12,FOLLOW_12_in_optNameOrExample704); 
                    char_literal80_tree = 
                    (CommonTree)adaptor.create(char_literal80)
                    ;
                    adaptor.addChild(root_0, char_literal80_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optNameOrExample"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\53\uffff";
    static final String DFA9_eofS =
        "\53\uffff";
    static final String DFA9_minS =
        "\1\17\1\5\1\4\1\5\1\11\2\21\1\5\1\11\2\uffff\2\4\1\14\1\23\1\21"+
        "\1\4\1\24\2\12\1\6\1\24\1\12\1\4\2\14\2\4\1\21\1\14\1\24\1\4\1\24"+
        "\1\12\1\24\1\12\1\24\1\4\1\14\1\4\1\14\2\24";
    static final String DFA9_maxS =
        "\1\17\2\23\1\5\1\11\2\21\1\5\1\11\2\uffff\1\23\2\14\1\23\1\21\1"+
        "\14\1\24\2\12\1\11\1\24\1\12\1\23\4\14\1\21\1\14\1\24\1\23\1\24"+
        "\1\12\1\24\1\12\1\24\1\23\1\14\1\23\1\14\2\24";
    static final String DFA9_acceptS =
        "\11\uffff\1\1\1\2\40\uffff";
    static final String DFA9_specialS =
        "\53\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\2\10\uffff\1\3\4\uffff\1\4",
            "\1\5\1\6\7\uffff\1\12\1\7\3\uffff\1\11\1\10",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "",
            "\1\5\1\6\7\uffff\1\12\1\7\3\uffff\1\11\1\10",
            "\1\21\7\uffff\1\22",
            "\1\23",
            "\1\24",
            "\1\16",
            "\1\25\7\uffff\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\33\2\uffff\1\32",
            "\1\34",
            "\1\35",
            "\1\5\1\6\7\uffff\1\12\1\7\3\uffff\1\11\1\10",
            "\1\36",
            "\1\37",
            "\1\40\7\uffff\1\41",
            "\1\42\7\uffff\1\43",
            "\1\16",
            "\1\44",
            "\1\27",
            "\1\5\1\6\7\uffff\1\12\1\7\3\uffff\1\11\1\10",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\34",
            "\1\5\1\6\7\uffff\1\12\1\7\3\uffff\1\11\1\10",
            "\1\51",
            "\1\5\1\6\7\uffff\1\12\1\7\3\uffff\1\11\1\10",
            "\1\52",
            "\1\45",
            "\1\47"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "92:1: element : ( '<' name attributes '>' rightItems '</>' | '<' name attributes '/>' );";
        }
    }
 

    public static final BitSet FOLLOW_stat_in_prog44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_includes_in_stat85 = new BitSet(new long[]{0x0000000000400240L});
    public static final BitSet FOLLOW_namespaceDecls_in_stat87 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_regexpDefs_in_stat89 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_productions_in_stat91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_in_includes100 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_include121 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_include123 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_include125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceDecl_in_namespaceDecls133 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_namespaceDecl154 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_namespaceDecl156 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_namespaceDecl158 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_namespaceDecl160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexpDef_in_regexpDefs170 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_REGEXP_in_regexpDef202 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_regexpDef205 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REGEXP_in_regexpDef208 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_OPTMAX_in_regexpDef214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_production_in_productions225 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_optNonterminal_in_production272 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_production274 = new BitSet(new long[]{0x0000000000089000L});
    public static final BitSet FOLLOW_leftItems_in_production276 = new BitSet(new long[]{0x0000000000089000L});
    public static final BitSet FOLLOW_rightItems_in_production278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONTERMINAL_in_optNonterminal295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftItem_in_leftItems334 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_rightItem_in_rightItems352 = new BitSet(new long[]{0x0000000000089002L});
    public static final BitSet FOLLOW_item_in_leftItem365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_in_rightItem377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_rightItem389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_item414 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NONTERMINAL_in_item416 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_item419 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_item421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_item430 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REGEXP_in_item433 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_item435 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_item438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_item447 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_item449 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_element477 = new BitSet(new long[]{0x0000000000084020L});
    public static final BitSet FOLLOW_name_in_element480 = new BitSet(new long[]{0x00000000000C4030L});
    public static final BitSet FOLLOW_attributes_in_element482 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_element486 = new BitSet(new long[]{0x0000000000099000L});
    public static final BitSet FOLLOW_rightItems_in_element488 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_element491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_element503 = new BitSet(new long[]{0x0000000000084020L});
    public static final BitSet FOLLOW_name_in_element505 = new BitSet(new long[]{0x0000000000086030L});
    public static final BitSet FOLLOW_attributes_in_element507 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_element509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes529 = new BitSet(new long[]{0x0000000000084032L});
    public static final BitSet FOLLOW_NAME_in_attribute560 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_attribute562 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_attribute564 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_attribute566 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_attribute568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_attribute580 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_attribute582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_attribute584 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REGEXP_in_attribute587 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_attribute589 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_attribute592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_attribute605 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_attribute608 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_attribute611 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NONTERMINAL_in_attribute614 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_attribute616 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_attribute618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCNAME_in_name625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_name637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NCNAME_in_name639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_name648 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REGEXP_in_name650 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_name652 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_name655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_optNameOrExample680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_optNameOrExample700 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_optNameOrExample702 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_optNameOrExample704 = new BitSet(new long[]{0x0000000000000002L});

}
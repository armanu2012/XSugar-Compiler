// $ANTLR 3.4 A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g 2012-06-24 20:05:19

import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AntlrParser extends Parser {
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


    public AntlrParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AntlrParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AntlrParser.tokenNames; }
    public String getGrammarFileName() { return "A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g"; }


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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:31:1: prog : includes namespaceDecls regexpDefs productions ->;
    public final AntlrParser.prog_return prog() throws RecognitionException {
        AntlrParser.prog_return retval = new AntlrParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.includes_return includes1 =null;

        AntlrParser.namespaceDecls_return namespaceDecls2 =null;

        AntlrParser.regexpDefs_return regexpDefs3 =null;

        AntlrParser.productions_return productions4 =null;


        RewriteRuleSubtreeStream stream_regexpDefs=new RewriteRuleSubtreeStream(adaptor,"rule regexpDefs");
        RewriteRuleSubtreeStream stream_namespaceDecls=new RewriteRuleSubtreeStream(adaptor,"rule namespaceDecls");
        RewriteRuleSubtreeStream stream_includes=new RewriteRuleSubtreeStream(adaptor,"rule includes");
        RewriteRuleSubtreeStream stream_productions=new RewriteRuleSubtreeStream(adaptor,"rule productions");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:31:6: ( includes namespaceDecls regexpDefs productions ->)
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:31:8: includes namespaceDecls regexpDefs productions
            {
            pushFollow(FOLLOW_includes_in_prog50);
            includes1=includes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_includes.add(includes1.getTree());

            pushFollow(FOLLOW_namespaceDecls_in_prog52);
            namespaceDecls2=namespaceDecls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_namespaceDecls.add(namespaceDecls2.getTree());

            pushFollow(FOLLOW_regexpDefs_in_prog54);
            regexpDefs3=regexpDefs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_regexpDefs.add(regexpDefs3.getTree());

            pushFollow(FOLLOW_productions_in_prog56);
            productions4=productions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_productions.add(productions4.getTree());

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 31:55: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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


    public static class includes_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includes"
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:32:1: includes : ( include )* ->;
    public final AntlrParser.includes_return includes() throws RecognitionException {
        AntlrParser.includes_return retval = new AntlrParser.includes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.include_return include5 =null;


        RewriteRuleSubtreeStream stream_include=new RewriteRuleSubtreeStream(adaptor,"rule include");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:32:9: ( ( include )* ->)
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:32:11: ( include )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:32:11: ( include )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:32:11: include
            	    {
            	    pushFollow(FOLLOW_include_in_includes64);
            	    include5=include();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_include.add(include5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 32:21: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:34:1: include : 'include' '\"' '\"' ->;
    public final AntlrParser.include_return include() throws RecognitionException {
        AntlrParser.include_return retval = new AntlrParser.include_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal6=null;
        Token char_literal7=null;
        Token char_literal8=null;

        CommonTree string_literal6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:34:9: ( 'include' '\"' '\"' ->)
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:34:11: 'include' '\"' '\"'
            {
            string_literal6=(Token)match(input,21,FOLLOW_21_in_include82); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_21.add(string_literal6);


            char_literal7=(Token)match(input,12,FOLLOW_12_in_include84); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_12.add(char_literal7);


            char_literal8=(Token)match(input,12,FOLLOW_12_in_include86); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_12.add(char_literal8);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 34:29: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:36:1: namespaceDecls : ( namespaceDecl )* ->;
    public final AntlrParser.namespaceDecls_return namespaceDecls() throws RecognitionException {
        AntlrParser.namespaceDecls_return retval = new AntlrParser.namespaceDecls_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.namespaceDecl_return namespaceDecl9 =null;


        RewriteRuleSubtreeStream stream_namespaceDecl=new RewriteRuleSubtreeStream(adaptor,"rule namespaceDecl");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:36:15: ( ( namespaceDecl )* ->)
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:36:17: ( namespaceDecl )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:36:17: ( namespaceDecl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:36:17: namespaceDecl
            	    {
            	    pushFollow(FOLLOW_namespaceDecl_in_namespaceDecls95);
            	    namespaceDecl9=namespaceDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_namespaceDecl.add(namespaceDecl9.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:32: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:39:1: namespaceDecl : 'xmlns' '=' '\"' '\"' ->;
    public final AntlrParser.namespaceDecl_return namespaceDecl() throws RecognitionException {
        AntlrParser.namespaceDecl_return retval = new AntlrParser.namespaceDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal10=null;
        Token char_literal11=null;
        Token char_literal12=null;
        Token char_literal13=null;

        CommonTree string_literal10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:39:15: ( 'xmlns' '=' '\"' '\"' ->)
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:39:17: 'xmlns' '=' '\"' '\"'
            {
            string_literal10=(Token)match(input,22,FOLLOW_22_in_namespaceDecl117); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(string_literal10);


            char_literal11=(Token)match(input,17,FOLLOW_17_in_namespaceDecl119); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_17.add(char_literal11);


            char_literal12=(Token)match(input,12,FOLLOW_12_in_namespaceDecl121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_12.add(char_literal12);


            char_literal13=(Token)match(input,12,FOLLOW_12_in_namespaceDecl123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_12.add(char_literal13);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 39:37: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:41:1: regexpDefs : ( regexpDef )* ->;
    public final AntlrParser.regexpDefs_return regexpDefs() throws RecognitionException {
        AntlrParser.regexpDefs_return retval = new AntlrParser.regexpDefs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.regexpDef_return regexpDef14 =null;


        RewriteRuleSubtreeStream stream_regexpDef=new RewriteRuleSubtreeStream(adaptor,"rule regexpDef");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:41:13: ( ( regexpDef )* ->)
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:41:15: ( regexpDef )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:41:15: ( regexpDef )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==REGEXP) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:41:15: regexpDef
            	    {
            	    pushFollow(FOLLOW_regexpDef_in_regexpDefs134);
            	    regexpDef14=regexpDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_regexpDef.add(regexpDef14.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 41:26: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:44:1: regexpDef : REGEXP '=' REGEXP OPTMAX ->;
    public final AntlrParser.regexpDef_return regexpDef() throws RecognitionException {
        AntlrParser.regexpDef_return retval = new AntlrParser.regexpDef_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REGEXP15=null;
        Token char_literal16=null;
        Token REGEXP17=null;
        Token OPTMAX18=null;

        CommonTree REGEXP15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree REGEXP17_tree=null;
        CommonTree OPTMAX18_tree=null;
        RewriteRuleTokenStream stream_REGEXP=new RewriteRuleTokenStream(adaptor,"token REGEXP");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_OPTMAX=new RewriteRuleTokenStream(adaptor,"token OPTMAX");

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:44:11: ( REGEXP '=' REGEXP OPTMAX ->)
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:44:13: REGEXP '=' REGEXP OPTMAX
            {
            REGEXP15=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_regexpDef164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REGEXP.add(REGEXP15);


            char_literal16=(Token)match(input,17,FOLLOW_17_in_regexpDef167); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_17.add(char_literal16);


            REGEXP17=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_regexpDef170); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REGEXP.add(REGEXP17);


            OPTMAX18=(Token)match(input,OPTMAX,FOLLOW_OPTMAX_in_regexpDef176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPTMAX.add(OPTMAX18);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 45:12: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:52:1: productions : ( production )* ->;
    public final AntlrParser.productions_return productions() throws RecognitionException {
        AntlrParser.productions_return retval = new AntlrParser.productions_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.production_return production19 =null;


        RewriteRuleSubtreeStream stream_production=new RewriteRuleSubtreeStream(adaptor,"rule production");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:52:13: ( ( production )* ->)
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:52:15: ( production )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:52:15: ( production )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NONTERMINAL) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:52:15: production
            	    {
            	    pushFollow(FOLLOW_production_in_productions189);
            	    production19=production();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_production.add(production19.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 52:27: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:56:1: production : optNonterminal ':' leftItems rightItems -> ^( optNonterminal leftItems rightItems ) ;
    public final AntlrParser.production_return production() throws RecognitionException {
        AntlrParser.production_return retval = new AntlrParser.production_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal21=null;
        AntlrParser.optNonterminal_return optNonterminal20 =null;

        AntlrParser.leftItems_return leftItems22 =null;

        AntlrParser.rightItems_return rightItems23 =null;


        CommonTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_rightItems=new RewriteRuleSubtreeStream(adaptor,"rule rightItems");
        RewriteRuleSubtreeStream stream_leftItems=new RewriteRuleSubtreeStream(adaptor,"rule leftItems");
        RewriteRuleSubtreeStream stream_optNonterminal=new RewriteRuleSubtreeStream(adaptor,"rule optNonterminal");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:56:12: ( optNonterminal ':' leftItems rightItems -> ^( optNonterminal leftItems rightItems ) )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:56:14: optNonterminal ':' leftItems rightItems
            {
            pushFollow(FOLLOW_optNonterminal_in_production237);
            optNonterminal20=optNonterminal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_optNonterminal.add(optNonterminal20.getTree());

            char_literal21=(Token)match(input,14,FOLLOW_14_in_production239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_14.add(char_literal21);


            pushFollow(FOLLOW_leftItems_in_production241);
            leftItems22=leftItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_leftItems.add(leftItems22.getTree());

            pushFollow(FOLLOW_rightItems_in_production243);
            rightItems23=rightItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rightItems.add(rightItems23.getTree());

            // AST REWRITE
            // elements: leftItems, optNonterminal, rightItems
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:2: -> ^( optNonterminal leftItems rightItems )
            {
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:57:5: ^( optNonterminal leftItems rightItems )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_optNonterminal.nextNode(), root_1);

                adaptor.addChild(root_1, stream_leftItems.nextTree());

                adaptor.addChild(root_1, stream_rightItems.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:59:1: optNonterminal : NONTERMINAL ;
    public final AntlrParser.optNonterminal_return optNonterminal() throws RecognitionException {
        AntlrParser.optNonterminal_return retval = new AntlrParser.optNonterminal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NONTERMINAL24=null;

        CommonTree NONTERMINAL24_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:59:16: ( NONTERMINAL )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:59:18: NONTERMINAL
            {
            NONTERMINAL24=(Token)match(input,NONTERMINAL,FOLLOW_NONTERMINAL_in_optNonterminal263); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NONTERMINAL24_tree = 
            (CommonTree)adaptor.create(NONTERMINAL24)
            ;
            adaptor.addChild(root_0, NONTERMINAL24_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:62:2: leftItems : ( leftItem )* -> ^( leftItem ) ;
    public final AntlrParser.leftItems_return leftItems() throws RecognitionException {
        AntlrParser.leftItems_return retval = new AntlrParser.leftItems_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.leftItem_return leftItem25 =null;


        RewriteRuleSubtreeStream stream_leftItem=new RewriteRuleSubtreeStream(adaptor,"rule leftItem");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:62:12: ( ( leftItem )* -> ^( leftItem ) )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:62:14: ( leftItem )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:62:14: ( leftItem )*
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
                                int LA5_12 = input.LA(5);

                                if ( (synpred5_Antlr()) ) {
                                    alt5=1;
                                }


                            }


                        }
                        else if ( (LA5_4==12) ) {
                            int LA5_8 = input.LA(4);

                            if ( (LA5_8==STRING) ) {
                                int LA5_13 = input.LA(5);

                                if ( (LA5_13==12) ) {
                                    int LA5_17 = input.LA(6);

                                    if ( (LA5_17==20) ) {
                                        int LA5_19 = input.LA(7);

                                        if ( (synpred5_Antlr()) ) {
                                            alt5=1;
                                        }


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
                                int LA5_14 = input.LA(5);

                                if ( (synpred5_Antlr()) ) {
                                    alt5=1;
                                }


                            }


                        }
                        else if ( (LA5_5==12) ) {
                            int LA5_10 = input.LA(4);

                            if ( (LA5_10==STRING) ) {
                                int LA5_15 = input.LA(5);

                                if ( (LA5_15==12) ) {
                                    int LA5_18 = input.LA(6);

                                    if ( (LA5_18==20) ) {
                                        int LA5_20 = input.LA(7);

                                        if ( (synpred5_Antlr()) ) {
                                            alt5=1;
                                        }


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
                            int LA5_11 = input.LA(4);

                            if ( (synpred5_Antlr()) ) {
                                alt5=1;
                            }


                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:62:14: leftItem
            	    {
            	    pushFollow(FOLLOW_leftItem_in_leftItems302);
            	    leftItem25=leftItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_leftItem.add(leftItem25.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: leftItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 62:25: -> ^( leftItem )
            {
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:62:28: ^( leftItem )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_leftItem.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:65:1: rightItems : ( rightItem )* -> ^( rightItem ) ;
    public final AntlrParser.rightItems_return rightItems() throws RecognitionException {
        AntlrParser.rightItems_return retval = new AntlrParser.rightItems_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.rightItem_return rightItem26 =null;


        RewriteRuleSubtreeStream stream_rightItem=new RewriteRuleSubtreeStream(adaptor,"rule rightItem");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:65:11: ( ( rightItem )* -> ^( rightItem ) )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:65:13: ( rightItem )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:65:13: ( rightItem )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||LA6_0==15||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:65:13: rightItem
            	    {
            	    pushFollow(FOLLOW_rightItem_in_rightItems327);
            	    rightItem26=rightItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rightItem.add(rightItem26.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: rightItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 65:24: -> ^( rightItem )
            {
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:65:27: ^( rightItem )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_rightItem.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:68:1: leftItem : item -> item ;
    public final AntlrParser.leftItem_return leftItem() throws RecognitionException {
        AntlrParser.leftItem_return retval = new AntlrParser.leftItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.item_return item27 =null;


        RewriteRuleSubtreeStream stream_item=new RewriteRuleSubtreeStream(adaptor,"rule item");
        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:68:10: ( item -> item )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:68:12: item
            {
            pushFollow(FOLLOW_item_in_leftItem345);
            item27=item();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_item.add(item27.getTree());

            // AST REWRITE
            // elements: item
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:17: -> item
            {
                adaptor.addChild(root_0, stream_item.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:70:1: rightItem : ( item | element );
    public final AntlrParser.rightItem_return rightItem() throws RecognitionException {
        AntlrParser.rightItem_return retval = new AntlrParser.rightItem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.item_return item28 =null;

        AntlrParser.element_return element29 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:70:11: ( item | element )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12||LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:70:13: item
                    {
                    pushFollow(FOLLOW_item_in_rightItem357);
                    item28=item();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, item28.getTree());

                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:71:11: element
                    {
                    pushFollow(FOLLOW_element_in_rightItem369);
                    element29=element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, element29.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:74:1: item : ( '[' NONTERMINAL optNameOrExample ']' | '[' REGEXP optNameOrExample ']' | '\"' STRING '\"' );
    public final AntlrParser.item_return item() throws RecognitionException {
        AntlrParser.item_return retval = new AntlrParser.item_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal30=null;
        Token NONTERMINAL31=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token REGEXP35=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token STRING39=null;
        Token char_literal40=null;
        AntlrParser.optNameOrExample_return optNameOrExample32 =null;

        AntlrParser.optNameOrExample_return optNameOrExample36 =null;


        CommonTree char_literal30_tree=null;
        CommonTree NONTERMINAL31_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree REGEXP35_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree STRING39_tree=null;
        CommonTree char_literal40_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:74:12: ( '[' NONTERMINAL optNameOrExample ']' | '[' REGEXP optNameOrExample ']' | '\"' STRING '\"' )
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA8_0==12) ) {
                alt8=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:74:14: '[' NONTERMINAL optNameOrExample ']'
                    {
                    char_literal30=(Token)match(input,19,FOLLOW_19_in_item394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal30_tree = 
                    (CommonTree)adaptor.create(char_literal30)
                    ;
                    adaptor.addChild(root_0, char_literal30_tree);
                    }

                    NONTERMINAL31=(Token)match(input,NONTERMINAL,FOLLOW_NONTERMINAL_in_item396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NONTERMINAL31_tree = 
                    (CommonTree)adaptor.create(NONTERMINAL31)
                    ;
                    adaptor.addChild(root_0, NONTERMINAL31_tree);
                    }

                    pushFollow(FOLLOW_optNameOrExample_in_item399);
                    optNameOrExample32=optNameOrExample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, optNameOrExample32.getTree());

                    char_literal33=(Token)match(input,20,FOLLOW_20_in_item401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal33_tree = 
                    (CommonTree)adaptor.create(char_literal33)
                    ;
                    adaptor.addChild(root_0, char_literal33_tree);
                    }

                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:75:8: '[' REGEXP optNameOrExample ']'
                    {
                    char_literal34=(Token)match(input,19,FOLLOW_19_in_item410); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal34_tree = 
                    (CommonTree)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);
                    }

                    REGEXP35=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_item413); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXP35_tree = 
                    (CommonTree)adaptor.create(REGEXP35)
                    ;
                    adaptor.addChild(root_0, REGEXP35_tree);
                    }

                    pushFollow(FOLLOW_optNameOrExample_in_item415);
                    optNameOrExample36=optNameOrExample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, optNameOrExample36.getTree());

                    char_literal37=(Token)match(input,20,FOLLOW_20_in_item418); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal37_tree = 
                    (CommonTree)adaptor.create(char_literal37)
                    ;
                    adaptor.addChild(root_0, char_literal37_tree);
                    }

                    }
                    break;
                case 3 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:76:7: '\"' STRING '\"'
                    {
                    char_literal38=(Token)match(input,12,FOLLOW_12_in_item427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal38_tree = 
                    (CommonTree)adaptor.create(char_literal38)
                    ;
                    adaptor.addChild(root_0, char_literal38_tree);
                    }

                    STRING39=(Token)match(input,STRING,FOLLOW_STRING_in_item429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING39_tree = 
                    (CommonTree)adaptor.create(STRING39)
                    ;
                    adaptor.addChild(root_0, STRING39_tree);
                    }

                    char_literal40=(Token)match(input,12,FOLLOW_12_in_item431); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal40_tree = 
                    (CommonTree)adaptor.create(char_literal40)
                    ;
                    adaptor.addChild(root_0, char_literal40_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:81:1: element : ( '<' name attributes '>' rightItems '</>' | '<' name attributes '/>' );
    public final AntlrParser.element_return element() throws RecognitionException {
        AntlrParser.element_return retval = new AntlrParser.element_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal41=null;
        Token char_literal44=null;
        Token string_literal46=null;
        Token char_literal47=null;
        Token string_literal50=null;
        AntlrParser.name_return name42 =null;

        AntlrParser.attributes_return attributes43 =null;

        AntlrParser.rightItems_return rightItems45 =null;

        AntlrParser.name_return name48 =null;

        AntlrParser.attributes_return attributes49 =null;


        CommonTree char_literal41_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree string_literal50_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:81:9: ( '<' name attributes '>' rightItems '</>' | '<' name attributes '/>' )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:81:11: '<' name attributes '>' rightItems '</>'
                    {
                    char_literal41=(Token)match(input,15,FOLLOW_15_in_element455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal41_tree = 
                    (CommonTree)adaptor.create(char_literal41)
                    ;
                    adaptor.addChild(root_0, char_literal41_tree);
                    }

                    pushFollow(FOLLOW_name_in_element458);
                    name42=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name42.getTree());

                    pushFollow(FOLLOW_attributes_in_element460);
                    attributes43=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes43.getTree());

                    char_literal44=(Token)match(input,18,FOLLOW_18_in_element464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = 
                    (CommonTree)adaptor.create(char_literal44)
                    ;
                    adaptor.addChild(root_0, char_literal44_tree);
                    }

                    pushFollow(FOLLOW_rightItems_in_element466);
                    rightItems45=rightItems();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rightItems45.getTree());

                    string_literal46=(Token)match(input,16,FOLLOW_16_in_element469); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal46_tree = 
                    (CommonTree)adaptor.create(string_literal46)
                    ;
                    adaptor.addChild(root_0, string_literal46_tree);
                    }

                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:82:11: '<' name attributes '/>'
                    {
                    char_literal47=(Token)match(input,15,FOLLOW_15_in_element481); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal47_tree = 
                    (CommonTree)adaptor.create(char_literal47)
                    ;
                    adaptor.addChild(root_0, char_literal47_tree);
                    }

                    pushFollow(FOLLOW_name_in_element483);
                    name48=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name48.getTree());

                    pushFollow(FOLLOW_attributes_in_element485);
                    attributes49=attributes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributes49.getTree());

                    string_literal50=(Token)match(input,13,FOLLOW_13_in_element487); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal50_tree = 
                    (CommonTree)adaptor.create(string_literal50)
                    ;
                    adaptor.addChild(root_0, string_literal50_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:84:1: attributes : ( attribute )* ;
    public final AntlrParser.attributes_return attributes() throws RecognitionException {
        AntlrParser.attributes_return retval = new AntlrParser.attributes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AntlrParser.attribute_return attribute51 =null;



        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:84:12: ( ( attribute )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:84:14: ( attribute )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:84:14: ( attribute )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= NAME && LA10_0 <= NCNAME)||LA10_0==14||LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:84:14: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_attributes507);
            	    attribute51=attribute();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute51.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:87:1: attribute : ( NAME '=' '\"' STRING '\"' | name '=' '[' REGEXP optNameOrExample ']' | name '=' '[' NONTERMINAL optNameOrExample ']' );
    public final AntlrParser.attribute_return attribute() throws RecognitionException {
        AntlrParser.attribute_return retval = new AntlrParser.attribute_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NAME52=null;
        Token char_literal53=null;
        Token char_literal54=null;
        Token STRING55=null;
        Token char_literal56=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token REGEXP60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token NONTERMINAL66=null;
        Token char_literal68=null;
        AntlrParser.name_return name57 =null;

        AntlrParser.optNameOrExample_return optNameOrExample61 =null;

        AntlrParser.name_return name63 =null;

        AntlrParser.optNameOrExample_return optNameOrExample67 =null;


        CommonTree NAME52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree STRING55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree REGEXP60_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree char_literal64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree NONTERMINAL66_tree=null;
        CommonTree char_literal68_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:87:11: ( NAME '=' '\"' STRING '\"' | name '=' '[' REGEXP optNameOrExample ']' | name '=' '[' NONTERMINAL optNameOrExample ']' )
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
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 11, 8, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 11, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 13, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
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
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 11, 8, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return retval;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 11, 5, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 11, 13, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 11, 15, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 14, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 10, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 7, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:87:13: NAME '=' '\"' STRING '\"'
                    {
                    NAME52=(Token)match(input,NAME,FOLLOW_NAME_in_attribute538); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME52_tree = 
                    (CommonTree)adaptor.create(NAME52)
                    ;
                    adaptor.addChild(root_0, NAME52_tree);
                    }

                    char_literal53=(Token)match(input,17,FOLLOW_17_in_attribute540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal53_tree = 
                    (CommonTree)adaptor.create(char_literal53)
                    ;
                    adaptor.addChild(root_0, char_literal53_tree);
                    }

                    char_literal54=(Token)match(input,12,FOLLOW_12_in_attribute542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = 
                    (CommonTree)adaptor.create(char_literal54)
                    ;
                    adaptor.addChild(root_0, char_literal54_tree);
                    }

                    STRING55=(Token)match(input,STRING,FOLLOW_STRING_in_attribute544); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING55_tree = 
                    (CommonTree)adaptor.create(STRING55)
                    ;
                    adaptor.addChild(root_0, STRING55_tree);
                    }

                    char_literal56=(Token)match(input,12,FOLLOW_12_in_attribute546); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = 
                    (CommonTree)adaptor.create(char_literal56)
                    ;
                    adaptor.addChild(root_0, char_literal56_tree);
                    }

                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:88:11: name '=' '[' REGEXP optNameOrExample ']'
                    {
                    pushFollow(FOLLOW_name_in_attribute558);
                    name57=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name57.getTree());

                    char_literal58=(Token)match(input,17,FOLLOW_17_in_attribute560); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = 
                    (CommonTree)adaptor.create(char_literal58)
                    ;
                    adaptor.addChild(root_0, char_literal58_tree);
                    }

                    char_literal59=(Token)match(input,19,FOLLOW_19_in_attribute562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal59_tree = 
                    (CommonTree)adaptor.create(char_literal59)
                    ;
                    adaptor.addChild(root_0, char_literal59_tree);
                    }

                    REGEXP60=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_attribute565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXP60_tree = 
                    (CommonTree)adaptor.create(REGEXP60)
                    ;
                    adaptor.addChild(root_0, REGEXP60_tree);
                    }

                    pushFollow(FOLLOW_optNameOrExample_in_attribute567);
                    optNameOrExample61=optNameOrExample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, optNameOrExample61.getTree());

                    char_literal62=(Token)match(input,20,FOLLOW_20_in_attribute570); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal62_tree = 
                    (CommonTree)adaptor.create(char_literal62)
                    ;
                    adaptor.addChild(root_0, char_literal62_tree);
                    }

                    }
                    break;
                case 3 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:89:12: name '=' '[' NONTERMINAL optNameOrExample ']'
                    {
                    pushFollow(FOLLOW_name_in_attribute583);
                    name63=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name63.getTree());

                    char_literal64=(Token)match(input,17,FOLLOW_17_in_attribute586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = 
                    (CommonTree)adaptor.create(char_literal64)
                    ;
                    adaptor.addChild(root_0, char_literal64_tree);
                    }

                    char_literal65=(Token)match(input,19,FOLLOW_19_in_attribute589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = 
                    (CommonTree)adaptor.create(char_literal65)
                    ;
                    adaptor.addChild(root_0, char_literal65_tree);
                    }

                    NONTERMINAL66=(Token)match(input,NONTERMINAL,FOLLOW_NONTERMINAL_in_attribute592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NONTERMINAL66_tree = 
                    (CommonTree)adaptor.create(NONTERMINAL66)
                    ;
                    adaptor.addChild(root_0, NONTERMINAL66_tree);
                    }

                    pushFollow(FOLLOW_optNameOrExample_in_attribute594);
                    optNameOrExample67=optNameOrExample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, optNameOrExample67.getTree());

                    char_literal68=(Token)match(input,20,FOLLOW_20_in_attribute596); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal68_tree = 
                    (CommonTree)adaptor.create(char_literal68)
                    ;
                    adaptor.addChild(root_0, char_literal68_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:91:1: name : ( NCNAME | ':' NCNAME | '[' REGEXP optNameOrExample ']' );
    public final AntlrParser.name_return name() throws RecognitionException {
        AntlrParser.name_return retval = new AntlrParser.name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NCNAME69=null;
        Token char_literal70=null;
        Token NCNAME71=null;
        Token char_literal72=null;
        Token REGEXP73=null;
        Token char_literal75=null;
        AntlrParser.optNameOrExample_return optNameOrExample74 =null;


        CommonTree NCNAME69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree NCNAME71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree REGEXP73_tree=null;
        CommonTree char_literal75_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:91:5: ( NCNAME | ':' NCNAME | '[' REGEXP optNameOrExample ']' )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:91:7: NCNAME
                    {
                    NCNAME69=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_name603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NCNAME69_tree = 
                    (CommonTree)adaptor.create(NCNAME69)
                    ;
                    adaptor.addChild(root_0, NCNAME69_tree);
                    }

                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:93:7: ':' NCNAME
                    {
                    char_literal70=(Token)match(input,14,FOLLOW_14_in_name615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal70_tree = 
                    (CommonTree)adaptor.create(char_literal70)
                    ;
                    adaptor.addChild(root_0, char_literal70_tree);
                    }

                    NCNAME71=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_name617); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NCNAME71_tree = 
                    (CommonTree)adaptor.create(NCNAME71)
                    ;
                    adaptor.addChild(root_0, NCNAME71_tree);
                    }

                    }
                    break;
                case 3 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:94:8: '[' REGEXP optNameOrExample ']'
                    {
                    char_literal72=(Token)match(input,19,FOLLOW_19_in_name626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal72_tree = 
                    (CommonTree)adaptor.create(char_literal72)
                    ;
                    adaptor.addChild(root_0, char_literal72_tree);
                    }

                    REGEXP73=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_name628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXP73_tree = 
                    (CommonTree)adaptor.create(REGEXP73)
                    ;
                    adaptor.addChild(root_0, REGEXP73_tree);
                    }

                    pushFollow(FOLLOW_optNameOrExample_in_name630);
                    optNameOrExample74=optNameOrExample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, optNameOrExample74.getTree());

                    char_literal75=(Token)match(input,20,FOLLOW_20_in_name633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal75_tree = 
                    (CommonTree)adaptor.create(char_literal75)
                    ;
                    adaptor.addChild(root_0, char_literal75_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:96:1: optNameOrExample : ( NAME | '\"' STRING '\"' );
    public final AntlrParser.optNameOrExample_return optNameOrExample() throws RecognitionException {
        AntlrParser.optNameOrExample_return retval = new AntlrParser.optNameOrExample_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NAME76=null;
        Token char_literal77=null;
        Token STRING78=null;
        Token char_literal79=null;

        CommonTree NAME76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree STRING78_tree=null;
        CommonTree char_literal79_tree=null;

        try {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:96:19: ( NAME | '\"' STRING '\"' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NAME) ) {
                alt13=1;
            }
            else if ( (LA13_0==12) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:96:22: NAME
                    {
                    NAME76=(Token)match(input,NAME,FOLLOW_NAME_in_optNameOrExample658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME76_tree = 
                    (CommonTree)adaptor.create(NAME76)
                    ;
                    adaptor.addChild(root_0, NAME76_tree);
                    }

                    }
                    break;
                case 2 :
                    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:97:19: '\"' STRING '\"'
                    {
                    char_literal77=(Token)match(input,12,FOLLOW_12_in_optNameOrExample678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = 
                    (CommonTree)adaptor.create(char_literal77)
                    ;
                    adaptor.addChild(root_0, char_literal77_tree);
                    }

                    STRING78=(Token)match(input,STRING,FOLLOW_STRING_in_optNameOrExample680); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING78_tree = 
                    (CommonTree)adaptor.create(STRING78)
                    ;
                    adaptor.addChild(root_0, STRING78_tree);
                    }

                    char_literal79=(Token)match(input,12,FOLLOW_12_in_optNameOrExample682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal79_tree = 
                    (CommonTree)adaptor.create(char_literal79)
                    ;
                    adaptor.addChild(root_0, char_literal79_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    // $ANTLR start synpred5_Antlr
    public final void synpred5_Antlr_fragment() throws RecognitionException {
        // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:62:14: ( leftItem )
        // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-AST\\Antlr.g:62:14: leftItem
        {
        pushFollow(FOLLOW_leftItem_in_synpred5_Antlr302);
        leftItem();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Antlr

    // Delegated rules

    public final boolean synpred5_Antlr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Antlr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


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
            return "81:1: element : ( '<' name attributes '>' rightItems '</>' | '<' name attributes '/>' );";
        }
    }
 

    public static final BitSet FOLLOW_includes_in_prog50 = new BitSet(new long[]{0x0000000000400240L});
    public static final BitSet FOLLOW_namespaceDecls_in_prog52 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_regexpDefs_in_prog54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_productions_in_prog56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_in_includes64 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_include82 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_include84 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_include86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceDecl_in_namespaceDecls95 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_namespaceDecl117 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_namespaceDecl119 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_namespaceDecl121 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_namespaceDecl123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexpDef_in_regexpDefs134 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_REGEXP_in_regexpDef164 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_regexpDef167 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REGEXP_in_regexpDef170 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_OPTMAX_in_regexpDef176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_production_in_productions189 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_optNonterminal_in_production237 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_production239 = new BitSet(new long[]{0x0000000000089000L});
    public static final BitSet FOLLOW_leftItems_in_production241 = new BitSet(new long[]{0x0000000000089000L});
    public static final BitSet FOLLOW_rightItems_in_production243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONTERMINAL_in_optNonterminal263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftItem_in_leftItems302 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_rightItem_in_rightItems327 = new BitSet(new long[]{0x0000000000089002L});
    public static final BitSet FOLLOW_item_in_leftItem345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_in_rightItem357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_rightItem369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_item394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NONTERMINAL_in_item396 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_item399 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_item401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_item410 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REGEXP_in_item413 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_item415 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_item418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_item427 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_item429 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_item431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_element455 = new BitSet(new long[]{0x0000000000084020L});
    public static final BitSet FOLLOW_name_in_element458 = new BitSet(new long[]{0x00000000000C4030L});
    public static final BitSet FOLLOW_attributes_in_element460 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_element464 = new BitSet(new long[]{0x0000000000099000L});
    public static final BitSet FOLLOW_rightItems_in_element466 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_element469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_element481 = new BitSet(new long[]{0x0000000000084020L});
    public static final BitSet FOLLOW_name_in_element483 = new BitSet(new long[]{0x0000000000086030L});
    public static final BitSet FOLLOW_attributes_in_element485 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_element487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributes507 = new BitSet(new long[]{0x0000000000084032L});
    public static final BitSet FOLLOW_NAME_in_attribute538 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_attribute540 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_attribute542 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_attribute544 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_attribute546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_attribute558 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_attribute560 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_attribute562 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REGEXP_in_attribute565 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_attribute567 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_attribute570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_attribute583 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_attribute586 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_attribute589 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NONTERMINAL_in_attribute592 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_attribute594 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_attribute596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCNAME_in_name603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_name615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NCNAME_in_name617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_name626 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_REGEXP_in_name628 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_optNameOrExample_in_name630 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_name633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_optNameOrExample658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_optNameOrExample678 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_optNameOrExample680 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_optNameOrExample682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftItem_in_synpred5_Antlr302 = new BitSet(new long[]{0x0000000000000002L});

}
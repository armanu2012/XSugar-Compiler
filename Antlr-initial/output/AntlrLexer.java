// $ANTLR 3.4 A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g 2012-06-24 19:59:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AntlrLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AntlrLexer() {} 
    public AntlrLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AntlrLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:2:7: ( '\"' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:2:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:3:7: ( '/>' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:3:9: '/>'
            {
            match("/>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:4:7: ( ':' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:4:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:5:7: ( '<' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:5:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:6:7: ( '</>' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:6:9: '</>'
            {
            match("</>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:7:7: ( '=' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:7:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:8:7: ( '>' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:8:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:9:7: ( '[' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:9:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:10:7: ( ']' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:10:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:11:7: ( 'include' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:11:9: 'include'
            {
            match("include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:12:7: ( 'xmlns' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:12:9: 'xmlns'
            {
            match("xmlns"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "NONTERMINAL"
    public final void mNONTERMINAL() throws RecognitionException {
        try {
            int _type = NONTERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:109:17: ( ( 'a' .. 'z' 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:109:19: ( 'a' .. 'z' 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:109:19: ( 'a' .. 'z' 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:109:20: 'a' .. 'z' 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.'
            	    {
            	    matchRange('a','z'); 

            	    matchRange('a','z'); 

            	    matchRange('A','Z'); 

            	    matchRange('0','9'); 

            	    match(' '); 

            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NONTERMINAL"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:111:17: ( ( 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )+ )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:111:18: ( 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )+
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:111:18: ( 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:111:19: 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.'
            	    {
            	    matchRange('a','z'); 

            	    matchRange('A','Z'); 

            	    matchRange('0','9'); 

            	    match(' '); 

            	    match('.'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "REGEXP"
    public final void mREGEXP() throws RecognitionException {
        try {
            int _type = REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:112:17: ( ( 'A' .. 'Z' 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:112:19: ( 'A' .. 'Z' 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:112:19: ( 'A' .. 'Z' 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:112:20: 'A' .. 'Z' 'a' .. 'z' 'A' .. 'Z' '0' .. '9' ' ' '.'
            	    {
            	    matchRange('A','Z'); 

            	    matchRange('a','z'); 

            	    matchRange('A','Z'); 

            	    matchRange('0','9'); 

            	    match(' '); 

            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGEXP"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:113:17: ( ( '\\ ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:113:19: ( '\\ ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:113:19: ( '\\ ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:114:13: ( ( '0' .. '9' )+ )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:114:15: ( '0' .. '9' )+
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:114:15: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "OPTMAX"
    public final void mOPTMAX() throws RecognitionException {
        try {
            int _type = OPTMAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:115:8: ( ( '(' 'MAX' ')' ) )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:115:10: ( '(' 'MAX' ')' )
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:115:10: ( '(' 'MAX' ')' )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:115:11: '(' 'MAX' ')'
            {
            match('('); 

            match("MAX"); 



            match(')'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPTMAX"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:116:9: ( (~ ( '\\b' | '\\t' | '\\n' | '\\r' | '\\f' ) )* )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:116:11: (~ ( '\\b' | '\\t' | '\\n' | '\\r' | '\\f' ) )*
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:116:11: (~ ( '\\b' | '\\t' | '\\n' | '\\r' | '\\f' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\u0007')||LA6_0=='\u000B'||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\u0007')||input.LA(1)=='\u000B'||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NCNAME"
    public final void mNCNAME() throws RecognitionException {
        try {
            int _type = NCNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:117:8: ( (~ ( '\\t' | '\\n' | '\\r' | ':' | '>' | '=' | '/' ) )+ )
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:117:10: (~ ( '\\t' | '\\n' | '\\r' | ':' | '>' | '=' | '/' ) )+
            {
            // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:117:10: (~ ( '\\t' | '\\n' | '\\r' | ':' | '>' | '=' | '/' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\b')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '.')||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= ';' && LA7_0 <= '<')||(LA7_0 >= '?' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= ';' && input.LA(1) <= '<')||(input.LA(1) >= '?' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NCNAME"

    public void mTokens() throws RecognitionException {
        // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | NONTERMINAL | NAME | REGEXP | WHITESPACE | NUMBER | OPTMAX | STRING | NCNAME )
        int alt8=19;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:52: T__19
                {
                mT__19(); 


                }
                break;
            case 9 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:58: T__20
                {
                mT__20(); 


                }
                break;
            case 10 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:64: T__21
                {
                mT__21(); 


                }
                break;
            case 11 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:70: T__22
                {
                mT__22(); 


                }
                break;
            case 12 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:76: NONTERMINAL
                {
                mNONTERMINAL(); 


                }
                break;
            case 13 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:88: NAME
                {
                mNAME(); 


                }
                break;
            case 14 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:93: REGEXP
                {
                mREGEXP(); 


                }
                break;
            case 15 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:100: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 16 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:111: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 17 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:118: OPTMAX
                {
                mOPTMAX(); 


                }
                break;
            case 18 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:125: STRING
                {
                mSTRING(); 


                }
                break;
            case 19 :
                // A:\\University\\Project\\antlr-examples\\Antlr1\\Antlr-initial\\Antlr.g:1:132: NCNAME
                {
                mNCNAME(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\14\1\25\1\26\1\30\1\32\1\33\1\34\1\35\1\36\3\26\1\uffff\1\26"+
        "\1\23\1\44\1\26\1\23\1\26\4\uffff\1\46\1\uffff\1\26\5\uffff\5\26"+
        "\1\uffff\1\26\1\uffff\1\56\6\26\1\uffff\10\26\1\75\1\77\1\26\1\101"+
        "\1\26\1\14\1\uffff\1\26\1\uffff\1\104\1\uffff\1\105\1\26\2\uffff";
    static final String DFA8_eofS =
        "\106\uffff";
    static final String DFA8_minS =
        "\2\0\1\76\11\0\1\uffff\6\0\4\uffff\1\0\1\uffff\1\76\5\uffff\5\0"+
        "\1\uffff\1\0\1\uffff\7\0\1\uffff\16\0\1\uffff\1\0\1\uffff\1\0\1"+
        "\uffff\2\0\2\uffff";
    static final String DFA8_maxS =
        "\2\uffff\1\76\11\uffff\1\uffff\6\uffff\4\uffff\1\uffff\1\uffff\1"+
        "\76\5\uffff\5\uffff\1\uffff\1\uffff\1\uffff\7\uffff\1\uffff\16\uffff"+
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\2\uffff";
    static final String DFA8_acceptS =
        "\14\uffff\1\14\6\uffff\1\17\1\23\1\1\1\22\1\uffff\1\3\1\uffff\1"+
        "\4\1\6\1\7\1\10\1\11\5\uffff\1\20\1\uffff\1\2\7\uffff\1\5\16\uffff"+
        "\1\15\1\uffff\1\13\1\uffff\1\21\2\uffff\1\16\1\12";
    static final String DFA8_specialS =
        "\1\41\1\45\1\uffff\1\5\1\33\1\53\1\50\1\1\1\32\1\54\1\60\1\17\1"+
        "\uffff\1\10\1\44\1\27\1\55\1\23\1\14\4\uffff\1\0\7\uffff\1\47\1"+
        "\26\1\15\1\42\1\7\1\uffff\1\56\1\uffff\1\57\1\40\1\22\1\13\1\31"+
        "\1\6\1\51\1\uffff\1\37\1\24\1\12\1\30\1\4\1\52\1\36\1\20\1\46\1"+
        "\43\1\3\1\34\1\35\1\11\1\uffff\1\16\1\uffff\1\2\1\uffff\1\21\1\25"+
        "\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\10\22\1\24\2\23\1\22\1\21\1\23\22\22\1\16\1\22\1\1\5\22\1\20"+
            "\6\22\1\2\12\17\1\3\1\22\1\4\1\5\1\6\2\22\32\15\1\7\1\22\1\10"+
            "\3\22\10\13\1\11\16\13\1\12\2\13\uff85\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\uffc1\22",
            "\1\27",
            "\10\26\3\uffff\1\26\2\uffff\ufff2\26",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\31\12\22\1\26"+
            "\2\22\2\26\uffc1\22",
            "\10\26\3\uffff\1\26\2\uffff\ufff2\26",
            "\10\26\3\uffff\1\26\2\uffff\ufff2\26",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\32\41\6\22\15\40\1\37\14\40\uff85\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\32\41\6\22\14\40\1\42\15\40\uff85\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\32\41\6\22\32\40\uff85\22",
            "",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\42\22\32\43\uff85\22",
            "\10\22\1\24\2\uffff\1\22\1\21\1\uffff\22\22\1\16\16\22\1\26"+
            "\12\22\1\26\2\22\2\26\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\17\1\26"+
            "\2\22\2\26\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\16\22\1\45\uffb2\22",
            "\11\24\2\uffff\1\24\1\21\1\uffff\22\24\1\21\16\24\1\uffff\12"+
            "\24\1\uffff\2\24\2\uffff\uffc1\24",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\uffc1\22",
            "",
            "",
            "",
            "",
            "\10\26\3\uffff\1\26\2\uffff\ufff2\26",
            "",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\32\51\10\22\1\50\uff9c\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\32\51\uffa5\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\52\1"+
            "\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\32\51\21\22\1\53\uff93\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\32\54\uffa5\22",
            "",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\1\55\uffbe\22",
            "",
            "\10\26\3\uffff\1\26\2\uffff\ufff2\26",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\55\22\1\57\uff93\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\60\1"+
            "\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\22\22\1\61\16\22\1\uffff"+
            "\12\22\1\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\57\22\1\62\uff91\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\63\1"+
            "\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\31\22\1\64\uffa7\22",
            "",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\66\22\1\65\uff8a\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\22\22\1\66\16\22\1\uffff"+
            "\12\22\1\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\40\22\1\67\1\uffff\12"+
            "\22\1\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\64\22\1\70\uff8c\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\22\22\1\71\16\22\1\uffff"+
            "\12\22\1\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\33\22\1\72\5\22\1\uffff"+
            "\12\22\1\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\45\22\1\73\uff9b\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\40\22\1\74\1\uffff\12"+
            "\22\1\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\42\22\32\76\uff85\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\40\22\1\100\1\uffff\12"+
            "\22\1\uffff\2\22\2\uffff\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\46\22\1\102\uff9a\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\42\22\32\103\uff85\22",
            "",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\2\22\32\41\uffa5\22",
            "",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\2\22\32\15\uffa5\22",
            "",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\26\12\22\1\26"+
            "\2\22\2\26\uffc1\22",
            "\10\22\1\24\2\uffff\1\22\1\24\1\uffff\41\22\1\uffff\12\22\1"+
            "\uffff\2\22\2\uffff\42\22\32\40\uff85\22",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | NONTERMINAL | NAME | REGEXP | WHITESPACE | NUMBER | OPTMAX | STRING | NCNAME );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_23 = input.LA(1);

                        s = -1;
                        if ( ((LA8_23 >= '\u0000' && LA8_23 <= '\u0007')||LA8_23=='\u000B'||(LA8_23 >= '\u000E' && LA8_23 <= '\uFFFF')) ) {s = 22;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA8_7 = input.LA(1);

                        s = -1;
                        if ( ((LA8_7 >= '\u0000' && LA8_7 <= '\u0007')||LA8_7=='\u000B'||(LA8_7 >= '\u000E' && LA8_7 <= '.')||(LA8_7 >= '0' && LA8_7 <= '9')||(LA8_7 >= ';' && LA8_7 <= '<')||(LA8_7 >= '?' && LA8_7 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_7=='/'||LA8_7==':'||(LA8_7 >= '=' && LA8_7 <= '>')) ) {s = 22;}

                        else if ( (LA8_7=='\b'||LA8_7=='\f') ) {s = 20;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA8_64 = input.LA(1);

                        s = -1;
                        if ( ((LA8_64 >= 'A' && LA8_64 <= 'Z')) ) {s = 13;}

                        else if ( ((LA8_64 >= '\u0000' && LA8_64 <= '\u0007')||LA8_64=='\u000B'||(LA8_64 >= '\u000E' && LA8_64 <= '.')||(LA8_64 >= '0' && LA8_64 <= '9')||(LA8_64 >= ';' && LA8_64 <= '<')||(LA8_64 >= '?' && LA8_64 <= '@')||(LA8_64 >= '[' && LA8_64 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_64=='/'||LA8_64==':'||(LA8_64 >= '=' && LA8_64 <= '>')) ) {s = 22;}

                        else if ( (LA8_64=='\b'||LA8_64=='\f') ) {s = 20;}

                        else s = 68;

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA8_57 = input.LA(1);

                        s = -1;
                        if ( (LA8_57=='.') ) {s = 64;}

                        else if ( ((LA8_57 >= '\u0000' && LA8_57 <= '\u0007')||LA8_57=='\u000B'||(LA8_57 >= '\u000E' && LA8_57 <= '-')||(LA8_57 >= '0' && LA8_57 <= '9')||(LA8_57 >= ';' && LA8_57 <= '<')||(LA8_57 >= '?' && LA8_57 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_57=='\b'||LA8_57=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA8_51 = input.LA(1);

                        s = -1;
                        if ( (LA8_51==' ') ) {s = 57;}

                        else if ( ((LA8_51 >= '\u0000' && LA8_51 <= '\u0007')||LA8_51=='\u000B'||(LA8_51 >= '\u000E' && LA8_51 <= '\u001F')||(LA8_51 >= '!' && LA8_51 <= '.')||(LA8_51 >= '0' && LA8_51 <= '9')||(LA8_51 >= ';' && LA8_51 <= '<')||(LA8_51 >= '?' && LA8_51 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_51=='\b'||LA8_51=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA8_3 = input.LA(1);

                        s = -1;
                        if ( ((LA8_3 >= '\u0000' && LA8_3 <= '\u0007')||LA8_3=='\u000B'||(LA8_3 >= '\u000E' && LA8_3 <= '\uFFFF')) ) {s = 22;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA8_44 = input.LA(1);

                        s = -1;
                        if ( ((LA8_44 >= '0' && LA8_44 <= '9')) ) {s = 51;}

                        else if ( ((LA8_44 >= '\u0000' && LA8_44 <= '\u0007')||LA8_44=='\u000B'||(LA8_44 >= '\u000E' && LA8_44 <= '.')||(LA8_44 >= ';' && LA8_44 <= '<')||(LA8_44 >= '?' && LA8_44 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_44=='\b'||LA8_44=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA8_35 = input.LA(1);

                        s = -1;
                        if ( ((LA8_35 >= 'A' && LA8_35 <= 'Z')) ) {s = 44;}

                        else if ( ((LA8_35 >= '\u0000' && LA8_35 <= '\u0007')||LA8_35=='\u000B'||(LA8_35 >= '\u000E' && LA8_35 <= '.')||(LA8_35 >= '0' && LA8_35 <= '9')||(LA8_35 >= ';' && LA8_35 <= '<')||(LA8_35 >= '?' && LA8_35 <= '@')||(LA8_35 >= '[' && LA8_35 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_35=='\b'||LA8_35=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA8_13 = input.LA(1);

                        s = -1;
                        if ( ((LA8_13 >= 'a' && LA8_13 <= 'z')) ) {s = 35;}

                        else if ( ((LA8_13 >= '\u0000' && LA8_13 <= '\u0007')||LA8_13=='\u000B'||(LA8_13 >= '\u000E' && LA8_13 <= '.')||(LA8_13 >= '0' && LA8_13 <= '9')||(LA8_13 >= ';' && LA8_13 <= '<')||(LA8_13 >= '?' && LA8_13 <= '`')||(LA8_13 >= '{' && LA8_13 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_13=='\b'||LA8_13=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA8_60 = input.LA(1);

                        s = -1;
                        if ( ((LA8_60 >= 'a' && LA8_60 <= 'z')) ) {s = 67;}

                        else if ( ((LA8_60 >= '\u0000' && LA8_60 <= '\u0007')||LA8_60=='\u000B'||(LA8_60 >= '\u000E' && LA8_60 <= '.')||(LA8_60 >= '0' && LA8_60 <= '9')||(LA8_60 >= ';' && LA8_60 <= '<')||(LA8_60 >= '?' && LA8_60 <= '`')||(LA8_60 >= '{' && LA8_60 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_60=='/'||LA8_60==':'||(LA8_60 >= '=' && LA8_60 <= '>')) ) {s = 22;}

                        else if ( (LA8_60=='\b'||LA8_60=='\f') ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA8_49 = input.LA(1);

                        s = -1;
                        if ( (LA8_49=='.') ) {s = 55;}

                        else if ( ((LA8_49 >= '\u0000' && LA8_49 <= '\u0007')||LA8_49=='\u000B'||(LA8_49 >= '\u000E' && LA8_49 <= '-')||(LA8_49 >= '0' && LA8_49 <= '9')||(LA8_49 >= ';' && LA8_49 <= '<')||(LA8_49 >= '?' && LA8_49 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_49=='\b'||LA8_49=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA8_42 = input.LA(1);

                        s = -1;
                        if ( (LA8_42==' ') ) {s = 49;}

                        else if ( ((LA8_42 >= '\u0000' && LA8_42 <= '\u0007')||LA8_42=='\u000B'||(LA8_42 >= '\u000E' && LA8_42 <= '\u001F')||(LA8_42 >= '!' && LA8_42 <= '.')||(LA8_42 >= '0' && LA8_42 <= '9')||(LA8_42 >= ';' && LA8_42 <= '<')||(LA8_42 >= '?' && LA8_42 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_42=='\b'||LA8_42=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA8_18 = input.LA(1);

                        s = -1;
                        if ( ((LA8_18 >= '\u0000' && LA8_18 <= '\u0007')||LA8_18=='\u000B'||(LA8_18 >= '\u000E' && LA8_18 <= '.')||(LA8_18 >= '0' && LA8_18 <= '9')||(LA8_18 >= ';' && LA8_18 <= '<')||(LA8_18 >= '?' && LA8_18 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_18=='\b'||LA8_18=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA8_33 = input.LA(1);

                        s = -1;
                        if ( ((LA8_33 >= '0' && LA8_33 <= '9')) ) {s = 42;}

                        else if ( ((LA8_33 >= '\u0000' && LA8_33 <= '\u0007')||LA8_33=='\u000B'||(LA8_33 >= '\u000E' && LA8_33 <= '.')||(LA8_33 >= ';' && LA8_33 <= '<')||(LA8_33 >= '?' && LA8_33 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_33=='\b'||LA8_33=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA8_62 = input.LA(1);

                        s = -1;
                        if ( ((LA8_62 >= 'A' && LA8_62 <= 'Z')) ) {s = 33;}

                        else if ( ((LA8_62 >= '\u0000' && LA8_62 <= '\u0007')||LA8_62=='\u000B'||(LA8_62 >= '\u000E' && LA8_62 <= '.')||(LA8_62 >= '0' && LA8_62 <= '9')||(LA8_62 >= ';' && LA8_62 <= '<')||(LA8_62 >= '?' && LA8_62 <= '@')||(LA8_62 >= '[' && LA8_62 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_62=='\b'||LA8_62=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA8_11 = input.LA(1);

                        s = -1;
                        if ( ((LA8_11 >= 'a' && LA8_11 <= 'z')) ) {s = 32;}

                        else if ( ((LA8_11 >= 'A' && LA8_11 <= 'Z')) ) {s = 33;}

                        else if ( ((LA8_11 >= '\u0000' && LA8_11 <= '\u0007')||LA8_11=='\u000B'||(LA8_11 >= '\u000E' && LA8_11 <= '.')||(LA8_11 >= '0' && LA8_11 <= '9')||(LA8_11 >= ';' && LA8_11 <= '<')||(LA8_11 >= '?' && LA8_11 <= '@')||(LA8_11 >= '[' && LA8_11 <= '`')||(LA8_11 >= '{' && LA8_11 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_11=='\b'||LA8_11=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA8_54 = input.LA(1);

                        s = -1;
                        if ( (LA8_54=='.') ) {s = 60;}

                        else if ( ((LA8_54 >= '\u0000' && LA8_54 <= '\u0007')||LA8_54=='\u000B'||(LA8_54 >= '\u000E' && LA8_54 <= '-')||(LA8_54 >= '0' && LA8_54 <= '9')||(LA8_54 >= ';' && LA8_54 <= '<')||(LA8_54 >= '?' && LA8_54 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_54=='\b'||LA8_54=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA8_66 = input.LA(1);

                        s = -1;
                        if ( ((LA8_66 >= '\u0000' && LA8_66 <= '\u0007')||LA8_66=='\u000B'||(LA8_66 >= '\u000E' && LA8_66 <= '.')||(LA8_66 >= '0' && LA8_66 <= '9')||(LA8_66 >= ';' && LA8_66 <= '<')||(LA8_66 >= '?' && LA8_66 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_66=='/'||LA8_66==':'||(LA8_66 >= '=' && LA8_66 <= '>')) ) {s = 22;}

                        else if ( (LA8_66=='\b'||LA8_66=='\f') ) {s = 20;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA8_41 = input.LA(1);

                        s = -1;
                        if ( ((LA8_41 >= '0' && LA8_41 <= '9')) ) {s = 48;}

                        else if ( ((LA8_41 >= '\u0000' && LA8_41 <= '\u0007')||LA8_41=='\u000B'||(LA8_41 >= '\u000E' && LA8_41 <= '.')||(LA8_41 >= ';' && LA8_41 <= '<')||(LA8_41 >= '?' && LA8_41 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_41=='\b'||LA8_41=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA8_17 = input.LA(1);

                        s = -1;
                        if ( (LA8_17=='\f'||LA8_17==' ') ) {s = 17;}

                        else if ( ((LA8_17 >= '\u0000' && LA8_17 <= '\b')||LA8_17=='\u000B'||(LA8_17 >= '\u000E' && LA8_17 <= '\u001F')||(LA8_17 >= '!' && LA8_17 <= '.')||(LA8_17 >= '0' && LA8_17 <= '9')||(LA8_17 >= ';' && LA8_17 <= '<')||(LA8_17 >= '?' && LA8_17 <= '\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA8_48 = input.LA(1);

                        s = -1;
                        if ( (LA8_48==' ') ) {s = 54;}

                        else if ( ((LA8_48 >= '\u0000' && LA8_48 <= '\u0007')||LA8_48=='\u000B'||(LA8_48 >= '\u000E' && LA8_48 <= '\u001F')||(LA8_48 >= '!' && LA8_48 <= '.')||(LA8_48 >= '0' && LA8_48 <= '9')||(LA8_48 >= ';' && LA8_48 <= '<')||(LA8_48 >= '?' && LA8_48 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_48=='\b'||LA8_48=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA8_67 = input.LA(1);

                        s = -1;
                        if ( ((LA8_67 >= 'a' && LA8_67 <= 'z')) ) {s = 32;}

                        else if ( ((LA8_67 >= '\u0000' && LA8_67 <= '\u0007')||LA8_67=='\u000B'||(LA8_67 >= '\u000E' && LA8_67 <= '.')||(LA8_67 >= '0' && LA8_67 <= '9')||(LA8_67 >= ';' && LA8_67 <= '<')||(LA8_67 >= '?' && LA8_67 <= '`')||(LA8_67 >= '{' && LA8_67 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_67=='\b'||LA8_67=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA8_32 = input.LA(1);

                        s = -1;
                        if ( ((LA8_32 >= 'A' && LA8_32 <= 'Z')) ) {s = 41;}

                        else if ( ((LA8_32 >= '\u0000' && LA8_32 <= '\u0007')||LA8_32=='\u000B'||(LA8_32 >= '\u000E' && LA8_32 <= '.')||(LA8_32 >= '0' && LA8_32 <= '9')||(LA8_32 >= ';' && LA8_32 <= '<')||(LA8_32 >= '?' && LA8_32 <= '@')||(LA8_32 >= '[' && LA8_32 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_32=='\b'||LA8_32=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA8_15 = input.LA(1);

                        s = -1;
                        if ( ((LA8_15 >= '0' && LA8_15 <= '9')) ) {s = 15;}

                        else if ( ((LA8_15 >= '\u0000' && LA8_15 <= '\u0007')||LA8_15=='\u000B'||(LA8_15 >= '\u000E' && LA8_15 <= '.')||(LA8_15 >= ';' && LA8_15 <= '<')||(LA8_15 >= '?' && LA8_15 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_15=='/'||LA8_15==':'||(LA8_15 >= '=' && LA8_15 <= '>')) ) {s = 22;}

                        else if ( (LA8_15=='\b'||LA8_15=='\f') ) {s = 20;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA8_50 = input.LA(1);

                        s = -1;
                        if ( (LA8_50=='s') ) {s = 56;}

                        else if ( ((LA8_50 >= '\u0000' && LA8_50 <= '\u0007')||LA8_50=='\u000B'||(LA8_50 >= '\u000E' && LA8_50 <= '.')||(LA8_50 >= '0' && LA8_50 <= '9')||(LA8_50 >= ';' && LA8_50 <= '<')||(LA8_50 >= '?' && LA8_50 <= 'r')||(LA8_50 >= 't' && LA8_50 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_50=='\b'||LA8_50=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA8_43 = input.LA(1);

                        s = -1;
                        if ( (LA8_43=='n') ) {s = 50;}

                        else if ( ((LA8_43 >= '\u0000' && LA8_43 <= '\u0007')||LA8_43=='\u000B'||(LA8_43 >= '\u000E' && LA8_43 <= '.')||(LA8_43 >= '0' && LA8_43 <= '9')||(LA8_43 >= ';' && LA8_43 <= '<')||(LA8_43 >= '?' && LA8_43 <= 'm')||(LA8_43 >= 'o' && LA8_43 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_43=='\b'||LA8_43=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA8_8 = input.LA(1);

                        s = -1;
                        if ( ((LA8_8 >= '\u0000' && LA8_8 <= '\u0007')||LA8_8=='\u000B'||(LA8_8 >= '\u000E' && LA8_8 <= '.')||(LA8_8 >= '0' && LA8_8 <= '9')||(LA8_8 >= ';' && LA8_8 <= '<')||(LA8_8 >= '?' && LA8_8 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_8=='/'||LA8_8==':'||(LA8_8 >= '=' && LA8_8 <= '>')) ) {s = 22;}

                        else if ( (LA8_8=='\b'||LA8_8=='\f') ) {s = 20;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA8_4 = input.LA(1);

                        s = -1;
                        if ( (LA8_4=='/') ) {s = 25;}

                        else if ( ((LA8_4 >= '\u0000' && LA8_4 <= '\u0007')||LA8_4=='\u000B'||(LA8_4 >= '\u000E' && LA8_4 <= '.')||(LA8_4 >= '0' && LA8_4 <= '9')||(LA8_4 >= ';' && LA8_4 <= '<')||(LA8_4 >= '?' && LA8_4 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_4==':'||(LA8_4 >= '=' && LA8_4 <= '>')) ) {s = 22;}

                        else if ( (LA8_4=='\b'||LA8_4=='\f') ) {s = 20;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA8_58 = input.LA(1);

                        s = -1;
                        if ( ((LA8_58 >= '\u0000' && LA8_58 <= '\u0007')||LA8_58=='\u000B'||(LA8_58 >= '\u000E' && LA8_58 <= '.')||(LA8_58 >= '0' && LA8_58 <= '9')||(LA8_58 >= ';' && LA8_58 <= '<')||(LA8_58 >= '?' && LA8_58 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_58=='/'||LA8_58==':'||(LA8_58 >= '=' && LA8_58 <= '>')) ) {s = 22;}

                        else if ( (LA8_58=='\b'||LA8_58=='\f') ) {s = 20;}

                        else s = 65;

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA8_59 = input.LA(1);

                        s = -1;
                        if ( (LA8_59=='e') ) {s = 66;}

                        else if ( ((LA8_59 >= '\u0000' && LA8_59 <= '\u0007')||LA8_59=='\u000B'||(LA8_59 >= '\u000E' && LA8_59 <= '.')||(LA8_59 >= '0' && LA8_59 <= '9')||(LA8_59 >= ';' && LA8_59 <= '<')||(LA8_59 >= '?' && LA8_59 <= 'd')||(LA8_59 >= 'f' && LA8_59 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_59=='\b'||LA8_59=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA8_53 = input.LA(1);

                        s = -1;
                        if ( (LA8_53=='d') ) {s = 59;}

                        else if ( ((LA8_53 >= '\u0000' && LA8_53 <= '\u0007')||LA8_53=='\u000B'||(LA8_53 >= '\u000E' && LA8_53 <= '.')||(LA8_53 >= '0' && LA8_53 <= '9')||(LA8_53 >= ';' && LA8_53 <= '<')||(LA8_53 >= '?' && LA8_53 <= 'c')||(LA8_53 >= 'e' && LA8_53 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_53=='\b'||LA8_53=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA8_47 = input.LA(1);

                        s = -1;
                        if ( (LA8_47=='u') ) {s = 53;}

                        else if ( ((LA8_47 >= '\u0000' && LA8_47 <= '\u0007')||LA8_47=='\u000B'||(LA8_47 >= '\u000E' && LA8_47 <= '.')||(LA8_47 >= '0' && LA8_47 <= '9')||(LA8_47 >= ';' && LA8_47 <= '<')||(LA8_47 >= '?' && LA8_47 <= 't')||(LA8_47 >= 'v' && LA8_47 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_47=='\b'||LA8_47=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA8_40 = input.LA(1);

                        s = -1;
                        if ( (LA8_40=='l') ) {s = 47;}

                        else if ( ((LA8_40 >= '\u0000' && LA8_40 <= '\u0007')||LA8_40=='\u000B'||(LA8_40 >= '\u000E' && LA8_40 <= '.')||(LA8_40 >= '0' && LA8_40 <= '9')||(LA8_40 >= ';' && LA8_40 <= '<')||(LA8_40 >= '?' && LA8_40 <= 'k')||(LA8_40 >= 'm' && LA8_40 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_40=='\b'||LA8_40=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='\"') ) {s = 1;}

                        else if ( (LA8_0=='/') ) {s = 2;}

                        else if ( (LA8_0==':') ) {s = 3;}

                        else if ( (LA8_0=='<') ) {s = 4;}

                        else if ( (LA8_0=='=') ) {s = 5;}

                        else if ( (LA8_0=='>') ) {s = 6;}

                        else if ( (LA8_0=='[') ) {s = 7;}

                        else if ( (LA8_0==']') ) {s = 8;}

                        else if ( (LA8_0=='i') ) {s = 9;}

                        else if ( (LA8_0=='x') ) {s = 10;}

                        else if ( ((LA8_0 >= 'a' && LA8_0 <= 'h')||(LA8_0 >= 'j' && LA8_0 <= 'w')||(LA8_0 >= 'y' && LA8_0 <= 'z')) ) {s = 11;}

                        else if ( ((LA8_0 >= 'A' && LA8_0 <= 'Z')) ) {s = 13;}

                        else if ( (LA8_0==' ') ) {s = 14;}

                        else if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {s = 15;}

                        else if ( (LA8_0=='(') ) {s = 16;}

                        else if ( (LA8_0=='\f') ) {s = 17;}

                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\u0007')||LA8_0=='\u000B'||(LA8_0 >= '\u000E' && LA8_0 <= '\u001F')||LA8_0=='!'||(LA8_0 >= '#' && LA8_0 <= '\'')||(LA8_0 >= ')' && LA8_0 <= '.')||LA8_0==';'||(LA8_0 >= '?' && LA8_0 <= '@')||LA8_0=='\\'||(LA8_0 >= '^' && LA8_0 <= '`')||(LA8_0 >= '{' && LA8_0 <= '\uFFFF')) ) {s = 18;}

                        else if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r') ) {s = 19;}

                        else if ( (LA8_0=='\b') ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA8_34 = input.LA(1);

                        s = -1;
                        if ( (LA8_34=='l') ) {s = 43;}

                        else if ( ((LA8_34 >= 'A' && LA8_34 <= 'Z')) ) {s = 41;}

                        else if ( ((LA8_34 >= '\u0000' && LA8_34 <= '\u0007')||LA8_34=='\u000B'||(LA8_34 >= '\u000E' && LA8_34 <= '.')||(LA8_34 >= '0' && LA8_34 <= '9')||(LA8_34 >= ';' && LA8_34 <= '<')||(LA8_34 >= '?' && LA8_34 <= '@')||(LA8_34 >= '[' && LA8_34 <= 'k')||(LA8_34 >= 'm' && LA8_34 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_34=='\b'||LA8_34=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA8_56 = input.LA(1);

                        s = -1;
                        if ( ((LA8_56 >= '\u0000' && LA8_56 <= '\u0007')||LA8_56=='\u000B'||(LA8_56 >= '\u000E' && LA8_56 <= '.')||(LA8_56 >= '0' && LA8_56 <= '9')||(LA8_56 >= ';' && LA8_56 <= '<')||(LA8_56 >= '?' && LA8_56 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_56=='/'||LA8_56==':'||(LA8_56 >= '=' && LA8_56 <= '>')) ) {s = 22;}

                        else if ( (LA8_56=='\b'||LA8_56=='\f') ) {s = 20;}

                        else s = 63;

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA8_14 = input.LA(1);

                        s = -1;
                        if ( (LA8_14==' ') ) {s = 14;}

                        else if ( (LA8_14=='\f') ) {s = 17;}

                        else if ( ((LA8_14 >= '\u0000' && LA8_14 <= '\u0007')||LA8_14=='\u000B'||(LA8_14 >= '\u000E' && LA8_14 <= '\u001F')||(LA8_14 >= '!' && LA8_14 <= '.')||(LA8_14 >= '0' && LA8_14 <= '9')||(LA8_14 >= ';' && LA8_14 <= '<')||(LA8_14 >= '?' && LA8_14 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_14=='/'||LA8_14==':'||(LA8_14 >= '=' && LA8_14 <= '>')) ) {s = 22;}

                        else if ( (LA8_14=='\b') ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA8_1 = input.LA(1);

                        s = -1;
                        if ( ((LA8_1 >= '\u0000' && LA8_1 <= '\u0007')||LA8_1=='\u000B'||(LA8_1 >= '\u000E' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '9')||(LA8_1 >= ';' && LA8_1 <= '<')||(LA8_1 >= '?' && LA8_1 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_1=='/'||LA8_1==':'||(LA8_1 >= '=' && LA8_1 <= '>')) ) {s = 22;}

                        else if ( (LA8_1=='\b'||LA8_1=='\f') ) {s = 20;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA8_55 = input.LA(1);

                        s = -1;
                        if ( ((LA8_55 >= 'a' && LA8_55 <= 'z')) ) {s = 62;}

                        else if ( ((LA8_55 >= '\u0000' && LA8_55 <= '\u0007')||LA8_55=='\u000B'||(LA8_55 >= '\u000E' && LA8_55 <= '.')||(LA8_55 >= '0' && LA8_55 <= '9')||(LA8_55 >= ';' && LA8_55 <= '<')||(LA8_55 >= '?' && LA8_55 <= '`')||(LA8_55 >= '{' && LA8_55 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_55=='/'||LA8_55==':'||(LA8_55 >= '=' && LA8_55 <= '>')) ) {s = 22;}

                        else if ( (LA8_55=='\b'||LA8_55=='\f') ) {s = 20;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA8_31 = input.LA(1);

                        s = -1;
                        if ( (LA8_31=='c') ) {s = 40;}

                        else if ( ((LA8_31 >= 'A' && LA8_31 <= 'Z')) ) {s = 41;}

                        else if ( ((LA8_31 >= '\u0000' && LA8_31 <= '\u0007')||LA8_31=='\u000B'||(LA8_31 >= '\u000E' && LA8_31 <= '.')||(LA8_31 >= '0' && LA8_31 <= '9')||(LA8_31 >= ';' && LA8_31 <= '<')||(LA8_31 >= '?' && LA8_31 <= '@')||(LA8_31 >= '[' && LA8_31 <= 'b')||(LA8_31 >= 'd' && LA8_31 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_31=='\b'||LA8_31=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA8_6 = input.LA(1);

                        s = -1;
                        if ( ((LA8_6 >= '\u0000' && LA8_6 <= '\u0007')||LA8_6=='\u000B'||(LA8_6 >= '\u000E' && LA8_6 <= '\uFFFF')) ) {s = 22;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA8_45 = input.LA(1);

                        s = -1;
                        if ( (LA8_45=='X') ) {s = 52;}

                        else if ( ((LA8_45 >= '\u0000' && LA8_45 <= '\u0007')||LA8_45=='\u000B'||(LA8_45 >= '\u000E' && LA8_45 <= '.')||(LA8_45 >= '0' && LA8_45 <= '9')||(LA8_45 >= ';' && LA8_45 <= '<')||(LA8_45 >= '?' && LA8_45 <= 'W')||(LA8_45 >= 'Y' && LA8_45 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_45=='\b'||LA8_45=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA8_52 = input.LA(1);

                        s = -1;
                        if ( (LA8_52==')') ) {s = 58;}

                        else if ( ((LA8_52 >= '\u0000' && LA8_52 <= '\u0007')||LA8_52=='\u000B'||(LA8_52 >= '\u000E' && LA8_52 <= '(')||(LA8_52 >= '*' && LA8_52 <= '.')||(LA8_52 >= '0' && LA8_52 <= '9')||(LA8_52 >= ';' && LA8_52 <= '<')||(LA8_52 >= '?' && LA8_52 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_52=='\b'||LA8_52=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA8_5 = input.LA(1);

                        s = -1;
                        if ( ((LA8_5 >= '\u0000' && LA8_5 <= '\u0007')||LA8_5=='\u000B'||(LA8_5 >= '\u000E' && LA8_5 <= '\uFFFF')) ) {s = 22;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA8_9 = input.LA(1);

                        s = -1;
                        if ( (LA8_9=='n') ) {s = 31;}

                        else if ( ((LA8_9 >= 'a' && LA8_9 <= 'm')||(LA8_9 >= 'o' && LA8_9 <= 'z')) ) {s = 32;}

                        else if ( ((LA8_9 >= 'A' && LA8_9 <= 'Z')) ) {s = 33;}

                        else if ( ((LA8_9 >= '\u0000' && LA8_9 <= '\u0007')||LA8_9=='\u000B'||(LA8_9 >= '\u000E' && LA8_9 <= '.')||(LA8_9 >= '0' && LA8_9 <= '9')||(LA8_9 >= ';' && LA8_9 <= '<')||(LA8_9 >= '?' && LA8_9 <= '@')||(LA8_9 >= '[' && LA8_9 <= '`')||(LA8_9 >= '{' && LA8_9 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_9=='\b'||LA8_9=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA8_16 = input.LA(1);

                        s = -1;
                        if ( (LA8_16=='M') ) {s = 37;}

                        else if ( ((LA8_16 >= '\u0000' && LA8_16 <= '\u0007')||LA8_16=='\u000B'||(LA8_16 >= '\u000E' && LA8_16 <= '.')||(LA8_16 >= '0' && LA8_16 <= '9')||(LA8_16 >= ';' && LA8_16 <= '<')||(LA8_16 >= '?' && LA8_16 <= 'L')||(LA8_16 >= 'N' && LA8_16 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_16=='\b'||LA8_16=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA8_37 = input.LA(1);

                        s = -1;
                        if ( (LA8_37=='A') ) {s = 45;}

                        else if ( ((LA8_37 >= '\u0000' && LA8_37 <= '\u0007')||LA8_37=='\u000B'||(LA8_37 >= '\u000E' && LA8_37 <= '.')||(LA8_37 >= '0' && LA8_37 <= '9')||(LA8_37 >= ';' && LA8_37 <= '<')||(LA8_37 >= '?' && LA8_37 <= '@')||(LA8_37 >= 'B' && LA8_37 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_37=='\b'||LA8_37=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA8_39 = input.LA(1);

                        s = -1;
                        if ( ((LA8_39 >= '\u0000' && LA8_39 <= '\u0007')||LA8_39=='\u000B'||(LA8_39 >= '\u000E' && LA8_39 <= '\uFFFF')) ) {s = 22;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA8_10 = input.LA(1);

                        s = -1;
                        if ( (LA8_10=='m') ) {s = 34;}

                        else if ( ((LA8_10 >= 'a' && LA8_10 <= 'l')||(LA8_10 >= 'n' && LA8_10 <= 'z')) ) {s = 32;}

                        else if ( ((LA8_10 >= 'A' && LA8_10 <= 'Z')) ) {s = 33;}

                        else if ( ((LA8_10 >= '\u0000' && LA8_10 <= '\u0007')||LA8_10=='\u000B'||(LA8_10 >= '\u000E' && LA8_10 <= '.')||(LA8_10 >= '0' && LA8_10 <= '9')||(LA8_10 >= ';' && LA8_10 <= '<')||(LA8_10 >= '?' && LA8_10 <= '@')||(LA8_10 >= '[' && LA8_10 <= '`')||(LA8_10 >= '{' && LA8_10 <= '\uFFFF')) ) {s = 18;}

                        else if ( (LA8_10=='\b'||LA8_10=='\f') ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}
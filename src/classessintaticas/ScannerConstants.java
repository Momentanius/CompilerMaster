package classessintaticas;

import br.univali.Ailton_Joao.Leitor;

public interface ScannerConstants
{
    int[] SCANNER_TABLE_INDEXES = 
    {
        0,
        92,
        96,
        97,
        288,
        288,
        289,
        480,
        480,
        480,
        481,
        482,
        482,
        483,
        483,
        485,
        549,
        549,
        549,
        551,
        552,
        554,
        617,
        617,
        617,
        617,
        680,
        743,
        806,
        869,
        932,
        995,
        1058,
        1121,
        1184,
        1247,
        1310,
        1310,
        1311,
        1311,
        1311,
        1311,
        1502,
        1502,
        1693,
        1693,
        1693,
        1693,
        1790,
        1981,
        1991,
        1991,
        1991,
        1991,
        1991,
        1991,
        2054,
        2117,
        2180,
        2243,
        2306,
        2369,
        2432,
        2495,
        2558,
        2621,
        2684,
        2747,
        2810,
        2873,
        2936,
        2999,
        3062,
        3125,
        3125,
        3316,
        3326,
        3389,
        3452,
        3515,
        3578,
        3641,
        3704,
        3767,
        3830,
        3893,
        3956,
        4019,
        4082,
        4145,
        4208,
        4271,
        4334,
        4397,
        4460,
        4523,
        4586,
        4649,
        4712,
        4775,
        4838,
        4901,
        4964,
        5027,
        5090,
        5153,
        5216,
        5279,
        5342,
        5405,
        5468,
        5531,
        5594,
        5657,
        5720,
        5783,
        5846,
        5909,
        5972,
        6035,
        6098
    };

    int[][] SCANNER_TABLE = new Leitor().getMatriz("arquivoTabela.txt");
    

    int[] TOKEN_STATE = {  0,   0,  62,  -1,  30,  36,  -1,  50,  51,  28,  26,  45,  27,  44,  29,   2,  47,  46,  55,  31,  54,  63,  48,  49,  38,  63,  63,  63,  63,  63,  63,  63,  63,  63,  63,  63,  52,  37,  53,  39,  59,   4,  60,   5,  43,  32,  33,  43,  42,  -1,  35,  57,  58,  56,  34,  63,  63,  63,  63,   9,  63,  63,  63,  63,   6,  12,  63,  63,  63,  63,  63,  63,  63,  61,  42,   3,  63,  63,  63,  63,  63,  63,  14,  63,  10,  22,  63,  63,  63,  25,  63,  63,  63,  63,  63,  23,  15,  20,  63,   7,  63,  63,  18,  63,  40,  24,  16,  63,  63,  13,  63,  41,  63,  63,   8,  17,  21,  63,  19,  11 };

    String[] SCANNER_ERROR =
    {
        "Caractere não esperado",
        "",
        "",
        "Erro identificando VALOR_STRING",
        "",
        "",
        "Erro identificando VALOR_CHAR",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando NUM_REAL",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
    };

}

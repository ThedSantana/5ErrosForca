package db;

import java.util.ArrayList;
import java.util.List;

import model.Palavra;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * @author Hellen
 *
 */
public class SqliteHelper extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "cinco_erros";

	private static final String TABLE_FORCA = "forca";
	private static final String TABLE_PONTUACAO = "pontuacao";
	private static final String TABLE_CONTAGEM = "contagem";

	private static final String ID = "id";
	private static final String PALAVRA = "palavra";
	private static final String STATUS = "status";
	private static final String TEMPO = "tempo";
	private static final String DIA = "dia";
	private static final String ERRO = "erro";
	private static final String VITORIA = "vitoria";
	private static final String DERROTA = "derrota";

	SQLiteDatabase db;

	public SqliteHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		try {
			String CREATE_TABLE_FORCA = "CREATE TABLE " + TABLE_FORCA + " ("
					+ ID + " INTEGER PRIMARY KEY, " + PALAVRA + " TEXT, "
					+ STATUS + " INTEGER " + ")";
			db.execSQL(CREATE_TABLE_FORCA);

			String CREATE_TABLE_PONTUACAO = "CREATE TABLE " + TABLE_PONTUACAO
					+ " (" + ID + " INTEGER PRIMARY KEY, " + DIA + " TEXT, "
					+ TEMPO + " TEXT, " + ERRO + " INTEGER " + ")";
			db.execSQL(CREATE_TABLE_PONTUACAO);

			String CREATE_TABLE_CONTAGEM = "CREATE TABLE " + TABLE_CONTAGEM
					+ " (" + ID + " INTEGER PRIMARY KEY, " + VITORIA
					+ " INTEGER, " + DERROTA + " INTEGER " + ")";
			db.execSQL(CREATE_TABLE_CONTAGEM);

			List<Palavra> palavras = new ArrayList<Palavra>();

			// 10
			palavras.add(new Palavra("FORCA", 0));
			palavras.add(new Palavra("BEIJO", 0));
			palavras.add(new Palavra("HONRA", 0));
			palavras.add(new Palavra("PONTA", 0));
			palavras.add(new Palavra("TAMPA", 0));
			palavras.add(new Palavra("RESTO", 0));
			palavras.add(new Palavra("CESTA", 0));
			palavras.add(new Palavra("LESTE", 0));
			palavras.add(new Palavra("VIRUS", 0));
			palavras.add(new Palavra("LENTO", 0));

			// 20
			palavras.add(new Palavra("PONTE", 0));
			palavras.add(new Palavra("OESTE", 0));
			palavras.add(new Palavra("TRAVE", 0));
			palavras.add(new Palavra("OUTRO", 0));
			palavras.add(new Palavra("CONTO", 0));
			palavras.add(new Palavra("MONTE", 0));
			palavras.add(new Palavra("TESTE", 0));
			palavras.add(new Palavra("LINDA", 0));
			palavras.add(new Palavra("MENTE", 0));
			palavras.add(new Palavra("LEQUE", 0));

			// 30
			palavras.add(new Palavra("MARTE", 0));
			palavras.add(new Palavra("MISTO", 0));
			palavras.add(new Palavra("AREIA", 0));
			palavras.add(new Palavra("LARVA", 0));
			palavras.add(new Palavra("CARRO", 0));
			palavras.add(new Palavra("SANTO", 0));
			palavras.add(new Palavra("AGUIA", 0));
			palavras.add(new Palavra("AMIGA", 0));
			palavras.add(new Palavra("BALDE", 0));
			palavras.add(new Palavra("LEITE", 0));

			// 40
			palavras.add(new Palavra("CALDA", 0));
			palavras.add(new Palavra("DISCO", 0));
			palavras.add(new Palavra("ELITE", 0));
			palavras.add(new Palavra("FESTA", 0));
			palavras.add(new Palavra("GAITA", 0));
			palavras.add(new Palavra("JAULA", 0));
			palavras.add(new Palavra("ACHAR", 0));
			palavras.add(new Palavra("MASSA", 0));
			palavras.add(new Palavra("NICHO", 0));
			palavras.add(new Palavra("ONTEM", 0));

			// 50
			palavras.add(new Palavra("PLANO", 0));
			palavras.add(new Palavra("QUERO", 0));
			palavras.add(new Palavra("RISCO", 0));
			palavras.add(new Palavra("SEXTA", 0));
			palavras.add(new Palavra("TORTA", 0));
			palavras.add(new Palavra("VIOLA", 0));
			palavras.add(new Palavra("FUNDO", 0));
			palavras.add(new Palavra("DENTE", 0));
			palavras.add(new Palavra("MUNDO", 0));
			palavras.add(new Palavra("FENDA", 0));

			// 60
			palavras.add(new Palavra("OLHOS", 0));
			palavras.add(new Palavra("MOLDE", 0));
			palavras.add(new Palavra("FEIRA", 0));
			palavras.add(new Palavra("QUILO", 0));
			palavras.add(new Palavra("ZEBRA", 0));
			palavras.add(new Palavra("HORTA", 0));
			palavras.add(new Palavra("BLUSA", 0));
			palavras.add(new Palavra("ASTRO", 0));
			palavras.add(new Palavra("IRADO", 0));
			palavras.add(new Palavra("UMIDO", 0));

			// 70
			palavras.add(new Palavra("GOSTO", 0));
			palavras.add(new Palavra("ESTAR", 0));
			palavras.add(new Palavra("BANCO", 0));
			palavras.add(new Palavra("TRAPO", 0));
			palavras.add(new Palavra("CORPO", 0));
			palavras.add(new Palavra("ANTES", 0));
			palavras.add(new Palavra("ARROZ", 0));
			palavras.add(new Palavra("MURAL", 0));
			palavras.add(new Palavra("NAVAL", 0));
			palavras.add(new Palavra("IMPAR", 0));

			// 80
			palavras.add(new Palavra("DOLAR", 0));
			palavras.add(new Palavra("FALAR", 0));
			palavras.add(new Palavra("RURAL", 0));
			palavras.add(new Palavra("SACAR", 0));
			palavras.add(new Palavra("UIVAR", 0));
			palavras.add(new Palavra("VALER", 0));
			palavras.add(new Palavra("ZELAR", 0));
			palavras.add(new Palavra("GRITO", 0));
			palavras.add(new Palavra("TRAIR", 0));
			palavras.add(new Palavra("LIGAR", 0));

			// 90
			palavras.add(new Palavra("EXTRA", 0));
			palavras.add(new Palavra("BONDE", 0));
			palavras.add(new Palavra("AJUDA", 0));
			palavras.add(new Palavra("DITAR", 0));
			palavras.add(new Palavra("AFETO", 0));
			palavras.add(new Palavra("FAIXA", 0));
			palavras.add(new Palavra("LEVAR", 0));
			palavras.add(new Palavra("JOGOS", 0));
			palavras.add(new Palavra("RADIO", 0));
			palavras.add(new Palavra("QUASE", 0));

			// 100
			palavras.add(new Palavra("VIDRO", 0));
			palavras.add(new Palavra("VAPOR", 0));
			palavras.add(new Palavra("COMUM", 0));
			palavras.add(new Palavra("SONHO", 0));
			palavras.add(new Palavra("HOTEL", 0));
			palavras.add(new Palavra("NINHO", 0));
			palavras.add(new Palavra("NUNCA", 0));
			palavras.add(new Palavra("UNICO", 0));
			palavras.add(new Palavra("POUCO", 0));
			palavras.add(new Palavra("JARRO", 0));

			// 110
			palavras.add(new Palavra("VERBO", 0));
			palavras.add(new Palavra("BANHO", 0));
			palavras.add(new Palavra("BAIXO", 0));
			palavras.add(new Palavra("DENSO", 0));
			palavras.add(new Palavra("OLHAR", 0));
			palavras.add(new Palavra("SECAR", 0));
			palavras.add(new Palavra("GRAVE", 0));
			palavras.add(new Palavra("FREIO", 0));
			palavras.add(new Palavra("GENTE", 0));
			palavras.add(new Palavra("NAVIO", 0));

			// 120
			palavras.add(new Palavra("DIZER", 0));
			palavras.add(new Palavra("PODRE", 0));
			palavras.add(new Palavra("ECOAR", 0));
			palavras.add(new Palavra("ZINCO", 0));
			palavras.add(new Palavra("COBRA", 0));
			palavras.add(new Palavra("JURAR", 0));
			palavras.add(new Palavra("TOUCA", 0));
			palavras.add(new Palavra("USADO", 0));
			palavras.add(new Palavra("OMBRO", 0));
			palavras.add(new Palavra("BOLHA", 0));

			// 130
			palavras.add(new Palavra("FERIR", 0));
			palavras.add(new Palavra("FIADO", 0));
			palavras.add(new Palavra("GRILO", 0));
			palavras.add(new Palavra("RENDA", 0));
			palavras.add(new Palavra("ASSAR", 0));
			palavras.add(new Palavra("AFIAR", 0));
			palavras.add(new Palavra("ERRAR", 0));
			palavras.add(new Palavra("CURVA", 0));
			palavras.add(new Palavra("PADRE", 0));
			palavras.add(new Palavra("NOTAR", 0));

			// 140
			palavras.add(new Palavra("BESTA", 0));
			palavras.add(new Palavra("LUTAR", 0));
			palavras.add(new Palavra("PANDA", 0));
			palavras.add(new Palavra("ROSCA", 0));
			palavras.add(new Palavra("ORDEM", 0));
			palavras.add(new Palavra("SOLAR", 0));
			palavras.add(new Palavra("NOZES", 0));
			palavras.add(new Palavra("TANGO", 0));
			palavras.add(new Palavra("BOLSA", 0));
			palavras.add(new Palavra("SAMBA", 0));

			// 150
			palavras.add(new Palavra("VULTO", 0));
			palavras.add(new Palavra("CINCO", 0));
			palavras.add(new Palavra("OUVIR", 0));
			palavras.add(new Palavra("IDOLO", 0));
			palavras.add(new Palavra("CHUTE", 0));
			palavras.add(new Palavra("JARRA", 0));
			palavras.add(new Palavra("TREZE", 0));
			palavras.add(new Palavra("VITAL", 0));
			palavras.add(new Palavra("SABER", 0));
			palavras.add(new Palavra("VINTE", 0));

			// 160
			palavras.add(new Palavra("PENTE", 0));
			palavras.add(new Palavra("FORTE", 0));
			palavras.add(new Palavra("MARCA", 0));
			palavras.add(new Palavra("COALA", 0));
			palavras.add(new Palavra("FRACO", 0));
			palavras.add(new Palavra("ZORRA", 0));
			palavras.add(new Palavra("LIDAR", 0));
			palavras.add(new Palavra("MILHO", 0));
			palavras.add(new Palavra("GRUTA", 0));
			palavras.add(new Palavra("PEDIR", 0));

			// 170
			palavras.add(new Palavra("AUTOR", 0));
			palavras.add(new Palavra("NARIZ", 0));
			palavras.add(new Palavra("QUIBE", 0));
			palavras.add(new Palavra("REINO", 0));
			palavras.add(new Palavra("TROTE", 0));
			palavras.add(new Palavra("AMORA", 0));
			palavras.add(new Palavra("LEGAL", 0));
			palavras.add(new Palavra("TRATO", 0));
			palavras.add(new Palavra("LEITO", 0));
			palavras.add(new Palavra("PODER", 0));

			// 180
			palavras.add(new Palavra("LIVRO", 0));
			palavras.add(new Palavra("UNHAS", 0));
			palavras.add(new Palavra("PUNHO", 0));
			palavras.add(new Palavra("MORTE", 0));
			palavras.add(new Palavra("LIVRE", 0));
			palavras.add(new Palavra("CINTO", 0));
			palavras.add(new Palavra("MAJOR", 0));
			palavras.add(new Palavra("LONGE", 0));
			palavras.add(new Palavra("AMBOS", 0));
			palavras.add(new Palavra("CRIME", 0));

			// 190
			palavras.add(new Palavra("QUEDA", 0));
			palavras.add(new Palavra("DESTE", 0));
			palavras.add(new Palavra("JULHO", 0));
			palavras.add(new Palavra("PARTE", 0));
			palavras.add(new Palavra("UNTAR", 0));
			palavras.add(new Palavra("VISTA", 0));
			palavras.add(new Palavra("BACIA", 0));
			palavras.add(new Palavra("RONCO", 0));
			palavras.add(new Palavra("NUVEM", 0));
			palavras.add(new Palavra("FILME", 0));

			// 200
			palavras.add(new Palavra("VIDEO", 0));
			palavras.add(new Palavra("PASSO", 0));
			palavras.add(new Palavra("TERRA", 0));
			palavras.add(new Palavra("ANZOL", 0));
			palavras.add(new Palavra("CACHO", 0));
			palavras.add(new Palavra("SERRA", 0));
			palavras.add(new Palavra("CAMPO", 0));
			palavras.add(new Palavra("PAPAI", 0));
			palavras.add(new Palavra("CLIMA", 0));
			palavras.add(new Palavra("TRIGO", 0));

			// 210
			palavras.add(new Palavra("MANGA", 0));
			palavras.add(new Palavra("GALHO", 0));
			palavras.add(new Palavra("TREVO", 0));
			palavras.add(new Palavra("VOTAR", 0));
			palavras.add(new Palavra("FUNIL", 0));
			palavras.add(new Palavra("COMER", 0));
			palavras.add(new Palavra("VELHA", 0));
			palavras.add(new Palavra("CASAL", 0));
			palavras.add(new Palavra("CRISE", 0));
			palavras.add(new Palavra("PINGA", 0));

			// 220
			palavras.add(new Palavra("JOGAR", 0));
			palavras.add(new Palavra("EXPOR", 0));
			palavras.add(new Palavra("IDEIA", 0));
			palavras.add(new Palavra("VOGAL", 0));
			palavras.add(new Palavra("MEDIR", 0));
			palavras.add(new Palavra("IDEAL", 0));
			palavras.add(new Palavra("ACESO", 0));
			palavras.add(new Palavra("FALIR", 0));
			palavras.add(new Palavra("VOZES", 0));
			palavras.add(new Palavra("INDIO", 0));

			// 230
			palavras.add(new Palavra("CHEFE", 0));
			palavras.add(new Palavra("FATOS", 0));
			palavras.add(new Palavra("BOATE", 0));
			palavras.add(new Palavra("SOBRE", 0));
			palavras.add(new Palavra("AINDA", 0));
			palavras.add(new Palavra("TROPA", 0));
			palavras.add(new Palavra("LOCAL", 0));
			palavras.add(new Palavra("BAZAR", 0));
			palavras.add(new Palavra("ALUNO", 0));
			palavras.add(new Palavra("TERMO", 0));

			// 240
			palavras.add(new Palavra("CURTO", 0));
			palavras.add(new Palavra("ALGUM", 0));
			palavras.add(new Palavra("PRIMO", 0));
			palavras.add(new Palavra("REZAR", 0));
			palavras.add(new Palavra("BRAVO", 0));
			palavras.add(new Palavra("CAIXA", 0));
			palavras.add(new Palavra("VENDA", 0));
			palavras.add(new Palavra("SABIA", 0));
			palavras.add(new Palavra("PRAGA", 0));
			palavras.add(new Palavra("PRATO", 0));

			// 250
			palavras.add(new Palavra("SETOR", 0));
			palavras.add(new Palavra("PASTO", 0));
			palavras.add(new Palavra("CERCA", 0));
			palavras.add(new Palavra("CLUBE", 0));
			palavras.add(new Palavra("RASPA", 0));
			palavras.add(new Palavra("PREGO", 0));
			palavras.add(new Palavra("GELAR", 0));
			palavras.add(new Palavra("COLAR", 0));
			palavras.add(new Palavra("VALOR", 0));
			palavras.add(new Palavra("PAPEL", 0));

			// 260
			palavras.add(new Palavra("DUPLA", 0));
			palavras.add(new Palavra("RUINS", 0));
			palavras.add(new Palavra("JEANS", 0));
			palavras.add(new Palavra("GORDO", 0));
			palavras.add(new Palavra("SENHA", 0));
			palavras.add(new Palavra("HOMEM", 0));
			palavras.add(new Palavra("ERVAS", 0));
			palavras.add(new Palavra("CONTA", 0));
			palavras.add(new Palavra("SITIO", 0));
			palavras.add(new Palavra("RAPAZ", 0));

			// 270
			palavras.add(new Palavra("ROLHA", 0));
			palavras.add(new Palavra("PEIXE", 0));
			palavras.add(new Palavra("LINHA", 0));
			palavras.add(new Palavra("FERPA", 0));
			palavras.add(new Palavra("TACAR", 0));
			palavras.add(new Palavra("NOBRE", 0));
			palavras.add(new Palavra("OBRAR", 0));
			palavras.add(new Palavra("NOIVA", 0));
			palavras.add(new Palavra("TELHA", 0));
			palavras.add(new Palavra("OBTER", 0));

			// 280
			palavras.add(new Palavra("ALTAR", 0));
			palavras.add(new Palavra("BARCA", 0));
			palavras.add(new Palavra("CALMO", 0));
			palavras.add(new Palavra("DURAR", 0));
			palavras.add(new Palavra("FICHA", 0));
			palavras.add(new Palavra("GASTO", 0));
			palavras.add(new Palavra("LOTAR", 0));
			palavras.add(new Palavra("MAGRO", 0));
			palavras.add(new Palavra("PINGO", 0));
			palavras.add(new Palavra("ROSTO", 0));

			// 290
			palavras.add(new Palavra("SOCAR", 0));
			palavras.add(new Palavra("TRECO", 0));
			palavras.add(new Palavra("VIVER", 0));
			palavras.add(new Palavra("ZERAR", 0));
			palavras.add(new Palavra("ATRIZ", 0));
			palavras.add(new Palavra("BEBER", 0));
			palavras.add(new Palavra("CALVO", 0));
			palavras.add(new Palavra("DIETA", 0));
			palavras.add(new Palavra("FONTE", 0));
			palavras.add(new Palavra("LICOR", 0));

			// 300
			palavras.add(new Palavra("METAS", 0));
			palavras.add(new Palavra("PASTA", 0));
			palavras.add(new Palavra("SALTO", 0));
			palavras.add(new Palavra("TINTA", 0));
			palavras.add(new Palavra("VERDE", 0));
			palavras.add(new Palavra("ATIVO", 0));
			palavras.add(new Palavra("BATOM", 0));
			palavras.add(new Palavra("CASAR", 0));
			palavras.add(new Palavra("CHAVE", 0));
			palavras.add(new Palavra("FURTO", 0));

			// 310
			palavras.add(new Palavra("LOUCO", 0));
			palavras.add(new Palavra("MENTA", 0));
			palavras.add(new Palavra("PRAZO", 0));
			palavras.add(new Palavra("REFEM", 0));
			palavras.add(new Palavra("SUMIR", 0));
			palavras.add(new Palavra("TRAVA", 0));
			palavras.add(new Palavra("BICHO", 0));
			palavras.add(new Palavra("COFRE", 0));
			palavras.add(new Palavra("FOLIA", 0));
			palavras.add(new Palavra("ABRIL", 0));

			// 320
			palavras.add(new Palavra("BOATO", 0));
			palavras.add(new Palavra("FOLHA", 0));
			palavras.add(new Palavra("LIMPO", 0));
			palavras.add(new Palavra("MIRAR", 0));
			palavras.add(new Palavra("PUDOR", 0));
			palavras.add(new Palavra("SONDA", 0));
			palavras.add(new Palavra("TOSSE", 0));
			palavras.add(new Palavra("COISA", 0));
			palavras.add(new Palavra("ADIAR", 0));
			palavras.add(new Palavra("LERDO", 0));

			// 330
			palavras.add(new Palavra("DROGA", 0));
			palavras.add(new Palavra("GATOS", 0));
			palavras.add(new Palavra("MUMIA", 0));
			palavras.add(new Palavra("POMAR", 0));
			palavras.add(new Palavra("DOPAR", 0));
			palavras.add(new Palavra("FERRO", 0));
			palavras.add(new Palavra("BOLOR", 0));
			palavras.add(new Palavra("GRAMA", 0));
			palavras.add(new Palavra("LITRO", 0));
			palavras.add(new Palavra("METRO", 0));

			// 340
			palavras.add(new Palavra("PRESA", 0));
			palavras.add(new Palavra("LAGOA", 0));
			palavras.add(new Palavra("MOSCA", 0));
			palavras.add(new Palavra("GERAR", 0));
			palavras.add(new Palavra("BOIAR", 0));
			palavras.add(new Palavra("AGITO", 0));
			palavras.add(new Palavra("FOGOS", 0));
			palavras.add(new Palavra("GRADE", 0));
			palavras.add(new Palavra("MOLAR", 0));
			palavras.add(new Palavra("PERNA", 0));

			// 350
			palavras.add(new Palavra("FORUM", 0));
			palavras.add(new Palavra("BRASA", 0));
			palavras.add(new Palavra("AGORA", 0));
			palavras.add(new Palavra("PRATA", 0));
			palavras.add(new Palavra("FROTA", 0));
			palavras.add(new Palavra("AMPLO", 0));
			palavras.add(new Palavra("BRISA", 0));
			palavras.add(new Palavra("CORDA", 0));
			palavras.add(new Palavra("FOLGA", 0));
			palavras.add(new Palavra("CORVO", 0));

			// 360
			palavras.add(new Palavra("ANEXO", 0));
			palavras.add(new Palavra("FILAR", 0));
			palavras.add(new Palavra("COUVE", 0));
			palavras.add(new Palavra("POLVO", 0));
			palavras.add(new Palavra("CURAR", 0));
			palavras.add(new Palavra("AXILA", 0));
			palavras.add(new Palavra("CUPOM", 0));
			palavras.add(new Palavra("AVEIA", 0));
			palavras.add(new Palavra("CARGA", 0));
			palavras.add(new Palavra("AZEDO", 0));

			// 370
			palavras.add(new Palavra("CASCO", 0));
			palavras.add(new Palavra("CHATO", 0));
			palavras.add(new Palavra("LONGO", 0));
			palavras.add(new Palavra("COICE", 0));
			palavras.add(new Palavra("PESTE", 0));
			palavras.add(new Palavra("CHAPA", 0));
			palavras.add(new Palavra("TOCHA", 0));
			palavras.add(new Palavra("CICLO", 0));
			palavras.add(new Palavra("MELAR", 0));
			palavras.add(new Palavra("CIRCO", 0));

			// 380
			palavras.add(new Palavra("TRONO", 0));
			palavras.add(new Palavra("COBRE", 0));
			palavras.add(new Palavra("TOPAR", 0));
			palavras.add(new Palavra("CRAVO", 0));
			palavras.add(new Palavra("FATAL", 0));
			palavras.add(new Palavra("CHEIO", 0));
			palavras.add(new Palavra("LAVAR", 0));
			palavras.add(new Palavra("BROTO", 0));
			palavras.add(new Palavra("DISTO", 0));
			palavras.add(new Palavra("RETER", 0));

			// 390
			palavras.add(new Palavra("PARTO", 0));
			palavras.add(new Palavra("FEROZ", 0));
			palavras.add(new Palavra("ANDAR", 0));
			palavras.add(new Palavra("PISCA", 0));
			palavras.add(new Palavra("TROCO", 0));
			palavras.add(new Palavra("PORCO", 0));
			palavras.add(new Palavra("TEMOR", 0));
			palavras.add(new Palavra("RAIOS", 0));
			palavras.add(new Palavra("LUZES", 0));
			palavras.add(new Palavra("LENTE", 0));

			// 400
			palavras.add(new Palavra("PRATO", 0));
			palavras.add(new Palavra("ROUPA", 0));
			palavras.add(new Palavra("FIRME", 0));
			palavras.add(new Palavra("DEDAL", 0));
			palavras.add(new Palavra("FEDER", 0));
			palavras.add(new Palavra("DOIDO", 0));
			palavras.add(new Palavra("VENTO", 0));
			palavras.add(new Palavra("BORDA", 0));
			palavras.add(new Palavra("PIZZA", 0));
			palavras.add(new Palavra("VITRO", 0));

			// 410
			palavras.add(new Palavra("BISPO", 0));
			palavras.add(new Palavra("FATOR", 0));
			palavras.add(new Palavra("LATIR", 0));
			palavras.add(new Palavra("MALTE", 0));
			palavras.add(new Palavra("POSTE", 0));
			palavras.add(new Palavra("SALSA", 0));
			palavras.add(new Palavra("TALCO", 0));
			palavras.add(new Palavra("DOSAR", 0));
			palavras.add(new Palavra("ZUMBI", 0));
			palavras.add(new Palavra("FEDOR", 0));

			// 420
			palavras.add(new Palavra("LOMBO", 0));
			palavras.add(new Palavra("PLACA", 0));
			palavras.add(new Palavra("CISTO", 0));
			palavras.add(new Palavra("POMBO", 0));
			palavras.add(new Palavra("TOSCO", 0));
			palavras.add(new Palavra("COSTA", 0));
			palavras.add(new Palavra("SUADO", 0));
			palavras.add(new Palavra("SORTE", 0));
			palavras.add(new Palavra("TOCAR", 0));
			palavras.add(new Palavra("POSTO", 0));

			// 430
			palavras.add(new Palavra("ARMAR", 0));
			palavras.add(new Palavra("BOTAR", 0));
			palavras.add(new Palavra("FORNO", 0));
			palavras.add(new Palavra("CULPA", 0));
			palavras.add(new Palavra("NATAL", 0));
			palavras.add(new Palavra("JUSTO", 0));
			palavras.add(new Palavra("ILHAS", 0));
			palavras.add(new Palavra("PEDAL", 0));
			palavras.add(new Palavra("LETAL", 0));
			palavras.add(new Palavra("PILHA", 0));

			// 440
			palavras.add(new Palavra("TRUCO", 0));
			palavras.add(new Palavra("BURCA", 0));
			palavras.add(new Palavra("GIRAR", 0));
			palavras.add(new Palavra("MILHA", 0));
			palavras.add(new Palavra("COMBO", 0));
			palavras.add(new Palavra("MOTOR", 0));
			palavras.add(new Palavra("MULTA", 0));
			palavras.add(new Palavra("LISTA", 0));
			palavras.add(new Palavra("TONTO", 0));
			palavras.add(new Palavra("PILHA", 0));

			// 450
			palavras.add(new Palavra("RUGAS", 0));
			palavras.add(new Palavra("LUGAR", 0));
			palavras.add(new Palavra("METAL", 0));
			palavras.add(new Palavra("FAROL", 0));
			palavras.add(new Palavra("MOITA", 0));
			palavras.add(new Palavra("FRETE", 0));
			palavras.add(new Palavra("TANTO", 0));
			palavras.add(new Palavra("DEPOR", 0));
			palavras.add(new Palavra("FILHO", 0));
			palavras.add(new Palavra("GOLPE", 0));

			// 460
			palavras.add(new Palavra("FALSO", 0));
			palavras.add(new Palavra("VOLTA", 0));
			palavras.add(new Palavra("BARRA", 0));
			palavras.add(new Palavra("SERVO", 0));
			palavras.add(new Palavra("CASOS", 0));
			palavras.add(new Palavra("ETAPA", 0));
			palavras.add(new Palavra("REGAR", 0));
			palavras.add(new Palavra("FAZER", 0));
			palavras.add(new Palavra("CRIAR", 0));
			palavras.add(new Palavra("HORAS", 0));

			// 470
			palavras.add(new Palavra("MENOR", 0));
			palavras.add(new Palavra("BASTA", 0));
			palavras.add(new Palavra("ABRIR", 0));
			palavras.add(new Palavra("VERSO", 0));
			palavras.add(new Palavra("NORTE", 0));
			palavras.add(new Palavra("GERAL", 0));
			palavras.add(new Palavra("FIXAR", 0));
			palavras.add(new Palavra("MAIOR", 0));
			palavras.add(new Palavra("NEGAR", 0));
			palavras.add(new Palavra("VELAR", 0));

			// 480
			palavras.add(new Palavra("USUAL", 0));
			palavras.add(new Palavra("SUSTO", 0));
			palavras.add(new Palavra("NEVAR", 0));
			palavras.add(new Palavra("FAVOR", 0));
			palavras.add(new Palavra("CAUSA", 0));
			palavras.add(new Palavra("TELAS", 0));
			palavras.add(new Palavra("MUITO", 0));
			palavras.add(new Palavra("TEXTO", 0));
			palavras.add(new Palavra("MACIO", 0));
			palavras.add(new Palavra("TOTAL", 0));

			// 490
			palavras.add(new Palavra("ZUMBA", 0));
			palavras.add(new Palavra("FLUXO", 0));
			palavras.add(new Palavra("AVISO", 0));
			palavras.add(new Palavra("PINHA", 0));
			palavras.add(new Palavra("SOMAR", 0));
			palavras.add(new Palavra("POLPA", 0));
			palavras.add(new Palavra("VIGAS", 0));
			palavras.add(new Palavra("PIQUE", 0));
			palavras.add(new Palavra("VELHO", 0));
			palavras.add(new Palavra("GOLPE", 0));

			// 499
			palavras.add(new Palavra("VETOR", 0));
			palavras.add(new Palavra("LESMA", 0));
			palavras.add(new Palavra("PACTO", 0));
			palavras.add(new Palavra("RONDA", 0));
			palavras.add(new Palavra("TARDE", 0));
			palavras.add(new Palavra("LANCE", 0));
			palavras.add(new Palavra("NEURA", 0));
			palavras.add(new Palavra("PERTO", 0));
			palavras.add(new Palavra("FELIZ", 0));
			palavras.add(new Palavra("FINAL", 0));

			for (Palavra p : palavras) {
				db.execSQL("INSERT INTO " + TABLE_FORCA + " (" + PALAVRA + ", "
						+ STATUS + ") VALUES ('" + p.getPalavra() + "', 0);");
			}
			String sql = "INSERT INTO " + TABLE_CONTAGEM + " (" + VITORIA
					+ ", " + DERROTA + ") VALUES (0, 0);";
			db.execSQL(sql);
		} catch (SQLiteException e) {
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_FORCA);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_PONTUACAO);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTAGEM);
		onCreate(db);
	}

	public void concluida(int idPalavra, String dia, String tempo, int erro) {
		SQLiteDatabase db = this.getWritableDatabase();
		String updateForca = "UPDATE " + TABLE_FORCA + " SET " + STATUS
				+ "= 1 WHERE " + ID + " = " + idPalavra;
		db.execSQL(updateForca);

		ContentValues values = new ContentValues();
		values.put(DIA, dia);
		values.put(TEMPO, tempo);
		values.put(ERRO, erro);
		db.insert(TABLE_PONTUACAO, null, values);
		db.close();
	}

	public void atualizaContagem(boolean venceu) {
		int[] contagem = getContagem();
		String updateContagem = "UPDATE " + TABLE_CONTAGEM + " SET ";
		if (venceu) {
			updateContagem += VITORIA + "= " + (contagem[0] + 1);
		} else {
			updateContagem += DERROTA + "= " + (contagem[1] + 1);
		}
		updateContagem += " where " + ID + "= 1";
		SQLiteDatabase db = this.getWritableDatabase();
		db.execSQL(updateContagem);
		db.close();
	}

	public int[] getContagem() {
		int[] contagem = new int[2];
		SQLiteDatabase db = this.getWritableDatabase();
		String sql = "select " + VITORIA + " from " + TABLE_CONTAGEM
				+ " limit 1";
		try {
			Cursor c = db.rawQuery(sql, null);
			if (c.moveToFirst()) {
				do {
					contagem[0] = c.getInt(0);
				} while (c.moveToNext());
			}
		} catch (Exception e) {
		}
		sql = "select " + DERROTA + " from " + TABLE_CONTAGEM + " limit 1";
		try {
			Cursor c = db.rawQuery(sql, null);
			if (c.moveToFirst()) {
				do {
					contagem[1] = c.getInt(0);
				} while (c.moveToNext());
			}
		} catch (Exception e) {
		} finally {
			db.close();
		}
		return contagem;
	}

	public Palavra pegarPalavra() {
		Palavra p = new Palavra();
		SQLiteDatabase db = this.getWritableDatabase();
		String sql = "select * from " + TABLE_FORCA
				+ " where status = 0 limit 1";
		try {

			Cursor c = db.rawQuery(sql, null);
			if (c.moveToFirst()) {
				do {
					p.setId(c.getInt(0));
					p.setPalavra(c.getString(1));
					p.setStatus(c.getInt(2));
				} while (c.moveToNext());
			}
		} catch (Exception e) {
		} finally {
			db.close();
		}
		return p;
	}

	public boolean temPalavras() {
		Palavra p = new Palavra();
		SQLiteDatabase db = this.getWritableDatabase();
		String sql = "select * from " + TABLE_FORCA + " where id = 500";
		try {

			Cursor c = db.rawQuery(sql, null);
			if (c.moveToFirst()) {
				do {
					p.setId(c.getInt(0));
					p.setPalavra(c.getString(1));
					p.setStatus(c.getInt(2));
				} while (c.moveToNext());
			}
		} catch (Exception e) {
			Log.d("não seleciona", "NADA");
		} finally {
			db.close();
		}
		if (p.getStatus() == 1) {
			return false;
		}
		return true;
	}

	public List<String> pegarTempos() {
		List<String> tempos = new ArrayList<String>();
		SQLiteDatabase db = this.getWritableDatabase();
		String sql = "select " + TEMPO + " from " + TABLE_PONTUACAO
				+ " order by tempo ASC limit 4";
		try {

			Cursor c = db.rawQuery(sql, null);
			if (c.moveToFirst()) {
				do {
					tempos.add(new String(c.getString(0)));
				} while (c.moveToNext());
			}
		} catch (Exception e) {
		} finally {
			db.close();
		}
		return tempos;
	}

}

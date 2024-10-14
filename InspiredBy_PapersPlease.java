// The "MainCulminating" class.

/*Program header
Title: Borderline

Name: Andrew Chai

Date:

Description: As an inspector, your job is to approve or decline people from
crossing the border. However, this game will hinder your decision between
following the law or your morals. For example, if a mother doesn't have the
requirements to cross the border, but needs to quickly give medicine to her
sick child, will you break the rules and allow her to pass, or follow them
and decline her from passing, letting her child die?
[requires a lot of critical thinking that involves moral and legal obligations].
*/

import java.awt.*;
import hsa.Console;
import java.applet.*;
import java.io.*;
import java.net.*;

public class InspiredBy_PapersPlease
{
    //Main console
    static Console c;
    //Cheatsheet
    static Console d;
    //Newspaper
    static Console e;
    //Passport
    static Console f;
    //Identity card
    static Console g;
    //Access permit
    static Console h;
    //Time
    static Console j;
    //Instructions
    static Console k;
    //tutorial
    static Console l;
    //Entry ticket
    static Console m;
    //Tokens
    static Console n;
    //Wanted list and puzzle
    static Console o;
    //War EXPLANATION
    static Console p;
    //War ROULETTE
    static Console q;
    //War picture
    static Console r;
    //Picture
    public static Image Pic;
    //turtle class
    static Turtle t;

    public static void main (String[] args) throws IOException
    {
	//main console
	c = new Console ();

	//Wallet
	Wallet bank = new Wallet (0);

	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	//Record data
	BufferedReader fr = new BufferedReader (new FileReader ("Record.txt"));
	Record rec[] = new Record [80];

	String name, height, weight, purpose, duration, DOB, sex, nationCountry, nationSymbol, expire, nationCity, PrintedTime;
	int condition;

	for (int i = 0 ; i < rec.length ; i++)
	{
	    name = fr.readLine ();
	    height = fr.readLine ();
	    weight = fr.readLine ();
	    purpose = fr.readLine ();
	    duration = fr.readLine ();
	    DOB = fr.readLine ();
	    sex = fr.readLine ();
	    nationCountry = fr.readLine ();
	    nationSymbol = fr.readLine ();
	    expire = fr.readLine ();
	    nationCity = fr.readLine ();
	    PrintedTime = fr.readLine ();
	    condition = Integer.parseInt (fr.readLine ());
	    rec [i] = new Record (name, height, weight, purpose, duration, DOB, sex, nationCountry, nationSymbol, expire, nationCity, PrintedTime, condition);
	}

	//declaration
	char user = ' ';
	int penaltyCheck = 2;
	int salary = 0;
	int family = 2;
	int numRoundClear = 0;
	int number, year, month, day, conditionNum;
	int mariusz = 0;
	int success = 0;
	int luckyToken = 0;
	int detain = 0;
	int detainMoney = 0;
	int Record = 0;
	String nameUsed = "";
	int conditionChecker = 0;
	int creed = 0;
	int lofus = 0;
	int shadow = 0;
	int flower = 0;
	int officer = 0;
	int powder = 0;

	//battle
	int AC = 0;
	int Hp = 0;
	int dice = 0;
	int bossAC = 0;
	int bossHp = 0;
	int damage = 0;
	int hitTotal = 0;
	int hit1 = 0;
	int hit2 = 0;
	int hit3 = 0;
	int dam1 = 0;
	int dam2 = 0;
	int dam3 = 0;
	int x = 0;
	int y = 0;
	int bossX = 0;
	int bossY = 0;
	int distanceX = 0;
	int distanceY = 0;

	//Program Header
	IntroScreen ();

	//logging in screen
	LoggingIn ();

	//Mode
	c.println ("A: EASY (HIGHLY RECOMMENDED)");
	c.println ("B: MEDIUM");
	c.println ("C: HARD");
	c.println ();

	//only pass when player chooses properly
	user = c.getChar ();

	do
	{
	    if (!(user == (int) 65 || user == (int) 97 || user == (int) 66 || user == (int) 98 || user == (int) 67 || user == (int) 99))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 65 || user == (int) 97 || user == (int) 66 || user == (int) 98 || user == (int) 67 || user == (int) 99));

	//difficulty will choose the AC, Hp, and money
	if (user == (int) 65 || user == (int) 97)
	{
	    bank.setBalance (1000);
	    AC = 20;
	    Hp = 500;
	    c.println ("________________________________________________________________________________");
	    c.println ("YOUR BANK ACCOUNT: $1000");
	    c.println ("YOUR AC: 20");
	    c.println ("YOUR Hp: 500");
	    c.println ("________________________________________________________________________________");
	}
	else if (user == (int) 66 || user == (int) 98)
	{
	    bank.setBalance (200);
	    AC = 18;
	    Hp = 20;
	    c.println ("________________________________________________________________________________");
	    c.println ("YOUR BANK ACCOUNT: $200");
	    c.println ("YOUR AC: 18");
	    c.println ("YOUR Hp: 20");
	    c.println ("________________________________________________________________________________");
	}
	else
	{
	    AC = 14;
	    Hp = 10;
	    c.println ("________________________________________________________________________________");
	    c.println ("YOUR BANK ACCOUNT: $0");
	    c.println ("YOUR AC: 14");
	    c.println ("YOUR Hp: 10");
	    c.println ("________________________________________________________________________________");
	}
	c.println ();
	delay (1000);

	//Instructions
	c.println ("INSTRUCTIONS");
	c.println ();
	c.println ("YOUR CHARACTER AND OTHER NPCs IN THIS GAME WILL HAVE DIALOGUES. SOME REPLIES AND");
	c.println ("COMMENTS REQUIRE YOUR CHOICES, WHILE MOST ARE AUTOMATIC. THE \"GAME MASTER\" IS");
	c.println ("THE NARRATOR WHO WILL DESCRIBE THE ENVIRONMENT AND SITUATION AROUND YOU. EACH");
	c.println ("ROUND OF THIS GAME IS BASIC AND IDENTICAL, BUT THE DIFFICULTY OF THE GAME WILL");
	c.println ("ADVANCE AS YOU PROGRESS, AND YOU WILL FACE A VARIETY OF CHALLENGES THAT REQUIRE");
	c.println ("PUZZLING SKILLS AND CRITICAL THINKING ABOUT MORALS AND OBLIGATIONS.");

	//continue button
	Continue ();

	//Story
	c.println ("STORY");
	c.println ();
	c.println ("GAME MASTER: YOU ARE BORN INTO A VERY POOR FAMILY. THERE WAS NEVER A DAY WHEN");
	c.println ("YOU DIDN'T WORRY ABOUT FOOD, WATER, MEDICATION, ETC. TO PREVENT YOUR FAMILY FROM");
	c.println ("LIVING A LIFE OF POVERTY, YOU STUDIED EXTREMELY HARD TO HAVE A WELL-PAYING JOB");
	c.println ("IN THE FUTURE. EVERYTHING WAS PROMISING UNTIL A WAR BETWEEN YOUR COUNTRY,");
	c.println ("\"LOFUS,\" AND A NEIGHBOURING COUNTRY, \"OTHARIA,\" OCCURRED. IT WENT ON FOR TEN");
	c.println ("YEARS UNTIL LOFUS CAME OUT VICTORIOUSLY. HOWEVER, YOU AND YOUR FAMILY - MOTHER,");
	c.println ("FATHER, YOUNGER SISTER, AND BROTHER - HAD TO SURVIVE AND SUFFER FOR A VERY LONG");
	c.println ("TIME, WHICH, AS A RESULT, CRUSHED YOUR DREAMS AT THE AGE OF 30 AND PREVENTED YOU");
	c.println ("FROM ESCAPING THE LIFE OF POVERTY.");
	c.println ();
	c.println ("GAME MASTER: OR THAT IS WHAT YOU THOUGHT UNTIL YOU RECEIVED A LETTER FROM THE");
	c.println ("GOVERNMENT.");
	c.println ();
	c.println ("GAME MASTER: IT READS...");

	//continue button
	Continue ();

	//letter
	letter ();

	//continue button
	Continue ();

	//letter description
	c.println ("________________________________________________________________________________");
	c.println ("CONGRATULATIONS!");
	c.println ("THE DECEMBER LABOUR LOTTERY IS COMPLETE. YOUR NAME WAS PULLED.");
	c.println ("FOR IMMEDIATE PLACEMENT, REPORT TO THE MINISTRY OF ADMISSION AT THE APLEN BORDER");
	c.println ("CHECKPOINT.");
	c.println ("SHELTER WILL BE PROVIDED FOR YOU AND YOUR FAMILY IN DISTRICT 13.");
	c.println ("GLORY TO LOFUS.");
	c.println ("________________________________________________________________________________");

	c.println ();
	c.println ("GAME MASTER: YOU IMMEDIATELY ACCEPT THE OFFER AND TRAVEL TO THE CAPITAL ALONG");
	c.println ("WITH YOUR FAMILY. YOU MEET THE \"GENERAL\", YOUR BOSS, AND ARE GUIDED TO YOUR");
	c.println ("NEW HOME. IT IS BIG, BEAUTIFUL, AND CONTAINS EVERYTHING EVERYONE NEEDS TO");
	c.println ("SURVIVE, POSSIBLY EVEN MORE.");
	c.println ();
	c.println ("GAME MASTER: YOU HAVE NEVER SEEN YOUR FAMILY SMILE MORE IN YOUR LIFE THAN WHEN");
	c.println ("THEY SAW THEIR NEW HOME. YOU EVEN SMILE YOURSELF, WHICH YOU DIDN'T KNOW YOU");
	c.println ("COULD UNTIL THAT VERY MOMENT.");
	c.println ();
	c.println ("GAME MASTER: YOUR YOUNGER SIBLINGS PULL YOU TO PLAY, AND YOU GO ALONG WITH THEM");
	c.println ("HAPPILY, COMPLETELY UNAWARE OF THE PART YOU ARE TO PLAY IN THE EVENTS THAT ARE");
	c.println ("ABOUT TO UNFOLD.");

	//continue button
	Continue ();

	//logging in screen
	LoggingInFast2 ();

	//Tutorial
	c.println ("GENERAL: WELCOME, INSPECTOR. CONGRATULATIONS FOR BEING LUCKY TO GET PICKED FOR");
	c.println ("THIS \"PERFECTLY\" SAFE JOB. COME, FOLLOW ME.");
	c.println ();
	c.println ("GAME MASTER: YOU FOLLOW THE GENERAL TO A SMALL STATION BESIDE A HUGE WALL. YOU");
	c.println ("ASSUME THAT IT'S THE BORDER THAT SEPARATES YOUR COUNTRY WITH OTHERS, AND ALSO");
	c.println ("YOUR WORKPLACE.");
	c.println ();
	c.println ("GENERAL: THIS IS WHERE YOU WILL DO YOUR JOB. ALL YOU HAVE TO DO IS APPROVE OR");
	c.println ("DECLINE THE PEOPLE TRYING TO GET ACROSS THE BORDER. SOUNDS PRETTY EASY, HUH?");
	c.println ("I WOULDN'T KNOW. I NEVER DO THESE THINGS. ANYWAYS, SINCE YOU'RE INEXPERIENCED");
	c.println ("IN THIS KIND OF FIELD, I'LL GO THROUGH A QUICK GUIDE WITH YOU.");

	//continue button
	Continue ();

	c.println ("GENERAL: FIRST, THIS SCREEN YOU CAN SEE RIGHT NOW IS THE MAIN SCREEN. IT WILL");
	c.println ("SHOW YOU DESCRIPTIONS OF WHAT YOU SHOULD BE ABLE TO SEE, SUCH AS THE HEIGHT AND");
	c.println ("WEIGHT OF THE PEOPLE CROSSING THE BORDER. IT WILL ALSO RECORD ALL SORTS OF");
	c.println ("DIALOGUES (AS YOU CAN CURRENTLY SEE). DRAG THIS SCREEN TO THE MIDDLE OF THE");
	c.println ("BIGGER SCREEN THAT YOU CALL A COMPUTER BEFORE PRESSING ENTER.");

	//continue button
	Continue ();

	//cheatSheet
	d = new Console (31, 30);
	cheatSheet ();
	c.println ("GENERAL: THIS IS WHAT I LIKE TO CALL A CHEAT SHEET. IT CONTAINS THE COUNTRIES,");
	c.println ("THEIR SYMBOLS, AND CITIES OF THE WORLD OF BORDERLINE. SO, IF YOU ARE LIKE ME WHO");
	c.println ("TENDS TO FORGET THINGS THAT I DO NOT CARE OF, THEN THIS IS A GREAT TOOL FOR YOU");
	c.println ("TO USE DURING YOUR ENCOUNTER WITH OTHER PEOPLE.");

	//continue button
	Continue ();

	//Instruction letter introduction
	k = new Console ();
	InstructionBasic ("WELCOME TO YOUR NEW POSITION AT APLEN BORDER CHECKPOINT.\n\nAPPROVE OR DECLINE PASSPORTS GIVEN BY THE PEOPLE.\n\nENTRY IS RESTRICTED TO LOFUSAN CITIZENS ONLY. DENY ALL FOREIGNERS.");
	c.println ("GENERAL: THIS IS THE INSTRUCTION LIST THAT YOU MUST FOLLOW IN EVERY SHIFT YOU");
	c.println ("TAKE. AS YOU CAN SEE, THERE ARE QUITE A LOT OF SCREENS THAN YOU HAD IMAGINED,");
	c.println ("RIGHT? WELL, DON'T WORRY, BECAUSE THIS IS NOTHING COMPARED TO HOW MANY YOU WILL");
	c.println ("RECEIVE THROUGHOUT THE GAME. THERE WILL BE A LOT MORE OF THESE THINGS WITH");
	c.println ("DIFFERENT INFORMATION THAT YOU MUST USE THROUGHOUT YOUR JOB, SO BE SURE TO");
	c.println ("ORGANIZE YOUR WORKPLACE.");

	//continue button
	Continue ();

	c.println ("GENERAL: LET'S DO A QUICK PRACTICE RUN BEFORE I GO HOME AND SLEEP.");
	c.println ("YOU WILL AUTOMATICALLY SAY A FEW DIALOGUES FOR YOU TO UNDERSTAND ABOUT THE NPC");
	c.println ("YOU ARE TALKING TO. THE APPEARANCE TRAIT WISE, I MEANT; NOTHING ELSE.");
	c.println ();

	//practice tutorial starts
	delay (5000);
	c.println ("YOU: NEXT!");
	delay (1000);
	c.println ();
	c.println ("HEIGHT: 180cm");
	c.println ("WEIGHT: 71kg");
	c.println ();
	delay (1000);

	//Passport
	f = new Console (10, 35);

	//Q&A
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	f.println ("PASSPORT");
	f.println ("NAME: DAVE IEN");
	f.println ("DATE OF BIRTH: 1964. 03. 24");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): LOFUS");
	f.println ("EXPIRATION DATE: 2000. 04. 20");

	delay (1000);
	c.println ();
	c.println ("WHAT IS YOUR NAME?");
	delay (1000);
	c.println ("DAVE IEN");
	delay (1000);
	c.println ();
	c.println ("WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (1000);
	c.println ("JOB");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (1000);
	c.println ("HALF A YEAR");
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");

	//General screen
	l = new Console ();
	l.println ("GENERAL: YELLOW THERE! I JUST MADE MY OWN SCREEN BECAUSE THE MAIN SCREEN WAS");
	l.println ("BECOMING TOO CROWDED. I'LL BE GOING BACK FROM SCREEN TO SCREEN FOR THE REST");
	l.println ("OF THIS TUTORIAL, SO FEEL FREE TO IGNORE THIS SCREEN ONCE WE ARE FINISHED.");
	l.println ();
	l.println ("GENERAL: AS WE CAN ALL SEE, THE PERSON YOU ARE TALKING TO HAS GIVEN YOU HIS");
	l.println ("PASSPORT - WHICH IS ON A DIFFERENT, SMALLER SCREEN. YOU ALSO ASKED HIM SOME");
	l.println ("QUESTIONS AND HE ANSWERED UNWILLINGLY. NOW, IT IS YOUR CHOICE TO DECIDE IF HE");
	l.println ("SHOULD PASS OR NOT. YOU CAN FOLLOW THE INSTRUCTIONS GIVEN TO YOU AND GO IN");
	l.println ("ACCORDANCE WITH IT, OR YOU CAN DISOBEY THE RULES AND DO WHATEVER YOU WANT. I");
	l.println ("HONESTLY DON'T CARE, BUT IF YOU WANT MONEY AND DON'T WANT TO LOSE THEM, THEN");
	l.println ("FOLLOWING THE LAWS ARE PROBABLY BETTER. REMEMBER THAT AFTER 2 PENALTIES, YOU");
	l.println ("WILL LOSE AS MUCH AS YOU GAIN.");
	l.println ();
	l.println ("GENERAL: FOR THE SAKE OF THIS TUTORIAL, JUST DO IT CORRECTLY.");
	l.println ();

	//only pass when player presses enter
	user = c.getChar ();

	do
	{
	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("GENERAL: NOPE, WRONG ONE.");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10));

	c.println (respond ("APPROVE"));
	delay (2000);

	f.clear ();

	delay (1000);
	c.clear ();

	c.println ("GENERAL: SINCE YOU DID IT CORRECTLY, YOU DIDN'T RECEIVE ANYTHING. IF YOU DID IT");
	c.println ("INCORRECTLY, THEN IT WOULD'VE SAID SOMETHING LIKE...");
	delay (2000);
	c.println ("________________________________________________________________________________");
	c.println ("PROTOCAL VIOLATION");
	c.println ("WARNING - NO PENALTY");
	c.println ("________________________________________________________________________________");
	c.println ();
	c.println ("GENERAL: AND IT WOULD GO DOWN TO \"LAST WARNING\" TO \"PENALTY ASSESSED\". MAKE");
	c.println ("SURE TO KNOW THAT YOU WILL NOT RECEIVE ANY PENALTIES IF YOU ARE BROKE. WHICH");
	c.println ("SOUNDS FINE, BUT, TRUST ME, IT ISN'T.");

	//continue button
	Continue ();

	//tutorial practice continues
	l.clear ();
	l.println ("GENERAL: LET'S TRY A DIFFERENT PERSON.");
	l.println ();
	delay (1500);

	c.println ("YOU: NEXT!");
	delay (1000);
	c.println ();
	c.println ("HEIGHT: 170cm");
	c.println ("WEIGHT: 60kg");
	c.println ();
	delay (1000);

	//Passport
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	f.println ("PASSPORT");
	f.println ("NAME: LILY HEIM");
	f.println ("DATE OF BIRTH: 1972. 12. 03");
	f.println ("SEX: F");
	f.println ("NATIONALITY (COUNTRY): MASWAX");
	f.println ("EXPIRATION DATE: 2003. 02. 26");

	delay (1000);
	c.println ();
	c.println ("WHAT IS YOUR NAME?");
	delay (1000);
	c.println ("LILY HEIM");
	delay (1000);
	c.println ();
	c.println ("WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("JUST VISITING");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("SEVERAL WEEKS");
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");

	l.println ("GENERAL: WHAT SHOULD YOU DO?");

	//only pass when player presses enter
	user = c.getChar ();

	do
	{
	    if (!(user == (int) 8))
	    {
		c.println ();
		c.println ("GENERAL: NOPE, WRONG ONE.");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 8));

	c.println (respond ("DECLINE"));
	delay (2000);

	f.clear ();

	delay (1000);
	c.clear ();

	c.println ("GENERAL: GOOD JOB. NOW, YOU CAN DO EVERY-");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THE GENERAL WAS INTERRUPTED BY A SHOUT, COMING FROM A DISTANCE. IT");
	c.println ("WAS A VOICE OF A WOMAN WHO IS RUSHING TOWARDS YOU.");
	c.println ();
	delay (1000);

	c.println ("NPC: PLEASE, LET ME GET ACROSS! I HAVE TO QUICKLY GIVE THIS MEDICINE TO MY");
	c.println ("SON! PLEASE, HE IS VERY ILL AND MIGHT NOT SURVIVE IF I DO NOT GIVE THIS TO HIM");
	c.println ("RIGHT NOW!");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THE GENERAL SLIGHTLY PUSHES YOU TO THE SIDE AND TAKES CONTROL OF");
	c.println ("THE SITUATION.");
	c.println ();
	delay (1000);
	c.println ("GENERAL: DO YOU HAVE YOUR PASSPORT?");
	delay (500);
	c.println ();
	c.println ("NPC: YES, YES! OVER HERE!");
	c.println ();
	delay (1000);

	//continue button
	Continue ();

	delay (1000);
	f.println ("PASSPORT");
	f.println ("NAME: MATILDA VALERIE");
	f.println ("DATE OF BIRTH: 1955. 06. 15");
	f.println ("SEX: F");
	f.println ("NATIONALITY (COUNTRY): OTHARIA");
	f.println ("EXPIRATION DATE: 2000. 01. 01");

	delay (2000);
	c.println ("GENERAL: ...");
	c.println ();
	delay (1000);
	c.println ("MATILDA VALERIE: WH-WHAT? WHY, WHAT IS WRONG WITH IT?");
	c.println ();
	delay (1000);
	c.println ("GENERAL: I REGRET TO TELL YOU THAT... YOUR PASSPORT IS UNACCEPTABLE.");
	c.println ();
	delay (1000);
	c.println ("MATILDA VALERIE: WHAT?! WHY!!!");
	c.println ();
	delay (1000);
	c.println ("GENERAL: UNFORTUNATELY, WE CAN ONLY ACCEPT LOFUSANS FOR TODAY.");
	c.println ();
	delay (500);
	c.println ("MATILDA VALERIE: NONONO, THIS CAN'T HAPPEN! I LEFT TO BUY MEDICINE FOR MY SON A");
	c.println ("WEEK AGO! IF I DON'T GIVE IT TO HIM ANYTIME SOON, HE WILL DIE!!!");
	c.println ();
	delay (1000);
	c.println ("GENERAL: I AM SORRY, BUT THERE IS NOTHING I CAN DO.");
	c.println ();
	delay (500);
	c.println ("MATILDA VALERIE: NO! I WILL NOT LEAVE! I HAVE EVERY RIGHT TO ENTER LOFUS!!!");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THE GENERAL REACHES HIS HAND UNDERNEATH THE TABLE AS STEALTHILY AS");
	c.println ("POSSIBLE AND PUSHES A BUTTON. AFTERWARDS, A METAL ROLLER SHUTTLE SLAMS DOWN AND");
	c.println ("CLOSES THE WINDOW YOU USE TO INSPECT PEOPLE WITH.");
	c.println ();
	c.println ("GAME MASTER: THE WOMAN STARTS TO SCREAM AND BANG ON THE METAL SHUTTLE, UNTIL THE");
	c.println ("SECURITY GUARDS CAME AND KNOCKED HER DOWN, MAKING HER UNCONSCIOUS.");
	c.println ();
	f.clear ();

	//continue button
	Continue ();

	c.println ("GENERAL: WHEW! WELL, THAT WAS SCARY!");
	c.println ();
	c.println ("GAME MASTER: THE GENERAL TAKES A GLIMPSE OF YOU AND SEES YOU SHOCKED AND");
	c.println ("SPEECHLESS.");
	c.println ();
	c.println ("GENERAL: DON'T WORRY ABOUT HER. SHE AND HER SON WILL BE FINE. PROBABLY. IF YOU");
	c.println ("JUST DO YOUR JOB PROPERLY, YOU WILL BE A-OK.");
	c.println ();
	c.println ("GAME MASTER: THE GENERAL POINTS AT THE BUTTON THAT HE USED TO CALL SECURITY.");
	c.println ();
	c.println ("GENERAL: YOU DON'T REALLY NEED TO KNOW ABOUT THIS BUTTON, AT LEAST FOR NOW,");
	c.println ("BECAUSE THERE WILL BE GUARDS NEAR YOUR POST AT ALL TIMES. SO RELAX AND HAVE FUN.");
	c.println ();
	c.println ("GENERAL: OH! AND YOU WILL HAVE APPROXIMATELY 3 ENCOUNTERS PER DAY, SO THE");
	c.println ("MAXIMUM AMOUNT OF MONEY YOU CAN EARN IS $15. SOMETIMES YOU HAVE MORE, SOMETIMES");
	c.println ("LESS, AND SINCE YOU MUST PAY $40 FOR FOOD, WATER, AND HEAT PLUS ANY MEDICINES");
	c.println ("FOR YOUR FAMILY, IT WOULD BE PREFERABLE FOR YOU TO USE YOUR MONEY WISELY.");
	c.println ();
	c.println ("GENERAL: GOOD LUCK, INSPECTOR. AND AS ALWAYS...");
	c.println ();
	delay (1000);
	c.println ("GENERAL: GLORY TO LOFUS!");

	//continue button
	Continue ();

	LoggingInFast3 ();

	//end of tutorial
	//_____________________________________________________________________________________________________________________

	//Game Begins!
	//Round 1 starts
	//Newspaper
	e = new Console ();
	newspaper ();

	//instructions
	InstructionBasic ("FROM TODAY, FOREIGNERS WITH A VALID PASSPORT ARE PERMITTED TO ENTER.\n\nYOU HAVE BEEN GIVEN A NEWSPAPER. TODAY'S DATE IS RECORDED AND WILL BE USED FROM THIS POINT ON. THE DAYS WILL PASS, BUT THE DATES WILL NOT. THEY WILL BE USED TO CHECK THE VALIDATIONS OF THE PAPERS GIVEN BY THE PEOPLE.\n\nCHECK ALL PASSPORT INFORMATION CAREFULLY FOR DISCREPANCIES. DENY ANY ENTRANT    WITH INCONSISTENT INFORMATION.");

	//round #
	c.println ("DAY 1");
	c.println ();
	c.println ("ARE YOU READY?");

	//continue button
	Continue ();

	//Round 1
	for (int i = 0 ; i < 2 ; i++)
	{
	    c.clear ();
	    delay (500);
	    c.println ("YOU: NEXT!");
	    delay (1000);

	    Record = 0;
	    nameUsed = "";
	    do
	    {
		Record = (int) (Math.random () * (80));
		nameUsed = rec [Record].getName ();
	    }
	    while (nameUsed.equals (""));

	    c.println (rec [Record].toString ());
	    c.println ();
	    c.println ("YOU: PAPERS, PLEASE.");
	    //Passport
	    delay (1000);
	    f.println ("PASSPORT");
	    f.println ("NAME: " + rec [Record].getName ());
	    f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	    f.println ("SEX: " + rec [Record].getSex ());
	    f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	    f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: WHAT IS YOUR NAME?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getName ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getPurpose ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getDuration ());
	    delay (1000);
	    c.println ();
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else
	    {
		c.println (respond ("DECLINE"));
	    }
	    f.clear ();

	    //Did you get it right?
	    conditionChecker = rec [Record].getCondition ();

	    if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1)
	    {
		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else
	    {
		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
	    }
	    rec [Record].setName ("");
	}

	//Story mission
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);
	c.println ();
	c.println ("HEIGHT: 159cm");
	c.println ("WEIGHT: 50kg");
	c.println ();
	delay (1000);
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	f.println ("PASSPORT");
	f.println ("NAME: MARK IPLIER");
	f.println ("DATE OF BIRTH: 1979. 01. 02");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): MASWAX");
	f.println ("EXPIRATION DATE: 2010. 01. 23");
	delay (1000);
	c.println ();
	c.println ("WHAT IS YOUR NAME?");
	delay (1000);
	c.println ("MARK IPLIER");
	delay (1000);
	c.println ();
	c.println ("WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (1000);
	c.println ("VACATION");
	delay (1000);
	c.println ();
	c.println ("FOR HOW LO-");
	delay (500);

	c.clear ();

	//terrorist attack
	c.println ("GAME MASTER: YOU ARE TAKEN BY SURPRISE WHEN A METAL ROLLER SHUTTLE SLAMS DOWN");
	c.println ("AND CLOSES THE WINDOW YOU USE TO INSPECT PEOPLE WITH. YOU LOOK OUTSIDE AND CHECK");
	c.println ("TO SEE WHAT'S HAPPENING. YOU SEE A MAN CLIMBING OVER THE WALL THAT PREVENTS");
	c.println ("PEOPLE FROM CROSSING THE BORDER ILLEGALLY. LUCKILY, THERE IS AN ARMED SECURITY");
	c.println ("GUARD WARNING HIM TO STOP MOVING. HE DOESN'T LISTEN, INSTEAD, HE REACHES INTO");
	c.println ("HIS RIGHT POCKET, REVEALING A BOMB. WITHOUT A CHOICE, THE GUARD SHOOTS HIM AND");
	c.println ("KILLS HIM. UNFORTUNATELY, THE BOMB WAS ALREADY THROWN BEFORE HE TOOK THE SHOT,");
	c.println ("RESULTING IN THE GUARD'S DEATH AS WELL.");
	c.println ();
	c.println ("GAME MASTER: THE TERRORIST EXCLAIMED \"FOR OTHARIA!\" BEFORE COMMITTING SUICIDE.");
	c.println ("IS IT A COINCIDENCE FOR THE TERRORIST TO BE YOUR COUNTRY'S ENEMY? OR IS IT JUST");
	c.println ("A ONE TIME GIG? WHATEVER IT IS, YOU HAVE A FEELING THAT YOUR JOB ISN'T GOING TO");
	c.println ("GIVE YOU A HAPPY ENDING.");

	//continue button
	Continue ();

	f.clear ();
	c.clear ();

	c.println ("THE DAY WAS CUT SHORT BY A TERRORIST ATTACK");
	c.println ();

	//continue button
	Continue ();

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}

	//Round 2 starts
	//instructions
	InstructionBasic ("DUE TO THE RECENT TERRORIST INCIDENT, WE HAVE PLACED MORE GUARDS NEAR YOUR      LOCATION. DO NOT BE ALARMED IF THIS EVENT IS TO HAPPEN AGAIN. YOU WILL BE       PERFECTLY SAFE FROM ANY HARM.\n\nEVERYONE ATTEMPTING TO CROSS THE BORDER MUST NOW REQUIRE A VALID ENTRY TICKET. SAMPLE IS SHOWN BELOW.\n\n________________________________________________________________________________\nLOFUS\nENTRY TICKET\nVALID ON 2000. 01. 01.\n________________________________________________________________________________");
	//entry permit
	m = new Console (4, 21);

	//round #
	c.println ("DAY 2");

	//continue button
	Continue ();

	//reset penalty checker
	penaltyCheck = 2;

	//Round 2
	for (int i = 0 ; i < 3 ; i++)
	{
	    c.clear ();
	    delay (500);
	    c.println ("YOU: NEXT!");
	    delay (1000);

	    Record = 0;
	    nameUsed = "";
	    do
	    {
		Record = (int) (Math.random () * (80));
		nameUsed = rec [Record].getName ();
	    }
	    while (nameUsed.equals (""));

	    c.println (rec [Record].toString ());
	    c.println ();
	    c.println ("YOU: PAPERS, PLEASE.");

	    //Passport
	    delay (1000);
	    f.println ("PASSPORT");
	    f.println ("NAME: " + rec [Record].getName ());
	    f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	    f.println ("SEX: " + rec [Record].getSex ());
	    f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	    f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	    conditionNum = rec [Record].getCondition ();
	    if (conditionNum == 0)
	    {
		m.println ("LOFUS");
		m.println ("ENTRY TICKET");
		m.println ("VALID ON 2000. 01. 01");
	    }
	    else
	    {
		number = (int) (Math.random () * (7) + 1);
		year = (int) (Math.random () * (61) + 1940);
		month = (int) (Math.random () * (12) + 1);
		day = (int) (Math.random () * (31) + 1);

		switch (number)
		{
		    case 1:
			{
			    m.println ("LOFUS");
			    break;
			}
		    case 2:
			{
			    m.println ("MASWAX");
			    break;
			}
		    case 3:
			{
			    m.println ("ESPUA");
			    break;
			}
		    case 4:
			{
			    m.println ("OTHARIA");
			    break;
			}
		    case 5:
			{
			    m.println ("UFRA");
			    break;
			}
		    case 6:
			{
			    m.println ("SPONIA");
			    break;
			}
		    case 7:
			{
			    m.println ("THYNE");
			    break;
			}
		}
		m.println ("ENTRY TICKET");

		if (month < 10 && day < 10)
		{
		    m.println ("VALID ON " + year + " 0" + month + " 0" + day);
		}
		else if (month < 10)
		{
		    m.println ("VALID ON " + year + " 0" + month + " " + day);
		}
		else if (day < 10)
		{
		    m.println ("VALID ON " + year + " " + month + " 0" + day);
		}
		else
		{
		    m.println ("VALID ON " + year + " " + month + " " + day);
		}
	    }

	    delay (1000);
	    c.println ();
	    c.println ("YOU: WHAT IS YOUR NAME?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getName ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getPurpose ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getDuration ());
	    delay (1000);
	    c.println ();
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else
	    {
		c.println (respond ("DECLINE"));
	    }
	    f.clear ();
	    m.clear ();

	    //Did you get it right?
	    conditionChecker = rec [Record].getCondition ();

	    if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1)
	    {
		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else
	    {
		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;

		delay (3000);
	    }
	    rec [Record].setName ("");
	}

	c.clear ();

	alarm ();

	//Day 2 over
	c.println ("DAY 2 IS OVER");

	//continue button
	Continue ();

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}


	//Round 3 starts
	//instructions
	InstructionBasic ("THERE HAS BEEN A MINOR INCIDENT OF IDENTITY THEFT IN THE APLEN CAPITAL. THE SUSPECTS' IDENTITIES ARE UNKNOWN BUT SURMISED TO BE A TOTAL OF THREE PEOPLE FROM OTHARIA WHO ARE USING A LOFUSAN CITIZEN IDENTITY TO PERFORM ILLEGAL ACTS WITHIN OUR TERRITORY.\n\nSTRICTER CREDENTIAL REQUIREMENTS HAVE BEEN INSTITUTED.\n\nLOFUSAN CITIZENS MUST SHOW THEIR ID CARD.\n\nENTRY TICKETS ARE STILL REQUIRED FOR NON-LOFUSAN CITIZENS.");
	//Identity card
	g = new Console (9, 37);

	//round #
	c.println ("DAY 3");

	//continue button
	Continue ();

	//reset penalty checker
	penaltyCheck = 2;

	//Round 3
	for (int i = 0 ; i < 2 ; i++)
	{
	    c.clear ();
	    delay (500);
	    c.println ("YOU: NEXT!");
	    delay (1000);

	    Record = 0;
	    nameUsed = "";
	    do
	    {
		Record = (int) (Math.random () * (80));
		nameUsed = rec [Record].getName ();
	    }
	    while (nameUsed.equals (""));

	    c.println (rec [Record].toString ());
	    c.println ();
	    c.println ("YOU: PAPERS, PLEASE.");

	    //Passport
	    delay (1000);
	    f.println ("PASSPORT");
	    f.println ("NAME: " + rec [Record].getName ());
	    f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	    f.println ("SEX: " + rec [Record].getSex ());
	    f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	    f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	    conditionNum = rec [Record].getCondition ();
	    if (rec [Record].getNationCountry ().equals ("LOFUS"))
	    {
		//identity card info
		g.setCursor (4, 13);
		g.println ("NAME: " + rec [Record].getName ());
		g.setCursor (5, 13);
		g.println ("D.O.B: " + rec [Record].getDOB ());
		g.setCursor (6, 13);
		g.println ("HEIGHT: " + rec [Record].getHeight ());
		g.setCursor (7, 13);
		g.println ("WEIGHT: " + rec [Record].getWeight ());

		//picture
		g.drawRect (10, 60, 70, 80);
		g.drawOval (20, 75, 50, 50);
		g.fillOval (28, 90, 10, 10);
		g.fillOval (53, 90, 10, 10);
		g.drawArc (35, 95, 20, 20, 180, 180);

		//identity card surface
		g.drawRoundRect (0, 0, 290, 160, 30, 30);

		//identity card
		Font font = new Font ("Bernard MT Condensed", Font.PLAIN, 20);
		g.setFont (font);
		g.drawString ("LOFUS IDENTITY CARD", 65, 20);
		g.drawLine (0, 22, 290, 22);
		Font font2 = new Font ("Arial", Font.PLAIN, 13);
		g.setFont (font2);
		g.drawString ("APLEN                  TREO                   FEPRA", 10, 38);
		g.drawLine (0, 41, 290, 41);
	    }
	    else if (conditionNum == 0)
	    {
		m.println ("LOFUS");
		m.println ("ENTRY TICKET");
		m.println ("VALID ON 2000. 01. 01");
	    }
	    else
	    {
		number = (int) (Math.random () * (7) + 1);
		year = (int) (Math.random () * (61) + 1940);
		month = (int) (Math.random () * (12) + 1);
		day = (int) (Math.random () * (31) + 1);

		switch (number)
		{
		    case 1:
			{
			    m.println ("LOFUS");
			    break;
			}
		    case 2:
			{
			    m.println ("MASWAX");
			    break;
			}
		    case 3:
			{
			    m.println ("ESPUA");
			    break;
			}
		    case 4:
			{
			    m.println ("OTHARIA");
			    break;
			}
		    case 5:
			{
			    m.println ("UFRA");
			    break;
			}
		    case 6:
			{
			    m.println ("SPONIA");
			    break;
			}
		    case 7:
			{
			    m.println ("THYNE");
			    break;
			}
		}
		m.println ("ENTRY TICKET");

		if (month < 10 && day < 10)
		{
		    m.println ("VALID ON " + year + " 0" + month + " 0" + day);
		}
		else if (month < 10)
		{
		    m.println ("VALID ON " + year + " 0" + month + " " + day);
		}
		else if (day < 10)
		{
		    m.println ("VALID ON " + year + " " + month + " 0" + day);
		}
		else
		{
		    m.println ("VALID ON " + year + " " + month + " " + day);
		}
	    }

	    delay (1000);
	    c.println ();
	    c.println ("YOU: WHAT IS YOUR NAME?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getName ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getPurpose ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getDuration ());
	    delay (1000);
	    c.println ();
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else
	    {
		c.println (respond ("DECLINE"));
	    }
	    f.clear ();
	    m.clear ();
	    g.clear ();

	    //Did you get it right?
	    conditionChecker = rec [Record].getCondition ();

	    if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1)
	    {
		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else
	    {
		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
	    }
	    rec [Record].setName ("");
	}


	//Guilt trip story
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");

	//Passport
	delay (1000);
	f.println ("PASSPORT");
	f.println ("NAME: MARIUSZ KWASEK");
	f.println ("DATE OF BIRTH: 1945. 06. 13");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): UFRA");
	f.println ("EXPIRATION DATE: 2001. 05. 02");

	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: MARIUSZ KWASEK");
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("MARIUSZ KWASEK: A JOB");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("MARIUSZ KWASEK: FOR 3 MONTHS");
	delay (1000);
	c.println ();

	c.println ("YOU: DO YOU HAVE AN ENTRY TICKET?");
	delay (1500);
	c.println ("MARIUSZ KWASEK: OH...YES, I'M SORRY");
	delay (2000);
	c.println ();

	//Entry ticket
	m.println ("LOFUS");
	m.println ("ENTRY TICKET");
	m.println ("VALID ON 1999. 12. 31");

	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	c.println ();
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8));

	//Respond
	if (user == (int) 10)
	{
	    c.println ("YOU: WELCOME TO LOFUS");
	    c.println ("MARIUSZ KWASEK: THANK YOU SO MUCH! THANK YOU! THANK YOU!");

	    f.clear ();
	    m.clear ();

	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	else
	{
	    c.println ("YOU: THE ENTRY TICKET IS EXPIRED");
	    delay (500);
	    c.println ();
	    c.println ("GAME MASTER: BEFORE YOU COULD STAMP A DECLINED ORDER FOR HIS PASSPORT, MARIUSZ");
	    c.println ("PANICKED AND TRIED TO CHANGE YOUR MIND.");
	    c.println ();
	    delay (500);
	    c.println ("MARIUSZ KWASEK: I-I'LL GET A NEW ONE AS SOON AS I ENTER!");
	    c.println ();
	    c.println ("MARIUSZ KWASEK: I WAS TRYING TO GET THE JOB FOR SIX MONTHS, AND I'VE GOT A");
	    c.println ("FAMILY TO FEED! PLEASE, I BEG YOU! MY WIFE IS PREGNANT WITH OUR SECOND CHILD AND");
	    c.println ("WE DON'T HAVE ENOUGH MONEY TO BUY HER FOOD AND KEEP HER HEALTHY!");
	    c.println ();
	    delay (1000);
	    c.println ("GAME MASTER: YOU TAKE A GLIMPSE OF HIS APPEARANCE AND NOTICE THAT HE IS NOT");
	    c.println ("LYING. HOWEVER, AS PITIFUL AS HE IS, YOU ALSO HAVE A FAMILY OF YOUR OWN TO TAKE");
	    c.println ("CARE OF, AND ACCEPTING HIS PASSPORT WILL RESULT IN A PENALTY.");
	    c.println ();
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    c.println ();

	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    if (user == (int) 10)
	    {
		c.println ("YOU: CORRECT IT NEXT TIME");
		c.println ("MARIUSZ KWASEK: THANK YOU SO MUCH! THANK YOU! THANK YOU!");
		c.println ();
		c.println ("MARIUSZ KWASEK: HERE, TAKE THIS. THIS IS A FAMILY HEIRLOOM THAT APPARENTLY");
		c.println ("GIVES GOOD LUCK TO THE PERSON IN POSSESSION. PERHAPS THIS HELPED ME CHANGE");
		c.println ("YOUR MIND.");

		//continue button
		Continue ();

		n = new Console (6, 25);
		luckyToken ();
		luckyToken++;
	    }
	    else
	    {
		mariusz--;
		c.println ("MARIUSZ KWASEK: MY FAMILY IS ALL ALONE WITHOUT ME AND YOU'LL STAMP THE PASSPORT");
		c.println ("ANYWAY, WON'T YOU? NOBODY WILL EVER KNOW-!...");
		delay (1000);
		c.println ();
		c.println ("*stamp*");
		delay (3000);
		c.println ();
		c.println ("YOU: ...I'M SORRY");
	    }

	    delay (2500);
	    f.clear ();
	    m.clear ();
	    g.clear ();

	    if (user == (int) 8)
	    {
		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else
	    {
		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
	    }
	}

	//continue button
	Continue ();

	f.clear ();
	m.clear ();
	g.clear ();

	if (mariusz == 0)
	{
	    c.println ("GAME MASTER: ALTHOUGH YOU ARE NOT ENTIRELY SURE IF YOU DID THE RIGHT THING, YOU");
	    c.println ("ARE UNEXPECTEDLY HAPPY ABOUT YOUR DECISION.");
	}
	else if (mariusz == -1)
	{
	    c.println ("GAME MASTER: THE ATMOSPHERE WAS DARK AND SILENT. AFTER MARIUSZ LEFT, ALL");
	    c.println ("DEPRESSED AND WORRIED, YOU SEE YOUR REFLECTION FROM THE GLASS WINDOW YOU USE TO");
	    c.println ("INSPECT PEOPLE WITH. YOU STARE AT IT FOR QUITE A LONG TIME AND YOU DON'T KNOW");
	    c.println ("WHY. MAYBE BECAUSE YOU THINK YOU MADE THE WRONG CHOICE.");
	    c.println ();
	    c.println ("GAME MASTER: YOU BRIEFLY HESITATED WHEN TRYING TO PRESS THE BUTTON THAT");
	    c.println ("AVTIVATES THE MICROPHONE TO CALL PEOPLE IN TO INSPECT. HOWEVER, YOU CANNOT STOP");
	    c.println ("NOW. WHAT HAPPENED HAS HAPPENED AND YOU NEED TO TAKE CARE OF YOUR FAMILY. SO,");
	    c.println ("YOU TOOK A DEEP BREATH AND SAID...");
	}

	//continue button
	Continue ();

	c.clear ();

	//Round 3 continue
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");

	//Passport
	delay (1000);
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	conditionNum = rec [Record].getCondition ();
	if (rec [Record].getNationCountry ().equals ("LOFUS"))
	{
	    //identity card info
	    g.setCursor (4, 13);
	    g.println ("NAME: " + rec [Record].getName ());
	    g.setCursor (5, 13);
	    g.println ("D.O.B: " + rec [Record].getDOB ());
	    g.setCursor (6, 13);
	    g.println ("HEIGHT: " + rec [Record].getHeight ());
	    g.setCursor (7, 13);
	    g.println ("WEIGHT: " + rec [Record].getWeight ());

	    //picture
	    g.drawRect (10, 60, 70, 80);
	    g.drawOval (20, 75, 50, 50);
	    g.fillOval (28, 90, 10, 10);
	    g.fillOval (53, 90, 10, 10);
	    g.drawArc (35, 95, 20, 20, 180, 180);

	    //identity card surface
	    g.drawRoundRect (0, 0, 290, 160, 30, 30);

	    //identity card
	    Font font = new Font ("Bernard MT Condensed", Font.PLAIN, 20);
	    g.setFont (font);
	    g.drawString ("LOFUS IDENTITY CARD", 65, 20);
	    g.drawLine (0, 22, 290, 22);
	    Font font2 = new Font ("Arial", Font.PLAIN, 13);
	    g.setFont (font2);
	    g.drawString ("APLEN                  TREO                   FEPRA", 10, 38);
	    g.drawLine (0, 41, 290, 41);
	}
	else if (conditionNum == 0)
	{
	    m.println ("LOFUS");
	    m.println ("ENTRY TICKET");
	    m.println ("VALID ON 2000. 01. 01");
	}
	else
	{
	    number = (int) (Math.random () * (7) + 1);
	    year = (int) (Math.random () * (61) + 1940);
	    month = (int) (Math.random () * (12) + 1);
	    day = (int) (Math.random () * (31) + 1);

	    switch (number)
	    {
		case 1:
		    {
			m.println ("LOFUS");
			break;
		    }
		case 2:
		    {
			m.println ("MASWAX");
			break;
		    }
		case 3:
		    {
			m.println ("ESPUA");
			break;
		    }
		case 4:
		    {
			m.println ("OTHARIA");
			break;
		    }
		case 5:
		    {
			m.println ("UFRA");
			break;
		    }
		case 6:
		    {
			m.println ("SPONIA");
			break;
		    }
		case 7:
		    {
			m.println ("THYNE");
			break;
		    }
	    }
	    m.println ("ENTRY TICKET");

	    if (month < 10 && day < 10)
	    {
		m.println ("VALID ON " + year + " 0" + month + " 0" + day);
	    }
	    else if (month < 10)
	    {
		m.println ("VALID ON " + year + " 0" + month + " " + day);
	    }
	    else if (day < 10)
	    {
		m.println ("VALID ON " + year + " " + month + " 0" + day);
	    }
	    else
	    {
		m.println ("VALID ON " + year + " " + month + " " + day);
	    }
	}

	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));
	}
	else
	{
	    c.println (respond ("DECLINE"));
	}
	f.clear ();
	m.clear ();
	g.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");

	c.clear ();

	alarm ();

	//Day 3 over
	c.println ("DAY 3 IS OVER");

	//continue button
	Continue ();

	//First encounter with the "CREED." LEADER IS CALLED "EVALT ALIMARIDE" (WHICH IS AN ACRONYM OF "MATILDA VALERIE")
	c.clear ();
	
	c.println ("GAME MASTER: WHEN YOU WERE ABOUT TO LEAVE YOUR POST FOR THE DAY AND RETURN HOME,");
	c.println ("A STRANGE HOODED PERSON CAME TO YOU.");
	c.println ();
	delay (1000);
	c.println ("YOU: I'M SORRY, BUT THE BORDER INSPECTING SESSION HAS BEEN CLOSED FOR TODAY.");
	c.println ();
	delay (1000);
	c.println ("STRANGER: THE \"CREED\" AWAITS.");
	c.println ();
	delay (3000);

	//the creed card
	n = new Console (6, 25);

	//creed symbol
	creed ();

	c.println ("GAME MASTER: BEFORE YOU REPLY, THE STRANGER TOSSES SOMETHING TO YOU. YOU CATCH");
	c.println ("IT INSTINCTIVELY AND REALIZE THAT IT IS A SMOOTH, TOKEN WITH A STRANGE SYMBOL");
	c.println ("ON IT.");

	c.println ();
	delay (1000);
	c.println ("YOU: OH?... UHH... WHAT'S THIS?... HUH?");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU LOOK UP TO TALK TO THE STRANGER, BUT THEY WERE NO WHERE TO BE");
	c.println ("FOUND.");

	//continue button
	Continue ();

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}


	//Round 4 starts
	//instructions
	InstructionBasic ("THE SUSPECTS' NAMES OF THE IDENTITY THEFT INCIDENT IN THE APLEN CAPITAL HAVE    BEEN IDENTIFIED. YOU ARE TO REPORT THEM IF ENCOUNTERED.\n\nYOU ARE NOW PERMITTED TO USE THE DETAIN BUTTON HIDDEN UNDER YOUR DESK.\n\nEVERYONE REQUIRES AN ACCESS PERMIT.\n\nA CLOCK HAS BEEN GIFTED TO YOU FOR YOU TO USE THEM DURING THE INSPECTION WITH   THE ACCESS PERMITS. THE ACCESS PERMIT IS ONLY AVAILABLE FROM 9:00 AM TO         12:00 PM. OTHER TIMES ARE CONSIDERED TO BE EXPIRED.\n\nLOFUSAN CITIZENS NO LONGER REQUIRE AN ID CARD.\n\nENTRY TICKETS ARE NO LONGER SUFFICIENT.");

	//Time
	j = new Console (6, 25);
	time ();

	//Access permit
	h = new Console (8, 35);

	//Wanted list
	o = new Console (10, 35);

	o.drawLine (85, 40, 200, 40);

	Font font = new Font ("Agency FB", Font.PLAIN, 20);
	o.setFont (font);
	o.drawString ("MINISTRY OF JUSTICE", 85, 30);
	Font font2 = new Font ("Impact", Font.PLAIN, 20);
	o.setFont (font2);
	o.drawString ("WANTED CRIMINALS", 68, 65);
	o.setCursor (5, 12);
	o.println ("JAMES LAVANGER");
	o.setCursor (6, 12);
	o.println ("ISABELLE HASTE");
	o.setCursor (7, 12);
	o.println ("JOEL STEED");


	//round #
	c.println ("DAY 4");

	//continue button
	Continue ();

	//reset penalty checker
	penaltyCheck = 2;

	//Officer "Cain" encounter
	c.clear ();
	c.println ("GAME MASTER: YOU ENTER YOUR INSPECTION OFFICE TO PREPARE FOR TODAY'S SHIFT. BUT");
	c.println ("YOU WERE INTERRUPTED BY A SECURITY GUARD.");
	c.println ();
	delay (3000);
	c.println ("SECURITY GUARD: HELLO.");
	c.println ();
	delay (1000);
	c.println ("YOU: ARE YOU THE ONE WHO CAME IN YESTERDAY?");
	c.println ();
	delay (1000);
	c.println ("SECURITY GUARD: WHO?");
	c.println ();
	delay (1000);
	c.println ("YOU: NEVERMIND, WHAT BRINGS YOU HERE?");
	c.println ();
	delay (1000);
	c.println ("OFFICER CAIN: I AM A GUARD HERE; OFFICER CAIN. THEY OFFERED ME A GOOD POSITION");
	c.println ("SO I CAME HERE, BUT THE PAY IS NOT AS GOOD AS I THOUGHT.");
	c.println ();
	delay (1000);
	c.println ("YOU: THEY PAY US ALL AS MUCH.");
	c.println ();
	delay (1000);
	c.println ("OFFICER CAIN: YA, WHATEVER, BUT LOOK. I WILL GET A SMALL BONUS FOR EVERYTIME YOU");
	c.println ("DETAIN PEOPLE. THE MORE YOU DETAIN, THE MORE THEY GIVE ME FOR PROCESSING.");
	c.println ();
	delay (1000);
	c.println ("YOU: I'M ASSUMING THERE IS A CATCH?");

	//continue button
	Continue ();

	c.println ("OFFICER CAIN: WELL, DUH. SINCE THIS ONLY BENEFITS ME, I WILL GIVE YOU $5 FOR");
	c.println ("EVERY TWO PEOPLE YOU DETAIN. SOUNDS LIKE A GOOD DEAL IF YOU ASK ME.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: SINCE YOU HAVE ALREADY RECEIVED AN ORDER TO DETAIN CRIMINALS, YOU");
	c.println ("AGREED TO WORK WITH HIM.");
	c.println ();
	delay (1000);
	c.println ("YOU: BUT THERE ARE ONLY THREE CRIMINALS AND IF I DETAIN ALL OF THEM. YOU WILL BE");
	c.println ("GIVING ME $5 FOR TWO, SO HOW WILL YOU DISTRIBUTE THE THIRD?");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: OFFICER CAIN LOOKED A LITTLE CONFUSED UNTIL HE SUDDENLY LAUGHED.");
	c.println ();
	delay (1000);
	c.println ("YOU: WHAT?");
	c.println ();
	delay (1000);
	c.println ("OFFICER: HEH. YOU CAN DETAIN ANYONE WITH INVALID INFORMATION. YOU CAN JUST SAY");
	c.println ("THAT THE PERSON LOOKED SUSPICIOUS.");
	c.println ();
	delay (1000);
	c.println ("YOU: HUH? BUT THAT IS A FALSE CHARGE.");
	c.println ();
	delay (1000);
	c.println ("OFFICER: BUDDY. YOU ARE THE INSPECTOR HERE. NOT ME, NOT THE PEOPLE WAITING");
	c.println ("OUTSIDE, YOU. YOU CAN DECIDE ANYTHING AS LONG AS YOU HAVE A VALID EXCUSE.");

	//continue button
	Continue ();

	c.println ("GAME MASTER: ALTHOUGH THE OFFICER MAY BE RIGHT, YOU ARE STILL CONFLICTED ABOUT");
	c.println ("TAKING ADVANTAGE OF YOUR POSITION.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: SEEING YOUR WORRIED FACE, THE OFFICER QUICKLY SAYS WHAT HE WANTED");
	c.println ("TO SAY PREVIOUSLY AND LEAVES BEFORE YOU DECLINE HIS OFFER.");
	c.println ();
	delay (1000);
	c.println ("OFFICER CAIN: OKAY! SO, I WILL GIVE THE MONEY TO YOU AFTER I GET PAID. LET US");
	c.println ("MAKE THE BEST OF THIS.");
	c.println ();
	delay (500);
	c.println ("YOU: W-WAI-");
	c.println ();
	c.println ("*slam*");
	c.println ();
	delay (1000);
	c.println ("YOU: ...");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THERE IS A LONG SILENCE AFTER HE CLOSED THE DOOR ON HIS WAY OUT.");
	c.println ("THE CRIMINALS DESERVE JUSTICE, BUT DO THE PEOPLE WITH INVALID INFORMATION");
	c.println ("DESERVE IT AS WELL JUST BECAUSE OF YOUR DESIRE IN MONEY? ALTHOUGH THIS IS");
	c.println ("MORALLY WRONG AND ILLEGAL, IT WILL BENEFIT YOUR FAMILY'S LIVES AS WELL.");
	c.println ();
	c.println ("AS THE INSPECTOR, IT IS YOUR CHOICE TO DO WHATEVER YOU WANT.");

	//continue button
	Continue ();

	//Round 4
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;
	}

	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");

	//story detain
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	c.println ("HEIGHT: 182cm");
	c.println ("WEIGHT: 65kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: JAMES LAVANGER");
	f.println ("DATE OF BIRTH: 1956. 03. 13");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): LOFUS");
	f.println ("EXPIRATION DATE: 2001. 06. 24");

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: JAMES LAVANGER");
	h.println ("NATIONALITY (CITY): APLEN");
	h.println ("NATION SYMBOL: HORSE");
	h.println ("PURPOSE: JOB");
	h.println ("DURATION: HALF A YEAR");
	h.println ("PRINTED TIME: 9:40 AM");

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: JAMES LAVANGER");
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: JOB");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: HALF A YEAR");
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));

	    f.clear ();
	    h.clear ();

	    lofus--;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));

	    f.clear ();
	    h.clear ();

	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	else
	{
	    c.println ("YOU: WAIT, YOU ARE JAMES LAVANGER?");
	    c.println ();
	    delay (1000);
	    c.println ("JAMES LAVANGER: DAMN.");
	    c.println ();
	    delay (500);
	    c.println ("JAMES LAVANGER: OKAY, LOOK. I WAS IN DESPERATE NEED OF MONEY WHEN AN OFFER WAS");
	    c.println ("GIVEN TO ME. IF I DID AS I WAS INSTRUCTED, I WAS PROMISED TO RECEIVE A LOT OF");
	    c.println ("MONEY... WAIT A MINUTE.");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: JAMES LAVANGER SLAMS A STACK OF MONEY ON TO YOUR DESK");
	    c.println ();
	    delay (500);
	    c.println ("JAMES LAVANGER: THIS IS $10. I WILL GIVE YOU THIS MUCH IF YOU LET ME PASS.");
	    c.println ();
	    delay (500);
	    c.println ("APPROVE (ENTER) OR DETAIN (SPACE)");
	    c.println ();
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 32))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 32));

	    if (user == (int) 10)
	    {
		lofus -= 5;
		bank.deposit (10);
		success++;
		bank.deposit (5);
		salary += 5;

		f.clear ();
		h.clear ();

		c.println ("JAMES LAVANGER: YES!!! THANKS A LOT! I'M FINALLY GOING TO BE RICH!");
	    }
	    else
	    {
		lofus += 2;
		c.println ("YOU: SORRY, I DON'T TAKE BRIBES.");
		c.println ();
		delay (500);
		c.println ("JAMES LAVANGER: WAIT! NO! PLEASE RECONSIDER! I WAS SO CLOSE TO BECOMING RICH!");
		c.println ();
		delay (500);
		c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
		c.println ();

		f.clear ();
		h.clear ();

		detain++;
	    }
	    //continue button
	    Continue ();
	}

	//Round 4 continue
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;
	}

	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");


	//story immigration
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	c.println ("HEIGHT: 176cm");
	c.println ("WEIGHT: 66kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: PYOTR VOSTOK");
	f.println ("DATE OF BIRTH: 1954. 11. 02");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): UFRA");
	f.println ("EXPIRATION DATE: 2001. 06. 11");

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: PYOTR VOSTOK");
	h.println ("NATIONALITY (CITY): JUNOS");
	h.println ("NATION SYMBOL: DOG");
	h.println ("PURPOSE: IMMIGRATION");
	h.println ("DURATION: FOREVER");
	h.println ("PRINTED TIME: 9:05 AM");

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: PYOTR VOSTOK");
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: IMMIGRATION");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: FOREVER");
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	f.clear ();
	h.clear ();

	//Respond
	if (user == (int) 10)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;

	    c.println ("YOU: GLORY TO LOFUS.");
	    c.println ();
	    delay (1000);
	    c.println ("PYOTR VOSTOK: THANK YOU SO MUCH!");
	    c.println ();
	    delay (500);
	    c.println ("PYOTR VOSTOK: PLEASE BE KIND TO MY WIFE, SHE IS JUST AFTER ME.");
	    c.println ();

	    //continue button
	    Continue ();
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));

	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;

	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}

	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	c.println ("HEIGHT: 168cm");
	c.println ("WEIGHT: 53kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: KATRINA VOSTOK");
	f.println ("DATE OF BIRTH: 1953. 08. 12");
	f.println ("SEX: F");
	f.println ("NATIONALITY (COUNTRY): UFRA");
	f.println ("EXPIRATION DATE: 2001. 06. 11");

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: KATRYNA VOSTOK");
	h.println ("NATIONALITY (CITY): JUNOS");
	h.println ("NATION SYMBOL: DOG");
	h.println ("PURPOSE: IMMIGRATION");
	h.println ("DURATION: FOREVER");
	h.println ("PRINTED TIME: 9:10 AM");

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);

	if (user == (int) 10)
	{
	    c.println ("KATRYNA VOSTOK: MY NAME IS KATRYNA VOSTOK, INSPECTOR. OH, THE MAN WHO WAS BEFORE");
	    c.println ("ME IS MY HUSBAND. I HOPE HE DIDN'T ANNOY YOU TOO MUCH.");
	}
	else
	{
	    c.println ("NPC: KATRYNA VOSTOK");
	}

	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);

	if (user == (int) 10)
	{
	    c.println ("KATRYNA VOSTOK: I AM IMMIGRATING HERE WITH MY HUSBAND. TODAY'S A BEAUTIFUL DAY,");
	    c.println ("WE FINALLY BECOME FREE FROM UFRA'S TY-");
	}
	else
	{
	    c.println ("NPC: IMMIGRATION");
	}

	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);

	if (user == (int) 10)
	{
	    c.println ("KATRYNA VOSTOK: UHH... WE WILL HOPEFULLY STAY HERE FOREVER. I'M SO GLAD THAT MY");
	    c.println ("HUSBAND AND I CAN STAY IN A GREAT PLACE LIKE LOFUS.");
	}
	else
	{
	    c.println ("NPC: FOREVER");
	}

	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	c.println ();

	if (user == (int) 10)
	{
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));

		f.clear ();
		h.clear ();

		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
	    }
	    else if (user == (int) 8)
	    {
		c.println ("YOU: IN THE PASSPORT, YOUR FIRST NAME IS SPELT AS \"KATRINA\" WITH AN 'I,' BUT");
		c.println ("FOR YOUR ACCESS PERMIT, IT'S \"KATRYNA\" WITH A 'Y.'");
		c.println ();
		delay (1000);
		c.println ("KATRYNA VOSTOK: I'VE BEEN SUFFERING IT ALL MY LIFE.");
		c.println ();
		delay (500);
		c.println ("KATRYNA VOSTOK: THEY'RE ALWAYS MISSPELLING IT. WHEN I GOT THE CERTIFICATE, IT");
		c.println ("WAS SPELT WITH THE 'Y,' BUT IN THE PASSPORT THEY SPELT IT WITH THE 'I.' WHO CAN");
		c.println ("FIGURE THEM OUT?");
		c.println ();
		delay (500);
		c.println ("KATRYNA VOSTOK: YOU KNOW, ONCE IT WAS SPELT LIKE \"KATREENA\" WITH TWO 'E'S.");

		//continue button
		Continue ();

		c.println ("GAME MASTER: SEEING YOU'RE CONFLICTED FACE, KATRYNA BECAME DESPERATE.");
		c.println ();
		delay (1000);
		c.println ("KATRYNA VOSTOK: PLEASE DON'T GET TOUGH WITH ME. MY HUSBAND WON'T LEAVE ME ALONE");
		c.println ("IF YOU DON'T LET ME IN.");
		c.println ();
		delay (500);
		c.println ("KATRYNA VOSTOK: I BEG YOU, INSPECTOR. I WON'T EVEN GET HOME SAFELY... MY HUSBAND");
		c.println ("HAS ALL OF OUR MONEY WITH HIM...");
		c.println ();
		delay (1000);
		c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");

		user = c.getChar ();
		do
		{
		    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

		//Respond
		if (user == (int) 10)
		{
		    c.println ("YOU: NEXT TIME, CORRECT IT.");
		    c.println ();
		    c.println ("KATRYNA VOSTOK: THANK YOU, MY DEAR! I WON'T EVER FORGET IT! HERE, IT'S A SMALL.");
		    c.println ("GIFT. THIS IS THE LEAST I CAN DO.");

		    Continue ();

		    n = new Console (6, 25);
		    //immigration token
		    immigrateToken ();

		    delay (2000);
		    if (penaltyCheck > 0)
		    {
			if (penaltyCheck == 1)
			{
			    c.println ("________________________________________________________________________________");
			    c.println ("PROTOCAL VIOLATION");
			    c.println ("LAST WARNING - NO PENALTY");
			    c.println ("________________________________________________________________________________");
			}
			else
			{
			    c.println ("________________________________________________________________________________");
			    c.println ("PROTOCAL VIOLATION");
			    c.println ("WARNING - NO PENALTY");
			    c.println ("________________________________________________________________________________");
			}
			penaltyCheck--;
		    }
		    else
		    {
			if (bank.withdraw (5) == 0)
			{
			    c.println ("________________________________________________________________________________");
			    c.println ("PROTOCAL VIOLATION");
			    c.println ("NO PENALTY - NO MONEY");
			    c.println ("________________________________________________________________________________");
			}
			else
			{
			    c.println ("________________________________________________________________________________");
			    c.println ("PROTOCAL VIOLATION");
			    c.println ("PENALTY ASSESSED - $5");
			    c.println ("________________________________________________________________________________");
			}
		    }
		    lofus--;
		    delay (3000);
		}
		else
		{
		    lofus++;
		    success++;
		    delay (2000);
		    bank.deposit (5);
		    salary += 5;

		    c.println ("YOU: I'M SORRY BUT THIS IS THE LAW.");
		    c.println ();
		    c.println ("KATRYNA VOSTOK: BUT! WHA-? HOW WILL I?... *sigh* ...NEVERMIND.");

		    //continue button
		    Continue ();
		}
	    }
	    else
	    {
		lofus++;
		c.println ("YOU: WAIT HERE.");
		c.println ();
		delay (500);
		c.println ("NPC: WAIT, WHAT ARE YOU DOING? WHY ARE YOU DETAINING ME?");
		c.println ();
		delay (500);
		c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
		c.println ();

		detain++;

		//continue button
		Continue ();
	    }
	}
	else
	{
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	    f.clear ();
	    h.clear ();

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));

		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
	    }
	    else if (user == (int) 8)
	    {
		c.println (respond ("DECLINE"));

		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else
	    {
		lofus++;
		c.println ("YOU: WAIT HERE.");
		c.println ();
		delay (500);
		c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
		c.println ();
		delay (500);
		c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
		c.println ();

		detain++;
	    }
	}
	c.clear ();
	f.clear ();
	h.clear ();

	alarm ();

	//Day 4 over
	c.println ("DAY 4 IS OVER");

	//continue button
	Continue ();

	//Second encounter with the "CREED." LEADER IS CALLED "EVALT ALIMARIDE" (WHICH IS AN ACRONYM OF "MATILDA VALERIE")
	c.println ("GAME MASTER: WHEN YOU WERE ABOUT TO LEAVE YOUR POST FOR THE DAY AND RETURN HOME,");
	c.println ("A STRANGE HOODED PERSON CAME TO YOU. YOU EXPECT THAT THEY ARE THE SAME PERSON");
	c.println ("FROM YESTERDAY.");
	c.println ();
	delay (1000);
	c.println ("YOU: OH, UHH... HELLO AGA-");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THE STRANGER STOPS YOU.");
	c.println ();
	delay (1000);
	c.println ("STRANGER: I DO NOT HAVE MUCH TIME, SO I CANNOT STAY HERE FOR LONG.");
	c.println ();
	delay (1000);
	c.println ("EVALT ALIMARIDE: I AM EVALT ALIMARIDE. I AM THE FOUNDER OF THE ORGANISATION");
	c.println ("KNOWN AS \"CREED\". LOFUS WAS ONCE A GREAT COUNTRY, UNTIL THE WAR CHANGED");
	c.println ("EVERYTHING. IT IS NOW POISONED BY CORRUPT LEADERS, WHO DO NOT CARE FOR THE LIVES");
	c.println ("OF OTHERS, RESULTING IN THOUSANDS OF DEATHS... INCLUDING MY OWN. HELP US FREE");
	c.println ("LOFUS FROM THEIR SHACKLES.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: EVALT THROWS TWO FOLDED PIECES OF PAPER TO YOU.");

	Continue ();

	o = new Console (18, 35);
	o.println ("CREED");
	o.println ();
	o.println ("FIRST NAME: 1-3-5-2-4-5-4");
	o.println ("SAPOGK");
	o.println ("OQHRTU");
	o.println ("ATUVAW");
	o.println ("XDZBSQ");
	o.println ("CLMOZT");
	o.println ("BHNSWY");
	o.println ("FJASUL");
	o.println ();
	o.println ("LAST NAME: 6-2-1-4-3");
	o.println ("QJFACS");
	o.println ("KTOXVB");
	o.println ("ALWCNR");
	o.println ("JQBRFG");
	o.println ("AMSUYX");

	c.println ("EVALT ALIMARIDE: ONE OF OUR AGENTS WILL SHOW UP TOMORROW. THE NAME IS WRITTEN IN");
	c.println ("THE PAPERS AS A RIDDLE TO CONFUSE SOMEONE OTHER THAN YOU IF THEY ARE TO LOOK AT");
	c.println ("THEM. LET THEM PASS WITH THESE PAPERS, NO MATTER WHAT. THEIR NAMES WILL ONLY");
	c.println ("APPEAR IN THEIR ACCESS PERMIT.");
	c.println ();
	delay (1000);
	c.println ("EVALT ALIMARIDE: THE NUMBERS INDICATE THE SPECIFIC LETTER WITHIN EACH ROW AND");
	c.println ("WILL IDENTIFY WHO THE AGENT IS.");
	c.println ();
	delay (1000);
	c.println ("EVALT ALIMARIDE: REMEMBER, THEIR ACCESS PERMIT ONLY.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: JUST LIKE WHAT EVALT SAID, THEY LEFT WITHOUT WAITING FOR YOUR REPLY.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: IT WAS ONLY A COUPLE OF DAYS AGO WHERE YOU THOUGHT THE TIME OF WAR");
	c.println ("WAS OVER. NOW, IT SEEMS LIKE THE WAR FOLLOWED YOU ITSELF AND MADE YOU INTO AN");
	c.println ("IMPORTANT KEY THAT HOLDS THE VICTOR OF THIS SECRET BATTLE. BUT WHICH SIDE MUST");
	c.println ("YOU CHOOSE?");

	//continue button
	Continue ();

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}


	//Round 5 starts
	//instructions
	InstructionBasic ("THE DIVISIONAL AUTHORITY OF DISTRICT 13 OPERATIONS WILL VISIT TODAY.\n\nMAINTAIN YOUR BEST BEHAVIOUR.");

	//round #
	c.println ("DAY 5");

	//continue button
	Continue ();

	//reset penalty checker
	penaltyCheck = 2;

	//General encounter
	c.println ("GAME MASTER: YOU ENTER YOUR INSPECTION OFFICE AND FIX YOURSELF UP TO MEET THE");
	c.println ("HIGHER UPS.");
	c.println ();
	delay (2000);
	c.println ("*knock* *knock*");
	c.println ();
	delay (1500);
	c.println ("GAME MASTER: THE DOOR TO YOUR OFFICE OPENS AND YOU SEE A FAMILIAR FACE.");
	c.println ();
	delay (1000);
	c.println ("GENERAL: YO! LONG TIME NO SEE, EH?");
	c.println ();
	delay (1000);
	c.println ("YOU: OH! NICE TO MEET YOU AGAIN, SIR. WHAT BRINGS YOU HERE?");
	c.println ();
	delay (1000);
	c.println ("GENERAL: JUST A SMALL REPORT, NO NEED TO PANIC.");
	c.println ();
	delay (1000);

	bank.deposit (starsToken (success));

	c.println ("GAME MASTER: GENERAL LEAVES AND YOU PROCEED TO WORK.");

	//continue button
	Continue ();

	//Round 5
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;
	}

	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");

	c.clear ();


	if (detain >= 2)
	{
	    delay (500);
	    c.println ("YOU: NEXT!");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: OFFICER CAIN ENTERS.");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: GOOD MORNING.");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: YOU DETAINED " + detain + " PEOPLE.");
	    c.println ();
	    delay (1500);

	    detainMoney = ((int) (detain / 2)) * 5;
	    bank.deposit (detainMoney);

	    c.println ("________________________________________________________________________________");
	    c.println ("DEPOSIT: $" + detainMoney);
	    c.println ("________________________________________________________________________________");
	    c.println ();
	    delay (1500);

	    c.println ("OFFICER CAIN: BONUS IS GOOD, THEY PAY ALRIGHT. KEEP IT UP.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: OFFICER CAIN LEAVES.");
	    delay (3000);

	    detain = 0;
	}

	//STORY GIVE PUZZLE TO THE PERSON AND LET THEM PASS
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	c.println ("HEIGHT: 187cm");
	c.println ("WEIGHT: 68kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: STEPHEN GRAY");
	f.println ("DATE OF BIRTH: 1968. 05. 30");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): OTHARIA");
	f.println ("EXPIRATION DATE: 1999. 08. 11");

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: SHADOW STARS");
	h.println ("NATIONALITY (CITY): BOST");
	h.println ("NATION SYMBOL: BEAR");
	h.println ("PURPOSE: JOB");
	h.println ("DURATION: SEVERAL WEEKS");
	h.println ("PRINTED TIME: 9:10 AM");

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: STEPHEN GRAY");
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: JOB");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: SEVERAL WEEKS");
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	f.clear ();
	h.clear ();

	//Respond
	if (user == (int) 10)
	{
	    shadow++;

	    c.println ("YOU: ARE YOU THE AGENT?");
	    c.println ();
	    c.println ("SHADOW STARS: ...OF CREED? YES. PLEASE HAND ME THE PAPERS.");
	    c.println ();
	    o.clear ();

	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus -= 10;
	    creed += 5;
	    delay (3000);
	}
	else if (user == (int) 8)
	{
	    c.println ("YOU: YOU ARE INELIGIBLE FOR LOFUS.");
	    c.println ();
	    c.println ("NPC: THE CREED KNOWS...");
	    c.println ();

	    lofus--;
	    creed--;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    lofus += 5;
	    creed -= 10;
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;
	}


	//Round 5 continue
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;
	}

	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");

	c.clear ();

	alarm ();

	//Day 5 over
	c.println ("DAY 5 IS OVER");

	//continue button
	Continue ();

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}


	//Round 6 starts
	//instructions
	InstructionBasic ("A PROBLEM OCCURRED IN THE APLEN CAPITAL.\n\nA SUSPICIOUS GROUP SEEMS TO BE ROAMING AROUND LOFUS, CAUSING TROUBLE.\n\nBE WARY OF YOUR SURROUNDINGS FOR IT MIGHT HAPPEN TO YOU.\n\nBECAREFUL, INSPECTOR.");

	//round #
	c.println ("DAY 6");

	//continue button
	Continue ();

	//reset penalty checker
	penaltyCheck = 2;

	//General encounter
	c.println ("GAME MASTER: YOU ENTER YOUR INSPECTION OFFICE AND PREPARE TO WORK.");
	c.println ();
	delay (1500);
	c.println ("*knock* *knock*");
	c.println ();
	delay (1500);
	c.println ("YOU: COME IN.");
	c.println ();
	delay (1500);
	c.println ("GAME MASTER: GENERAL ENTERS YOUR OFFICE. YOU'RE SEEING HIM MORE OFTEN THESE");
	c.println ("DAYS.");
	c.println ();
	delay (1500);
	c.println ("GENERAL: GOOD MORNING, INSPECTOR. NICE TO MEET YOU AGAIN.");
	c.println ();
	delay (1500);
	c.println ("YOU: LIKEWISE.");
	c.println ();
	delay (1500);
	c.println ("GENERAL: YOU ARE HEALTHY TODAY. YES?");
	c.println ();
	delay (1500);
	c.println ("YOU: SEEMS TO BE.");
	c.println ();
	delay (1500);
	c.println ("GENERAL: GOOD. I HAVE A FEW QUESTIONS FOR YOU. NO NEED TO GET ANXIOUS. GIVEN AN");
	c.println ("APPROPRIATE ANSWER, YOU WILL NOT BE HARMED.");
	c.println ();
	delay (1500);
	c.println ("YOU: ...OKAY.");

	Continue ();

	c.println ("GENERAL: THERE WAS A PROBLEM AT THE CAPITAL LAST NIGHT. MAYBE YOU'VE HEARD THE");
	c.println ("NEWS. IT IS A VERY SERIOUS ONE.");
	c.println ();
	delay (1500);
	c.println ("GENERAL: WE THINK IT IS NOT AN ACCIDENT AND IT IS CAUSED BY A SUSPICIOUS");
	c.println ("TERRORIST GROUP.");
	c.println ();
	delay (1500);
	c.println ("GENERAL: WE THINK SOME MEMBERS PASS THROUGH THIS CHECKPOINT. SO I WAS SENT TO");
	c.println ("TALK TO YOU...");
	c.println ();
	delay (1500);
	c.println ("GENERAL: HAVE YOU SEEN ANYTHING LIKE THIS?");
	c.println ();
	delay (1500);

	//government version of creed symbol
	n = new Console (6, 27);
	governCreed ();

	c.println ("GAME MASTER: THE GENERAL GIVES YOU A TOKEN IDENTICAL TO THE SYMBOL OF CREED.");
	c.println ("YOUR HEART SUDDENLY DROPS, BUT YOU TRY TO STAY AS CALM AS POSSIBLE.");
	c.println ();
	delay (5000);
	c.println ("GENERAL: IT IS SAID TO BE SOME KIND OF SYMBOL FOR THE GROUP.");
	c.println ();
	delay (1500);
	c.println ("GENERAL: IF YOU HAVE ANY INFORMATION, YOU. MUST. TELL. US... YES?");
	c.println ();
	delay (1500);
	c.println ("YOU: ...");
	c.println ();
	delay (1500);
	c.println ("GENERAL: ...");
	c.println ();
	delay (1500);
	c.println ("YOU: ...");
	c.println ();
	delay (1500);
	c.println ("GENERAL: ...YES?");
	c.println ();
	delay (1500);
	c.println ("YOU: OH, Y-YES.");
	c.println ();
	delay (2500);

	Continue ();

	c.println ("GENERAL: VERY GOOD.");
	c.println ();
	delay (1500);
	c.println ("GENERAL: THIS GROUP IS VERY DANGEROUS.");
	c.println ();
	delay (1500);
	c.println ("GENERAL: IF YOU SEE ANY CURIOUS THINGS, REPORT TO US IMMEDIATELY.");
	c.println ();
	delay (2000);

	delay (1500);
	c.println ("GENERAL: GLORY TO LOFUS.");
	c.println ();
	delay (1500);
	c.println ("GAME MASTER: THE GENERAL LEAVES AND YOU RELAX YOUR ENTIRE BODY. IT FEELS LIKE");
	c.println ("YOU JUST DIED AND CAME BACK.");
	c.println ();
	delay (1500);
	c.println ("GAME MASTER: THE FACT THAT THE GENERAL WAS NOT IN A MOOD FOR JESTING SCREAMS");
	c.println ("SOMETHING DANGEROUS.");
	c.println ();
	delay (1500);
	c.println ("GAME MASTER: NOW YOU KNOW FOR A FACT. IT IS TOO LATE FOR YOU TO GO BACK AND LIVE");
	c.println ("A NORMAL LIFE. YOU ARE NOW AN IMPORTANT PART OF THE WAR THAT IS TO COME.");

	//continue button
	Continue ();

	//Round 6
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;
	}

	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");

	c.clear ();


	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);
	c.println ();
	c.println ("GAME MASTER: A BEAUTIFUL WOMAN WITH LONG SMOOTH, SILKY HAIR, WEARING A LONG");
	c.println ("BURGUNDY DRESS THAT MADE HER LOOK SO ELEGANT, APPEARED IN FRONT OF YOU, INJURED");
	c.println ("AND TIRED.");
	delay (2500);
	c.println ();
	c.println ("YOU: PAPERS, PLE-");
	delay (1500);
	c.println ();
	c.println ("STRANGER: PLEASE. I BEG OF YOU. LET ME THROUGH.");
	delay (1500);
	c.println ();
	c.println ("YOU: WELL, WE CAN ARRANGE THAT TO HAPPEN IF YOU SHOW ME YOUR PAPE-");
	delay (1500);
	c.println ();
	c.println ("STRANGER: I'M SORRY. I DON'T HAVE ANYTHING.");
	delay (1500);
	c.println ();
	c.println ("YOU: UMM... I APOLOGIZE BUT I CANNOT ALLOW YOU TO ENT-");
	delay (1500);
	c.println ();
	c.println ("STRANGER: I'M SORRY. I HAD TO ESCAPE THE SHINRA BUILDING AS SOON AS POSSIBLE.");
	c.println ("IF WE DON'T GO TO LOFUS, THEY WILL TRACK US DOWN AND CAPTURE US AGAIN.");
	delay (1500);
	c.println ();
	c.println ("YOU: WE?");

	Continue ();

	c.println ("GAME MASTER: THE BEAUTIFUL STRANGER SQUINTS AS SHE MADE A MISTAKE.");
	delay (1500);
	c.println ();

	c.println ("GAME MASTER: SHE THEN REVEALS A LITTLE GIRL WEARING A RIBBON UNDER HER DRESS.");
	delay (2000);
	c.println ();

	c.println ("GAME MASTER: THE LITTLE GIRL IS AS BEAUTIFUL AS HER MOTHER. BUT AS A CHILD, SHE");
	c.println ("EMITS AN ADORABLE CHARM RATHER THAN AN ELEGANT ONE.");
	delay (1500);
	c.println ();
	c.println ("IFALNA: SHE IS AERITH AND I AM ILFANA. WE WON'T STAY HERE FOR LONG. WE ARE");
	c.println ("PLANNING TO USE LOFUS AS A DISTRACTION TO ESCAPE FROM BEING A SPECIMEN FOR ANY");
	c.println ("SCIENTIFIC EXPERIMENTS.");
	delay (1500);
	c.println ();
	c.println ("YOU: HUH?");
	delay (1500);
	c.println ();
	c.println ("IFALNA: PLEASE, LET US PASS.");
	delay (1500);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println ("YOU: ... *sigh* ALRIGHT, FINE.");
	    c.println ();
	    delay (500);
	    c.println ("ILFANA: THANK YOU!!! THANK YOU SO MUCH!");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: BEFORE THEY LEFT, AERITH CAME UP TO YOU AND PLACED SOMETHING ON");
	    c.println ("THE COUNTER.");
	    c.println ();
	    delay (1500);

	    flower ();
	    flower++;

	    c.println ("AERITH: THANK YOU, INSPECTOR. PLEASE BE ON GUARD WHEN YOU RECEIVE YOUR GUN. YOU");
	    c.println ("WILL HAVE A LOT OF USE IN IT, ONCE THE WAR COMES.");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: ILFANA AND AERITH LEAVE QUICKLY, AND YOU ARE FILLED WITH AWE.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: GUN? WAR? WHAT DID THE GIRL MEAN?");

	    //continue button
	    Continue ();

	    delay (1000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	else if (user == (int) 8)
	{
	    c.println ("YOU: I'M SORRY, BUT THERE IS NOTHING I CAN DO.");
	    c.println ();
	    delay (500);
	    c.println ("ILFANA: ...I UNDERSTAND... I'M SORRY FOR WASTING YOUR TIME.");

	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ARE ABOUT TO BRING ILFANA IN FOR");
	    c.println ("CUSTODY.");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: HOWEVER, ILFANA TAKES AERITH BY HER HAND AND SPRINTS OUT OF");
	    c.println ("THE ROOM, BUMPING INTO THE GUARDS AND KNOCKING THEM OUT.");


	    //continue button
	    Continue ();

	    lofus++;
	    success++;
	    bank.deposit (5);
	    salary += 5;
	}
	c.clear ();

	delay (500);
	c.println ("YOU: NEXT!");
	delay (1500);
	c.println ();
	c.println ("YOU: PAPERS, PLE- OH, IT'S YOU.");
	delay (1500);
	c.println ();

	c.println ("GAME MASTER: EVALT HAS APPEARED IN FRONT OF YOU. AGAIN.");
	delay (1500);
	c.println ();

	if (shadow == 1)
	{
	    c.println ("EVALT ALIMARIDE: WE ALL APPRECIATE WHAT YOU HAVE DONE. YOU ARE A VALUABLE PERSON");
	    c.println ("TO HAVE IN OUR SIDE.");
	    delay (1500);
	    c.println ();
	    c.println ("YOU: IS THERE ANYTHING ELSE YOU NEED FOR ME TO DO?");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: THERE IS ONE LAST THING YOU MUST DO BEFORE THE GRAND FINALE.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: AN ASSASSIN OF LOFUS WILL BE SENT TO KILL IMPORTANT CREED");
	    c.println ("MEMBERS TOMORROW. FORTUNATELY, HE WILL GO THROUGH THIS BORDER AND, THEREFORE,");
	    c.println ("WILL HAVE TO GO THROUGH YOU.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: HIS NAME IS EMETER KING. HE MUST BE STOPPED. DO NOT FORGET IT.");

	    Continue ();

	    c.println ("GAME MASTER: EVALT HANDS YOU A STRANGE LOOKING CARD.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: THERE IS A POWDER HIDDEN INSIDE THE CARD. USE IT WHEN YOU");
	    c.println ("APPROVE HIS PASSPORT.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: WE WILL NOT ENCOUNTER EACH OTHER AGAIN. THAT IS, UNTIL THE WAR");
	    c.println ("BEGINS. IF YOU HAVE A CHOICE, WE MAY OR MAY NOT BE ON THE SAME SIDE.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: SO IN CASE WE BECOME ENEMIES, I BID YOU FAREWELL.");
	    delay (1500);
	    c.println ();
	    c.println ("GAME MASTER: EVALT LEAVES.");

	    lofus -= 10;
	    creed += 5;
	}
	else
	{
	    c.println ("EVALT ALIMARIDE: HOW DARE YOU IGNORE MY REQUESTS?!");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: IF IT WASN'T FOR ME, OUR ENTIRELY PLAN COULD'VE BEEN FOILED!");
	    delay (1500);
	    c.println ();
	    c.println ("GAME MASTER: EVALT TAKES A DEEP BREATH AND CALMS DOWN.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: I WILL GIVE YOU ONE LAST CHANCE.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: AN ASSASSIN OF LOFUS WILL BE SENT TO KILL IMPORTANT CREED");
	    c.println ("MEMBERS TOMORROW. FORTUNATELY, HE WILL GO THROUGH THIS BORDER AND, THEREFORE,");
	    c.println ("WILL HAVE TO GO THROUGH YOU.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: HIS NAME IS EMETER KING. HE MUST BE STOPPED. DO NOT FORGET IT.");

	    Continue ();

	    c.println ("GAME MASTER: EVALT HANDS YOU A STRANGE LOOKING CARD.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: THERE IS A POWDER HIDDEN INSIDE THE CARD. USE IT WHEN YOU");
	    c.println ("APPROVE HIS PASSPORT.");
	    delay (1500);
	    c.println ();
	    c.println ("EVALT ALIMARIDE: WE WILL NOT ENCOUNTER EACH OTHER AGAIN. THAT IS, UNTIL THE WAR");
	    c.println ("BEGINS. IF YOU HAVE A CHOICE, WE MAY OR MAY NOT BE ON THE SAME SIDE.");
	    delay (1500);
	    c.println ();
	    c.println ("GAME MASTER: EVALT LEAVES.");

	    creed -= 10;
	    lofus += 5;
	}

	Continue ();

	c.println ("GAME MASTER: YOU TAKE A LOOOOONG SIGH AND THEN MASSAGE YOUR HEAD BEFORE CALLING");
	c.println ("THE NEXT PERSON IN LINE.");
	delay (1500);
	c.println ();

	delay (3000);
	c.println ("YOU: NEXT!");
	delay (1500);
	c.println ();
	c.println ("HEIGHT: 163cm");
	c.println ("WEIGHT: 59kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1500);
	c.println ();
	c.println ("TERRORIST: DEATH TO LOFUS!!!");

	//bomb cover
	o = new Console ();
	o.drawRect (10, 50, 620, 400);

	o.setCursor (12, 37);
	o.print ("2");
	o.setCursor (12, 40);
	o.print ("4");
	o.setCursor (12, 43);
	o.print ("1");
	o.setCursor (12, 46);
	o.print ("3");

	o.setCursor (4, 5);
	o.print ("A");
	o.setCursor (22, 5);
	o.print ("B");
	o.setCursor (4, 76);
	o.print ("C");
	o.setCursor (22, 76);
	o.print ("D");

	o.drawRect (278, 215, 97, 30);
	o.drawLine (303, 215, 303, 245);
	o.drawLine (327, 215, 327, 245);
	o.drawLine (353, 215, 353, 245);

	o.drawOval (24, 64, 26, 26);
	o.drawOval (590, 65, 26, 26);
	o.drawOval (590, 410, 27, 27);
	o.drawOval (23, 412, 27, 27);

	//1
	o.drawLine (590, 80, 150, 80);
	o.drawLine (150, 80, 150, 300);
	o.drawLine (150, 300, 340, 300);
	o.drawLine (340, 300, 340, 245);

	//2
	o.drawLine (600, 410, 600, 380);
	o.drawLine (600, 380, 200, 380);
	o.drawLine (200, 380, 200, 190);
	o.drawLine (200, 190, 400, 190);
	o.drawLine (400, 190, 400, 280);
	o.drawLine (400, 280, 290, 280);
	o.drawLine (290, 280, 290, 245);

	//3
	o.drawLine (50, 420, 450, 420);
	o.drawLine (450, 420, 450, 180);
	o.drawLine (450, 180, 365, 180);
	o.drawLine (365, 180, 365, 215);

	//4
	o.drawLine (40, 90, 40, 150);
	o.drawLine (40, 150, 312, 150);
	o.drawLine (312, 150, 312, 215);

	delay (500);
	c.println ();
	c.println ("GAME MASTER: BEFORE YOU REACT, THE PERSON LEAVES A BOMB ON THE COUNTER AND BOLTS");
	c.println ("AWAY.");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: YOU START TO PANIC. THERE IS A BOMB ON YOUR DESK AND YOU DON'T KNOW");
	c.println ("WHAT TO DO.");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: YOU START TO SHAKE UNCONTROLLABLY. YOUR HEAD GOES BLANK AND YOU");
	c.println ("BEGIN TO CRY.");

	Continue ();

	c.println ("GAME MASTER: SUDDENLY, YOU HEAR THE DOOR OPENING AND OFFICER CAIN WALKS IN.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: I HEARD SOMEONE SCREAMING. WHAT'S GOING ON?");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: OH. HAH. WHAT IS THIS AMATEUR CRAP?");
	delay (1500);
	c.println ();
	c.println ("YOU: SH-SHOULD WE EVACUATE?");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: FOR THAT LITTLE THING? NO, OF COURSE NOT.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: JUST DISABLE IT.");
	delay (1500);
	c.println ();
	c.println ("YOU: W-WHAT?! HOW?! W-WHAT IF IT BLOWS UP?");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: UMM... I'M NOT SURE, WHAT WOULD HAPPEN IF A BOMB EXPLODES IN FRONT");
	c.println ("OF OUR FACES? HMMM... OH! I KNOW! WE FREAKING DIE!");
	delay (1500);
	c.println ();
	c.println ("YOU: *sob* I DON'T WANT TO DIE!!!");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: *sigh* ALRIGHT, DON'T PANIC. JUST DO AS I SAY.");
	delay (1500);
	c.println ();

	Continue ();

	//bomb disable
	bomb ();

	//continute button
	Continue ();

	c.println ("OFFICER CAIN: WOW. WE ACTUALLY SURVIVED THAT.");
	delay (2000);
	c.println ();
	lofus += 10;

	alarm ();

	//Day 6 over
	c.println ("DAY 6 IS OVER");

	//continue button
	Continue ();

	c.println ("OFFICER CAIN: OH! JUST IN TIME.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: *heh* AND YOU CRIED OVER THAT?");
	delay (1500);
	c.println ();
	c.println ("YOU: SHUT UP.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: WELL, YOU DID PRETTY GOOD FOR YOUR FIRST TRY.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: HERE, GIVE. I'LL CONFISCATE IT AND REPORT IT TO THE BOSS.");
	delay (1500);
	c.println ();
	c.println ("YOU: YA, OKAY.");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: YOU WIPE YOUR TEARS AND HAND THE BOMB OVER TO OFFICER CAIN.");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: BEFORE HE LEAVES, YOU STOP HIM.");
	delay (1500);
	c.println ();

	//continue button
	Continue ();

	c.println ("YOU: HEY.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: HUH? WHAT?");
	delay (1500);
	c.println ();
	c.println ("YOU: ...THANKS.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: H-HUH? W-WHAT?! NO, SHUT UP!");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: OFFICER CAIN LEAVES WITH HIS FACE ALL RED. TURNS OUT, HE IS A");
	c.println ("TSUNDERE (PERSON WHO TRIES TO ACT TOUGH TO HIDE THEIR SHY PERSONALITY).");
	delay (1500);
	c.println ();

	//continue button
	Continue ();

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}

	//Round 7 starts
	//instructions
	InstructionBasic ("THE REPORT OF THE ATTEMPTED TERROR HAS BEEN SENT TO US.\n\nDUE TO YOUR EXTRAORDINARY WORK, WE HAVE TRANSFERRED $50 INTO YOUR BANK ACCOUNT.\n\nPLEASE CONTINUE TO SHOW US THE SKILLS OF AN INSPECTOR.");
	bank.deposit (50);

	//Assassin to kill
	o = new Console (10, 35);

	o.drawLine (85, 40, 200, 40);

	Font font3 = new Font ("Agency FB", Font.PLAIN, 20);
	o.setFont (font3);
	o.drawString ("CREED", 125, 30);
	Font font4 = new Font ("Impact", Font.PLAIN, 20);
	o.setFont (font4);
	o.drawString ("EMETER KING", 95, 65);
	o.setCursor (6, 1);
	o.println ("I LEFT THIS INSIDE YOUR ROOM, IN   CASE YOU ARE TO FORGET. APPROVE HIM.");
	o.setCursor (9, 1);
	o.println ("ASSASSINATE USING THE POWDER.");

	//round #
	c.println ("DAY 7");

	//continue button
	Continue ();

	//reset penalty checker
	penaltyCheck = 2;

	//General encounter
	c.println ("GAME MASTER: YOU ENTER YOUR INSPECTION OFFICE AND PREPARE FOR TODAY'S SHIFT.");
	delay (1500);
	c.println ();
	c.println ("*knock* *knock* *knock*");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: YOU OPEN THE DOOR TO YOUR OFFICE AND SEE OFFICER CAIN.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: HEY, FRIEND, HOW ARE YOU?");
	delay (1500);
	c.println ();
	c.println ("YOU: (FRIEND?) UMM... YA, I'M GOOD.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: GOOD, GOOD.");

	//continue button
	Continue ();

	c.println ("YOU: ...");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: ...");
	delay (1500);
	c.println ();
	c.println ("YOU: ...");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: ...");
	delay (1500);
	c.println ();
	c.println ("YOU: ...DO YOU NEED SOMETHING FROM ME?");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: EHHH... NOT REALLY... WELL, ACTUALLY, YES.");
	delay (1500);
	c.println ();
	c.println ("YOU: ...I'M LISTENING.");

	//continue button
	Continue ();

	c.println ("OFFICER CAIN: OKAY, UMM... SO... UMM...");
	delay (1500);
	c.println ();
	c.println ("YOU: I KIND OF NEED TO START SOON, SO...");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: YEYE, SORRY ABOUT THAT.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: SO, UMM... I... I HAVE A SMALL, REALLY SMALL FAVOUR TO ASK.");
	delay (1500);
	c.println ();
	c.println ("YOU: ASK AWAY.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: OKAY.. SO, DURING THE WAR, I MET A BEAUTIFUL WOMAN. I THINK ABOUT");
	c.println ("HER EVERY MOMENT.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: YESTERDAY, I RECEIVED WORD THAT SHE IS FINALLY COMING HERE.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: PLEASE, LET HER PASS AND I WILL STAND BESIDE YOU NO MATTER WHAT.");

	//continue button
	Continue ();

	c.println ("OFFICER CAIN: HER NAME IS ELISA KATSENJA.");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: OFFICER CAIN GIVES YOU A PENDANT");

	pendantCain ();

	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: THIS IS THE OTHER HALF OF THE COUPLE PENDANT THAT WE BOUGHT");
	c.println ("TOGETHER.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: ...I'M IN YOUR DEBT.");
	delay (2500);
	c.println ();
	c.println ("OFFICER CAIN: I MUST GO NOW.");
	delay (1000);
	c.println ();
	c.println ("GAME MASTER: OFFICER CAIN LEAVES WITHOUT YOUR REPLY.");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: YOU TAKE A CLOSER LOOK AT THE PENDANT. IT IS BEAUTIFUL AND MADE OUT");
	c.println ("OF RUBIES. OFFICER CAIN PROBABLY GAVE THIS TO YOU FOR YOU TO APPROVE OF HIS");
	c.println ("LOVER WITHOUT ANY HESITATION. HOWEVER, WILL YOU DO IT?");
	delay (1500);
	c.println ();

	//continue button
	Continue ();

	//Round 7
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;
	}

	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");

	c.clear ();


	//Elisa and Officer Cain romance
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	c.println ("HEIGHT: 171cm");
	c.println ("WEIGHT: 54kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: ELISA KATSENJA");
	f.println ("DATE OF BIRTH: 1962. 10. 21");
	f.println ("SEX: F");
	f.println ("NATIONALITY (COUNTRY): OTHARIA");
	f.println ("EXPIRATION DATE: 2001. 08. 13");

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: ELISA KATSENJA");
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: JUST VISITING");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: FOREVER");
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	f.clear ();
	h.clear ();

	//Respond
	if (user == (int) 10)
	{
	    c.println ("YOU: ARE YOU OFFICER CAIN'S LOVER?");
	    delay (1000);
	    c.println ();
	    c.println ("ELISA KATSENJA: YES, HERE IS THE PROOF.");

	    pendantElisa ();

	    delay (1000);
	    c.println ();
	    c.println ("ELISA KATSENJA: THANK YOU SO SO MUCH.");
	    delay (1000);
	    c.println ();
	    c.println ("GAME MASTER: ELISA LEAVES THE OFFICE AND GOES PASS THE BORDER. YOU TAKE A PEEK");
	    c.println ("AT THE WINDOW TO SEE THE OUTCOME.");
	    delay (1000);
	    c.println ();
	    c.println ("GAME MASTER: ONLY AFTER A SECOND DID OFFICER CAIN NOTICE HER PRESENCE.");
	    delay (1000);
	    c.println ();
	    c.println ("OFFICER CAIN: ELISA!");
	    delay (1000);
	    c.println ();
	    c.println ("GAME MASTER: OFFICER CAIN AND ELISA START RUNNING TO EACH OTHER.");
	    delay (1000);
	    c.println ();
	    c.println ("GAME MASTER: THEY RAN INTO EACH OTHER'S ARMS AND HUGGED FOR A VERY LONG TIME.");

	    //continue button
	    Continue ();

	    c.println ("GAME MASTER: THEY BEGAN TO WALK TOWARDS THE CITY FOR HER TO CHECK UP ONCE MORE.");
	    delay (1000);
	    c.println ();
	    c.println ("GAME MASTER: SINCE OFFICER CAIN STILL HAS TO ATTEND TO HIS DUTIES, HE GAVE HER A");
	    c.println ("LONG FINAL HUG AND CONTINUED TO STAND ON POST.");
	    delay (1000);
	    c.println ();

	    //continue button
	    Continue ();

	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    officer++;
	    lofus--;
	    delay (3000);
	}
	else if (user == (int) 8)
	{
	    c.println ("YOU: YOU DO NOT HAVE AN ACCESS PERMIT.");
	    delay (1000);
	    c.println ();
	    c.println ("GAME MASTER: BEFORE YOU DECLINED THE PERSON'S PASSPORT, SHE SPOKE UP.");
	    delay (1000);
	    c.println ();
	    c.println ("ELISA KATSENJA: I'M HERE FOR CAIN.");
	    delay (1000);
	    c.println ();
	    c.println ("GAME MASTER: YOU STOP MOVING.");
	    delay (1000);
	    c.println ();
	    c.println ("YOU: ...OFFICER CAIN?");
	    delay (1000);
	    c.println ();
	    c.println ("ELISA KATSENJA: HE SAID YOU CAN HELP ME.");
	    delay (1000);
	    c.println ();
	    c.println ("YOU: YOU... DO NOT HAVE AN ACCESS PERMIT...");
	    delay (1000);
	    c.println ();
	    c.println ("ELISA KATSENJA: PLEASE, I BEG YOU.");
	    delay (1000);
	    c.println ();
	    c.println ("ELISA KATSENJA: ALL OF MY FAMILY ARE DEAD.");
	    delay (1000);
	    c.println ();
	    c.println ("ELISA KATSENJA: I HAVE NO ONE BUT CAIN... PLEASE.");
	    delay (1000);
	    c.println ();
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));


	    if (user == (int) 10)
	    {
		c.println ("YOU: HE IS WAITING FOR YOU");
		delay (1000);
		c.println ();
		c.println ("ELISA KATSENJA: THANK YOU SO MUCH.");
		delay (1000);
		c.println ();
		c.println ("ELISA KATSENJA: I WILL NEVER FORGET YOUR KINDNESS.");

		delay (1000);
		pendantElisa ();
		delay (1000);

		c.println ();
		c.println ("GAME MASTER: ELISA LEAVES THE OFFICE AND GOES PASS THE BORDER. YOU TAKE A PEEK");
		c.println ("AT THE WINDOW TO SEE THE OUTCOME.");
		delay (1000);
		c.println ();
		c.println ("GAME MASTER: ONLY AFTER A SECOND DID OFFICER CAIN NOTICE HER PRESENCE.");
		delay (1000);
		c.println ();
		c.println ("OFFICER CAIN: ELISA!");
		delay (1000);
		c.println ();
		c.println ("GAME MASTER: OFFICER CAIN AND ELISA START RUNNING TO EACH OTHER.");
		delay (1000);
		c.println ();
		c.println ("GAME MASTER: THEY RAN INTO EACH OTHER'S ARMS AND HUGGED FOR A VERY LONG TIME.");

		//continue button
		Continue ();

		c.println ("GAME MASTER: THEY BEGAN TO WALK TOWARDS THE CITY FOR HER TO CHECK UP ONCE MORE.");
		delay (1000);
		c.println ();
		c.println ("GAME MASTER: SINCE OFFICER CAIN STILL HAS TO ATTEND TO HIS DUTIES, HE GAVE HER A");
		c.println ("LONG FINAL HUG AND CONTINUED TO STAND ON POST.");
		delay (1000);
		c.println ();

		//continue button
		Continue ();

		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		officer++;
		lofus--;
		delay (3000);
	    }
	    else
	    {
		c.println ("YOU: I AM SORRY.");
		delay (1000);
		c.println ();
		c.println ("ELISA KATSENJA: ...I UNDERSTAND.");
		delay (1000);
		c.println ();
		c.println ("ELISA KATSENJA: ...");
		delay (1000);
		c.println ();
		c.println ("YOU: ...");
		delay (1000);
		c.println ();
		c.println ("ELISA KATSENJA: ...I NO LONGER NEED THIS.");

		pendantElisa ();

		delay (500);
		c.println ();
		c.println ("ELISA KATSENJA: GOOD BYE.");
		delay (500);
		c.println ();

		//continue button
		Continue ();

		c.println ("GAME MASTER: SILENCE DEVOURED THE ATMOSPHERE.");
		delay (1500);
		c.println ();
		c.println ("GAME MASTER: ALTHOUGH YOU THINK YOU DID THE RIGHT THING, YOU STILL FEEL VERY");
		c.println ("GUILTY.");
		delay (1500);
		c.println ();
		c.println ("GAME MASTER: BECAUSE OF YOU, DUE TO YOUR DECISION, OFFICER CAIN AND ELISA WILL");
		c.println ("NEVER SEE EACH OTHER AGAIN.");
		delay (1500);
		c.println ();

		//continue button
		Continue ();

		officer--;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    officer--;
	    detain++;
	}


	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	//Respond
	if (user == (int) 10)
	{
	    c.println (respond ("APPROVE"));
	}
	else if (user == (int) 8)
	{
	    c.println (respond ("DECLINE"));
	}
	else
	{
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;
	}

	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");


	//ELIMINATE ASSASSIN
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	c.println ("HEIGHT: 188cm");
	c.println ("WEIGHT: 69kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: EMETER KING");
	f.println ("DATE OF BIRTH: 1941. 01. 17");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): LOFUS");
	f.println ("EXPIRATION DATE: 2000. 03. 01");


	//diplomatic authorization
	o = new Console (13, 40);

	o.println ("         DIPLOMATIC AUTHORIZATION");
	o.println ();
	o.println ("         THIS DOCUMENT AUTHORIZES");
	o.println ("       NAMED AGENT AS A DIPLOMATIC");
	o.println ("         ENTITY OF A COUNCIL OF");
	o.println ("          NATIONS MEMBER STATE.");
	o.println ();
	o.println ("            AGENT: EMETER KING");
	o.println ();
	o.println ("            SIGNED BY: GENERAL");
	o.println ();
	o.println ("       THIS DOCUMENT HAS NO EXPIRY.");

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("EMETER KING: EMETER KING");
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("EMETER KING: MY PRESENCE WAS REQUESTED. I AM A DIPLOMATIC ENVOY");
	delay (1000);
	c.println ();
	c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	o.clear ();

	//Respond
	if (user == (int) 10)
	{
	    c.println ();
	    c.println ("PRESS \"ENTER\" TO PUT GIVEN POWDER FROM CREED TO THE PASSPORT.");
	    c.println ("PRESS \"BACKSPACE\" TO NOT PUT POWDER TO THE PASSPORT.");
	    user = c.getChar ();
	    c.println ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    if (user == (int) 10)
	    {
		powder++;
		lofus -= 5;
		creed += 5;
		c.println ("GAME MASTER: YOU SECRETLY OPEN THE CARD THAT EVALT HAS GIVEN TO YOU AND STAMP");
		c.println ("THE AGENT'S PASSPORT WITH THE POWDER.");
		c.println ();
		delay (1500);
		c.println ("GAME MASTER: YOU CALM YOURSELF DOWN AND QUICKLY GIVE ALL OF THE PAPERS TO THE");
		c.println ("AGENT.");
		c.println ();
		delay (1500);
		c.println ("YOU: GL-ORY TO LOFUS.");
		c.println ();
		delay (1500);
		c.println ("EMETER KING: ...GLORY TO LOFUS.");

		Continue ();
	    }
	    else
	    {
		powder--;
		lofus += 5;
		creed -= 5;
		c.println (respond ("APPROVE"));
	    }

	    f.clear ();

	    lofus += 5;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else if (user == (int) 8)
	{
	    f.clear ();
	    c.println ("YOU: YOU ARE INELIGIBLE FOR LOFUS.");
	    c.println ();
	    c.println ("EMETER KING: WHAT?! ARE YOU ALLOWED TO... WHATEVER.");
	    c.println ();

	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    powder--;
	    lofus -= 5;
	    creed -= 5;
	    delay (3000);
	}
	else
	{
	    f.clear ();
	    powder--;
	    lofus -= 5;
	    c.println ("YOU: WAIT HERE.");
	    c.println ();
	    delay (500);
	    c.println ("EMETER KING: WAIT, WHAT? ARE YOU ALLOWED TO DO THIS?");
	    c.println ();
	    delay (500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS ENTER AND ESCORT THE PERSON OUT OF YOUR SIGHT.");
	    c.println ();

	    detain++;

	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    delay (3000);
	}

	c.clear ();

	alarm ();

	//Day 7 over
	c.println ("DAY 7 IS OVER");

	//continue button
	Continue ();

	if (powder == 1)
	{
	    c.println ("GAME MASTER: BEFORE YOU GO HOME FOR TODAY, YOU LOOK AT THE AGENT TO SEE WHAT");
	    c.println ("THE POWDER WAS ABOUT.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: ...NOTHING HAPPENED.");
	    c.println ();
	    delay (1500);
	    c.println ("EMETER KING: *COUGH!* *COUGH!* *COUGH!*");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: YOU WERE ABOUT TO PACK YOUR THINGS UNTIL YOU HEAR AN EXTREMELY");
	    c.println ("LOUD AND AGONIZING COUGH FROM OUTSIDE.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: WHEN YOU LOOKED OUTISDE, THE AGENT WAS KNEELING AND FACING DOWN.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: HE CONTINUED COUGHING EVER SO LOUDLY. UNTIL YOU SAW A POOL OF BLOOD");
	    c.println ("COMING OUT OF HIS MOUTH.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: A NEARBY OFFICER HURRIED TOWARDS HIM.");
	    c.println ();
	    delay (1500);

	    //continue button
	    Continue ();

	    c.println ("GAME MASTER: THE OFFICER CHECKED FOR HIS PULSE, BUT LOOKING AT HIS REACTION, IT");
	    c.println ("SEEMS THAT THE AGENT IS DEAD.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: THE OFFICER SUDDENLY TURNS TOWARDS YOU AND YOU REFLECTIVELY HIDE");
	    c.println ("YOURSELF.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: IT DIDN'T MATTER THOUGH. THIS TIME, HE BEGAN TO WALK TOWARDS YOU.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: YOUR HEART DROPS AND YOU ARE NOW IN A COLD SWEAT.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: HOWEVER, WHEN YOU TOOK A PEAK AT THE OFFICER, YOU SAW HIM SITUATED");
	    c.println ("FROM WHERE YOU LAST SAW HIM. HE BEGAN TO SHAKE HIS HEAD AND CROUCH DOWN.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: IT ONLY TOOK HIM A SECOND BEFORE HE BEGAN TO COUGH OUT BLOOD AS");
	    c.println ("WELL.");
	    c.println ();
	    delay (1500);

	    //continue button
	    Continue ();
	}

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}


	//Round 8 starts
	//instructions
	if (officer == 1)
	{
	    InstructionBasic ("THERE HAS BEEN MULTIPLE TERRORIST INCIDENTS IN LOFUS AND WE BELIEVE THAT THEY   WILL NOT STOP ANY TIME SOON.\n\nUNFORTUNATELY, SOLDIERS ARE BECOMING VERY SCARCE AND SO WE DECIDED TO BRING IN  THE SECURITY GURADS NEAR YOUR POST TO THE CAPITAL.\n\nDO NOT WORRY, WE WILL BE PROVIDING YOU WITH AN \"M1911 PISTOL\" WHICH YOU CAN USE TO PROTECT YOURSELF.\n\nOFFICER CAIN WAS REQUESTED TO COME TO THE CAPITAL, BUT HE DECIDED TO STAY WITH  YOU FOR YOUR SAFETY.");
	}
	else
	{
	    InstructionBasic ("THERE HAS BEEN MULTIPLE TERRORIST INCIDENTS IN LOFUS AND WE BELIEVE THAT THEY   WILL NOT STOP ANY TIME SOON.\n\nUNFORTUNATELY, SOLDIERS ARE BECOMING VERY SCARCE AND SO WE DECIDED TO BRING IN  THE SECURITY GURADS NEAR YOUR POST TO THE CAPITAL.\n\nDO NOT WORRY, WE WILL BE PROVIDING YOU WITH AN \"M1911 PISTOL\" WHICH YOU CAN USE TO PROTECT YOURSELF.");
	}


	//round #
	c.println ("DAY 8");

	//continue button
	Continue ();

	//reset penalty checker
	penaltyCheck = 2;

	//General encounter
	if (officer == 1)
	{
	    c.println ("GAME MASTER: YOU ENTER YOUR INSPECTION OFFICE AND PREPARE FOR WORK.");
	    c.println ();
	    delay (1500);
	    c.println ("*knock* *knock* *knock*");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: OFFICER CAIN ENTERS.");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: H-HELLO. *ahem*");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: UHH... YES, HELLO. DO YOU WANT ME TO DO SOMETHING AGAIN?");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: NONO, I'M NOT HERE TO REQUEST ANYTHING. UMM... THANK YOU... VERY");
	    c.println ("MUCH FOR... *ahem* UHH... LETTING ELISA PASS... THE BORDER... I'M FOREVER IN");
	    c.println ("YOUR DEBT.");

	    //continue button
	    Continue ();

	    c.println ("YOU: UH HUH.");
	    c.println ();
	    delay (1500);


	    if (detain >= 2)
	    {
		c.println ("OFFICER CAIN: OH! AND BEFORE ANYTHING ELSE, HERE.");
		c.println ();
		delay (1500);
		c.println ("OFFICER CAIN: YOU DETAINED " + detain + " PEOPLE.");
		c.println ();
		delay (1500);

		detainMoney = ((int) (detain / 2)) * 5;
		bank.deposit (detainMoney);

		c.println ("________________________________________________________________________________");
		c.println ("DEPOSIT: $" + detainMoney);
		c.println ("________________________________________________________________________________");
		c.println ();
		delay (1500);

		c.println ("OFFICER CAIN: BONUS IS GOOD, THEY PAY ALRIGHT... AND, WELL...");
		c.println ();
		delay (2000);
	    }

	    c.println ("OFFICER CAIN: OH YA! HA! YOU ARE STUCK WITH ME UNTIL THINGS CALM DOWN!");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: I WANTED TO LEAVE THIS CHECKPOINT LIKE THE OTHERS AND GO TO THE");
	    c.println ("CAPITAL, BUT THE GOVERNMENT SAID OTHERWISE.");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: UNFORTUNATELY... FOR YOU - I MEAN, I NEED TO SECURE THE PERIMETER");
	    c.println ("SO I CAN ONLY HELP YOU WHEN YOU NEED SOMEONE TO BE DETAINED.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: OFFICER CAIN'S WORDS AND THE WRITTEN DOCUMENT FROM THIS MORNING");
	    c.println ("CONTRADICT EACH OTHER. YOU TRIED TO STATE THAT.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: WAIT, BUT THE DOCUMENT SAYS THAT YOU DECI-");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: A-ANYWAYS! LET'S PROTECT ONE ANOTHER AND DO OUR JOBS! OKAY, BYE.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: OFFICER CAIN LEAVES IN A HURRY.");
	}
	else
	{
	    c.println ("GAME MASTER: YOU ENTER YOUR INSPECTION OFFICE AND SEE OFFICER CAIN.");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: HELLO INSPECTOR.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: WHY ARE YOU IN HERE? HOW DID YOU GET IN?");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: THAT MATTERS NOT.");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: I AM HERE TO TELL YOU THAT I'LL BE LEAVING OFF TO THE CAPITAL.");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: YOU SEE, BECAUSE OF A CERTAIN SOMEONE, I HAVE NO NEED TO STAY");
	    c.println ("HERE.");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: I DON'T HAVE A REASON TO WAIT FOR SOMEONE I LONGED FOR SO MUCH");
	    c.println ("BECAUSE SHE IS NOT COMING... NOT ANYMORE.");

	    //continue button
	    Continue ();

	    c.println ("OFFICER CAIN: OF COURSE YOU WOULDN'T CARE, BUT I WANTED TO SEE THE PERSON I");
	    c.println ("DESPISE THE MOST ONE MORE TIME TO SAY THIS...");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: I WILL RAIN DOWN EVERY AGONY, EVERY VIOLATION IMAGIBALE, UPON YOU.");
	    c.println ("I WILL PARADE YOUR COLD BODY FROM EVERY CORNER OF EVERY DIMENSION, AND FEED YOUR");
	    c.println ("SOUL TO THE VILEST FILTH IN HELL!!! THAT IS MY PROMISE TO YOU!");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: OFFICER CAIN TAKES A BREATHER TO CALM DOWN");
	    c.println ();
	    delay (1500);
	    c.println ("OFFICER CAIN: YOU HAVE MADE A GRAVE CHOICE OF ROBBING ME OF EVERYTHING.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: HE SLAMS THE DOOR AND LEAVES. YOU ARE QUITE SHOCKED TO HEAR HIM");
	    c.println ("SAY THAT, BUT THAT WILL NOT STOP YOU FROM WORKING. WILL IT?");
	    c.println ();
	    delay (1500);
	}


	//continue button
	Continue ();

	//Round 8
	for (int i = 0 ; i < 2 ; i++)
	{
	    c.clear ();
	    delay (500);
	    c.println ("YOU: NEXT!");
	    delay (1000);

	    Record = 0;
	    nameUsed = "";
	    do
	    {
		Record = (int) (Math.random () * (80));
		nameUsed = rec [Record].getName ();
	    }
	    while (nameUsed.equals (""));

	    c.println (rec [Record].toString ());
	    c.println ();
	    c.println ("YOU: PAPERS, PLEASE.");
	    delay (1000);
	    c.println ();

	    //Passport
	    f.println ("PASSPORT");
	    f.println ("NAME: " + rec [Record].getName ());
	    f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	    f.println ("SEX: " + rec [Record].getSex ());
	    f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	    f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	    //Access permit
	    h.println ("ACCESS PERMIT");
	    h.println ("NAME: " + rec [Record].getName ());
	    h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	    h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	    h.println ("PURPOSE: " + rec [Record].getPurpose ());
	    h.println ("DURATION: " + rec [Record].getDuration ());
	    h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	    c.println ("YOU: WHAT IS YOUR NAME?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getName ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getPurpose ());
	    delay (1000);
	    c.println ();
	    c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	    delay (500);
	    c.println ("NPC: " + rec [Record].getDuration ());
	    delay (1000);
	    c.println ();

	    if (officer == 1)
	    {
		c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

		//Respond
		if (user == (int) 10)
		{
		    c.println (respond ("APPROVE"));
		}
		else if (user == (int) 8)
		{
		    c.println (respond ("DECLINE"));
		}
		else
		{
		    c.println ("YOU: WAIT HERE.");
		    c.println ();
		    delay (500);
		    c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
		    c.println ();
		    delay (500);
		    c.println ("GAME MASTER: OFFICER CAIN ENTERS AND ESCORTS THE PERSON OUT OF YOUR SIGHT.");
		    c.println ();

		    detain++;
		}
	    }
	    else
	    {
		c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 10 || user == (int) 8))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 10 || user == (int) 8));

		//Respond
		if (user == (int) 10)
		{
		    c.println (respond ("APPROVE"));
		}
		else
		{
		    c.println (respond ("DECLINE"));
		}
	    }
	    f.clear ();
	    h.clear ();

	    //Did you get it right?
	    conditionChecker = rec [Record].getCondition ();

	    if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	    {
		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else
	    {
		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
	    }
	    rec [Record].setName ("");
	}


	//First Gun Test
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (500);
	c.println ();
	c.println ("HEIGHT: 170cm");
	c.println ("WEIGHT: 57kg");
	c.println ();
	delay (1500);
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1500);

	//passport
	f.println ("PASSPORT");
	f.println ("NAME: WILLIAM GRAMANN");
	f.println ("DATE OF BIRTH: 1946. 12. 08");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): SPONIA");
	f.println ("EXPIRATION DATE: 2000. 11. 07");

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: WILLIAM GRAMANN");
	h.println ("NATIONALITY (CITY): DATRAX");
	h.println ("NATION SYMBOL: CAT");
	h.println ("PURPOSE: WORK");
	h.println ("DURATION: 1 MONTH");
	h.println ("PRINTED TIME: 9:55 AM");

	delay (1500);
	c.println ();
	c.println ("WHAT IS YOUR NAME?");
	delay (1500);
	c.println ("WILLIAM GRAMANN");
	delay (1500);
	c.println ();
	c.println ("WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (1500);
	c.println ("WORK");
	delay (1500);
	c.println ();
	c.println ("FOR HOW LO-");
	delay (500);

	f.clear ();
	h.clear ();
	c.clear ();

	q = new Console (8, 35);
	p = new Console ();

	//border crosser
	c.println ("GAME MASTER: YOU HEAR A FAMILIAR ALARM SOUND. YOU LOOK OUTSIDE AND SEE A YOUNG");
	c.println ("MAN RUNNING TOWARDS THE BORDER WALL.");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: SINCE OFFICER CAIN IS STILL OUTSIDE, SECURING THE PERIMETER, YOU");
	c.println ("MUST ACT ON YOUR OWN.");
	delay (1500);
	c.println ();
	c.println ("GAME MASTER: LUCKILY, YOU'RE SOMEONE WHO DISABLED A BOMB BEFORE, AND YOU EVEN");
	c.println ("HAVE A GUN.");
	delay (1500);
	c.println ();

	c.println ("PRESS \"SPACE\" KEY TO USE YOUR PISTOL.");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 32))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}


	while (!(user == (int) 32));

	c.clear ();
	c.println ("GAME MASTER: THE TERRORIST DOESN'T HAVE ANY WEAPONS, SO YOU JUST NEED TO");
	c.println ("FOCUS ON SHOOTING. THE BATTLE CONSOLE SCREEN WILL SHOW YOU THE INFORMATION");
	c.println ("OF THE FIGHT.");
	c.println ();
	c.println ("GAME MASTER: SINCE YOU ONLY NEED TO SHOOT, KEEP ON PRESSING THE 'A' KEY TO");
	c.println ("SHOOT THE TERRORIST BEFORE HE ESCAPES. (USE THE BATTLE SCREEN WHEN FIGHTING)");
	c.println ();
	c.println ("GAME MASTER: AFTER PRESSING 'A', A ROULETTE WILL APPEAR ON A SMALL SCREEN.");
	c.println ();
	c.println ("GAME MASTER: EVERYTHING THAT HAPPENS THERE IS AUTOMATIC AND ALL YOU HAVE TO DO");
	c.println ("IS WATCH.");
	c.println ();
	c.println ("GAME MASTER: IF THE TOTAL NUMBER OF THE ROULETTE IS EQUAL TO OR GREATER THAN");
	c.println ("THE ENEMY'S ARMOUR CLASS, YOU HAVE HIT THE ENEMY. THE SECOND ROULETTE WILL BE");
	c.println ("ROLLED IF IT'S HIT.");
	c.println ();
	c.println ("GAME MASTER: IF THE SECOND ROULETTE HAS THREE IDENTICAL NUMBERS, YOU WILL GET");
	c.println ("A BONUS ATTACK.");
	c.println ();

	//battle screen
	bossAC = 8;
	bossHp = 2;
	distanceX = 10;

	do
	{
	    p.println ("BATTLE");
	    p.println ();
	    p.println ("<TERRORIST>");
	    p.println ("AC: 8");
	    p.println ("Hp: " + bossHp);
	    p.println ("DISTANCE: " + distanceX + "M FROM EXIT");
	    p.println ("NEXT MOVE: RUN 2M");
	    p.println ("________________________________________________________________________________");
	    p.println ("<INSPECTOR>");
	    p.println ("PRESS KEY TO ACT");
	    p.println ("'A': ATTACK");
	    user = p.getChar ();
	    do
	    {
		if (!(user == (int) 97 || user == (int) 65))
		{
		    p.println ();
		    p.println ("<ERROR>");
		    user = p.getChar ();
		}
	    }
	    while (!(user == (int) 97 || user == (int) 65));

	    hit1 = (int) (Math.random () * 6) + 1;
	    hit2 = (int) (Math.random () * 6) + 1;
	    hit3 = (int) (Math.random () * 6) + 1;

	    q.clear ();
	    q.println ("ROULETTE");
	    delay (1000);
	    q.println ("CHANCE: [" + hit1 + "] " + " [" + hit2 + "] " + " [" + hit3 + "]");

	    hitTotal = hit1 + hit2 + hit3;

	    if (bossAC <= hitTotal)
	    {
		dam1 = (int) (Math.random () * 2) + 1;
		dam2 = (int) (Math.random () * 2) + 1;
		dam3 = (int) (Math.random () * 2) + 1;

		delay (1000);
		q.println ("CONDITION: HIT!");
		delay (1000);
		q.println ("DAMAGE CHANCE: [" + dam1 + "] " + " [" + dam2 + "] " + " [" + dam3 + "]");

		if (dam1 == dam2 && dam1 == dam3)
		{
		    delay (1000);
		    q.println ("CONDITION: HEADSHOT!");
		    delay (500);
		    q.println ("DAMMAGE: 2");
		    bossHp -= 2;
		}
		else
		{
		    delay (1000);
		    q.println ("DAMMAGE: 1");
		    distanceX -= 2;
		    if (distanceX == 0)
		    {
			distanceX = 0;
		    }
		    bossHp--;
		}
	    }
	    else
	    {
		delay (1000);
		q.println ("CONDITION: MISS!");
		distanceX -= 2;
		if (distanceX == 0)
		{
		    distanceX = 0;
		}
	    }
	    p.println ("________________________________________________________________________________");
	}


	while (bossHp > 0);
	p.clear ();
	q.clear ();

	p.println ("GAME MASTER: YOU HAVE SHOT THE TERRORIST AND KILLED HIM.");
	p.println ();
	p.println ("(DO NOT MINIMIZE THIS AND THE SMALL, ROULETTE SCREEN)");
	p.println ("(JUST IGNORE THEM FOR NOW)");

	//continue button
	Continue ();

	c.println ("THE DAY WAS CUT SHORT BY A TERRORIST ATTACK.");
	c.println ();

	//continue button
	Continue ();

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}


	//Round 9 starts
	//instructions
	InstructionBasic ("REST ASSURED FOR TODAY WILL BE A QUIET DAY.\n\nUNFORTUNATELY, TOMORROW WILL BE THE COMPLETE OPPOSITE; YOU MUST PREPARE FOR THE WORST ON THE 10TH DAY OF YOUR SHIFT.\n\nTODAY CAN BE CONSIDERED THE \"CALM BEFORE THE STORM\" AS \"CREED\" DECLARED WAR     WITH US.\n\nTHIS DAY MAY BE YOUR LAST DAY AS AN INSPECTOR, DEPENDING ON HOW SERIOUS THINGS  WILL GET.\n\nBECAREFUL, INSPECTOR.");

	//round #
	c.println ("DAY 9");

	//continue button
	Continue ();

	//reset penalty checker
	penaltyCheck = 2;

	if (lofus < creed && lofus > 0)
	{
	    //Last time casually talking with Evalt Alimaride
	    c.println ("GAME MASTER: YOU ENTER YOUR INSPECTION OFFICE AND PREPARE FOR WORK.");
	    c.println ();
	    delay (1500);

	    c.println ("GAME MASTER: YOU ARE TAKEN BY SURPRISE WHEN YOU SAW EVALT ALREADY INSIDE YOUR");
	    c.println ("OFFICE.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: JESUS CHRIST. IS MY OFFICE A PLACE FOR EVERYONE TO MEET WHENEVER THEY WANT?");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: AND DIDN'T YOU SAY THAT I WON'T BE SEEING YOU AGAIN?");
	    c.println ();
	    delay (1500);
	    c.println ("EVALT ALIMARIDE: I APOLOGIZE IF I STARTLED YOU. HOWEVER, I'VE COME TO TELL YOU");
	    c.println ("THAT IT MIGHT BE THE LAST TIME FOR YOU TO WORK AS AN INSPECTOR.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: YES, I KNOW I'VE READ THE DOCUMENTS SENT TO ME FROM THE LOFUSAN GOVERNMENT.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: EVALT ALIMARIDE SHAKES THEIR HEAD.");
	    c.println ();
	    delay (1500);
	    c.println ("EVALT ALIMARIDE: NO, IT'S MUCH MORE SERIOUS THAN YOU'D THINK. YOU MIGHT HAVE TO");
	    c.println ("PERSONALLY KILL THE PEOPLE THAT YOU KNOW... AND YOU MIGHT LOSE YOUR LIFE TRYING");
	    c.println ("TO.");

	    //continue button
	    Continue ();

	    c.println ("EVALT ALIMARIDE: ...WHAT?");
	    c.println ();
	    delay (1500);
	    c.println ("EVALT ALIMARIDE: I ASSUME YOU KNOW THAT A WAR IS COMING AND THAT YOU ARE A VERY");
	    c.println ("SPECIAL PERSON WHO MAY TURN THE TIDE OF THE VICTOR DURING THE WAR.");
	    c.println ();
	    delay (1500);
	    c.println ("EVALT ALIMARIDE: SINCE YOU HAVE DONE US A GREAT FAVOUR, WE WOULD ALSO LIKE YOU");
	    c.println ("TO PARTICIPATE IN THE WAR ON OUR SIDE.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: I-");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: EVALT ALIMARIDE STOPS YOU.");
	    c.println ();
	    delay (1500);
	    c.println ("EVALT ALIMARIDE: YOU DO NOT NEED TO ANSWER RIGHT NOW. IN FACT, I'M NOT EVEN SURE");
	    c.println ("IF YOU WILL PREFER OUR SIDE THAN LOFUS.");
	    c.println ();
	    delay (1500);
	    c.println ("EVALT ALIMARIDE: THE CHOICE IS YOURS TO MAKE. IT WOULD BE BEST FOR YOU TO CHOOSE");
	    c.println ("QUICKLY AND WISELY BECAUSE THE \"END GAME\" OF THE BATTLE IS TO COME SOONER THAN");
	    c.println ("EXPECTED.");
	    c.println ();
	    delay (1500);
	    c.println ("EVALT ALIMARIDE: FAREWELL, INSPECTOR.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: EVALT ALIMARIDE LEAVES.");

	    //continue button
	    Continue ();
	}


	//Round 9
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();

	if (officer == 1)
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else if (user == (int) 8)
	    {
		c.println (respond ("DECLINE"));
	    }
	    else
	    {
		c.println ("YOU: WAIT HERE.");
		c.println ();
		delay (500);
		c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
		c.println ();
		delay (500);
		c.println ("GAME MASTER: OFFICER CAIN ENTERS AND ESCORTS THE PERSON OUT OF YOUR SIGHT.");
		c.println ();

		detain++;
	    }
	}
	else
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else
	    {
		c.println (respond ("DECLINE"));
	    }
	}
	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");

	c.clear ();

	//Following story victim
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);
	c.println ();
	c.println ("HEIGHT: 176cm");
	c.println ("WEIGHT: 57kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: JESSICA HEMISH");
	f.println ("DATE OF BIRTH: 1977. 12. 04");
	f.println ("SEX: F");
	f.println ("NATIONALITY (COUNTRY): UFRA");
	f.println ("EXPIRATION DATE: 2001. 04. 24");

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: JESSICA HEMISH");
	h.println ("NATIONALITY (CITY): EFILIA");
	h.println ("NATION SYMBOL: DOG");
	h.println ("PURPOSE: IMMIGRATION");
	h.println ("DURATION: FOREVER");
	h.println ("PRINTED TIME: 11:25 AM");

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: JESSICA HEMISH");
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: IMMIGRATION");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: FOREVER");
	delay (1000);
	c.println ();


	if (officer == 1)
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println ("YOU: WELCOME TO LOFUS.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: PLEASE, HELP ME.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: THERE IS A MAN NAMED \"JOSHUA JONES\" WHO IS MY EX-BOYFRIEND.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: HE HAS BEEN VERY OBSESSED WITH ME LATELY AND EVEN FOUND OUT");
		c.println ("ABOUT MY IMMIGRATION TO LOFUS.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: I DON'T KNOW HOW HE DOES THIS BUT I'M NOT SURE IF I'LL BE SAFE");
		c.println ("IF HE COMES TO LOFUS WITH ME.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: PLEASE, WHEN HE COMES, REJECT HIM AND DO NOT LET HIM PASS.");
		delay (1000);
		c.println ();

		//continue button
		Continue ();

		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else if (user == (int) 8)
	    {
		c.println (respond ("DECLINE"));

		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
	    }
	    else
	    {
		c.println ("YOU: WAIT HERE.");
		c.println ();
		delay (500);
		c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
		c.println ();
		delay (500);
		c.println ("GAME MASTER: OFFICER CAIN ENTERS AND ESCORTS THE PERSON OUT OF YOUR SIGHT.");
		c.println ();

		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
		detain++;
	    }
	}
	else
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println ("YOU: WELCOME TO LOFUS.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: PLEASE, HELP ME.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: THERE IS A MAN NAMED \"JOSHUA JONES\" WHO IS MY EX-BOYFRIEND.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: HE HAS BEEN VERY OBSESSED WITH ME LATELY AND EVEN FOUND OUT");
		c.println ("ABOUT MY IMMIGRATION TO LOFUS.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: I DON'T KNOW HOW HE DOES THIS BUT I'M NOT SURE IF I'LL BE SAFE");
		c.println ("IF HE COMES TO LOFUS WITH ME.");
		delay (1000);
		c.println ();
		c.println ("JESSICA HEMISH: PLEASE, WHEN HE COMES, REJECT HIM AND DO NOT LET HIM PASS.");
		delay (1000);
		c.println ();

		//continue button
		Continue ();

		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else if (user == (int) 8)
	    {
		c.println (respond ("DECLINE"));

		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
	    }
	}
	f.clear ();
	h.clear ();

	//Round 9 continues
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();

	if (officer == 1)
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else if (user == (int) 8)
	    {
		c.println (respond ("DECLINE"));
	    }
	    else
	    {
		c.println ("YOU: WAIT HERE.");
		c.println ();
		delay (500);
		c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
		c.println ();
		delay (500);
		c.println ("GAME MASTER: OFFICER CAIN ENTERS AND ESCORTS THE PERSON OUT OF YOUR SIGHT.");
		c.println ();

		detain++;
	    }
	}
	else
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else
	    {
		c.println (respond ("DECLINE"));
	    }
	}
	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");

	c.clear ();


	//Following story follower
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);
	c.println ();
	c.println ("HEIGHT: 178cm");
	c.println ("WEIGHT: 65kg");
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: JOSHUA JONES");
	f.println ("DATE OF BIRTH: 1965. 02. 12");
	f.println ("SEX: M");
	f.println ("NATIONALITY (COUNTRY): UFRA");
	f.println ("EXPIRATION DATE: 2001. 04. 24");

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: JOSHUA JONES");
	h.println ("NATIONALITY (CITY): EFILIA");
	h.println ("NATION SYMBOL: DOG");
	h.println ("PURPOSE: IMMIGRATION");
	h.println ("DURATION: FOREVER");
	h.println ("PRINTED TIME: 11:30 AM");

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: JOSHUA JONES");
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: IMMIGRATION");
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: FOREVER");
	delay (1000);
	c.println ();

	if (officer == 1)
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println ("YOU: GLORY TO LOFUS.");
		delay (1000);
		c.println ();
		c.println ("JOSHUA JONES: HEHEHE! MY SWEET SUGAR LOVE PIE~ I'M COMING FOR YOU~");

		lofus++;
		success++;
		delay (2000);
		bank.deposit (5);
		salary += 5;
	    }
	    else if (user == (int) 8)
	    {
		c.println ("YOU: YOU ARE INELIGIBLE FOR LOFUS.");
		delay (1000);
		c.println ();
		c.println ("JOSHUA JONES: HUH? WHA? NONONO, YOU CAN'T DO THIS. I HAVE EVERYTHING I NEED!");
		delay (1000);
		c.println ();
		c.println ("YOU: I'M SORRY SIR, BUT YOU ARE INELIGIBLE FOR LOFUS.");
		delay (1000);
		c.println ();
		c.println ("JOSHUA JONES: ...");
		delay (1000);
		c.println ();
		c.println ("JOSHUA JONES: OHH~ I SEE, I SEE... SHE TOLD YOU SOMETHING. DIDN'T SHE?");
		delay (1000);
		c.println ();
		c.println ("YOU: I'M SORRY, WHO?");
		delay (1000);
		c.println ();
		c.println ("JOSHUA JONES: MY SWEET SUGAR LOVE PIE; JESSICA! I KNEW THIS WAS GOING TO");
		c.println ("HAPPEN.");
		delay (1000);
		c.println ();

		//continue button
		Continue ();

		c.println ("JOSHUA JONES: SHE PROBABLY TOLD YOU SOMETHING ABOUT ME BEING A PSYCHOPATH");
		c.println ("OR STALKER, BUT YOU GOT IT ALL WRONG MAN.");
		delay (1000);
		c.println ();
		c.println ("JOSHUA JONES: SHE ACTUALLY STOLE SOMETHING VERY VALUABLE FROM ME. I JUST WANT");
		c.println ("IT BACK. THAT'S ALL.");
		delay (1500);
		c.println ();
		c.println ("JOSHUA JONES: UHH! FINE. I'LL GIVE YOU $50 IF YOU LET ME PASS. HMM? HOW ABOUT");
		c.println ("THAT?");
		delay (1000);
		c.println ();
		c.println ("GAME MASTER: YOU PONDER FOR A MOMENT ABOUT WHO IS TELLING THE TRUTH; THE GIRL");
		c.println ("OR GUY. EITHER WAY, YOU WILL DISAPPOINT ONE OF THEM. AND MAY RESULT IN A");
		c.println ("DANGEROUS OUTCOME NO MATTER WHAT.");
		delay (1000);
		c.println ();
		c.println ("GAME MASTER: SINCE YOU DON'T WANT TO BE RESPONSIBLE OVER SOMETHING TERRIBLE,");
		c.println ("YOU EITHER DECIDE ON APPROVING THE MAN OR DETAINING HIM.");
		delay (1000);
		c.println ();

		c.println ("APPROVE (ENTER) OR DETAIN (SPACE)");
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 10 || user == (int) 32))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 10 || user == (int) 32));

		//Respond
		if (user == (int) 10)
		{
		    c.println ("YOU: GLORY TO LOFUS.");
		    delay (1000);
		    c.println ();
		    c.println ("JOSHUA JONES: THE THING SHE STOLE FROM ME... IS MY HEART!");
		    delay (1000);
		    c.println ();
		    c.println ("JOSHUA JONES: HEHEHE! MY SWEET SUGAR LOVE PIE~ I'M COMING FOR YOU~");
		    delay (1000);
		    c.println ();
		    c.println ("GAME MASTER: YOU TRY TO STOP HIM AS HE LEAVES WITHOUT PAYING YOU.");
		    delay (1000);
		    c.println ();
		    c.println ("GAME MASTER: YOU CAN STILL GO UP TO HIM AND RECEIVE YOUR PAYMENT, BUT IF YOU GET");
		    c.println ("CAUGHT, YOU WILL LOSE YOUR JOB INSTANTLY SINCE YOU ARE TAKING BRIBES.");
		    delay (1000);
		    c.println ();
		    c.println ("GAME MASTER: YOU REALIZE THAT THE MAN WASN'T JUST A STALKING PSYCHOPATH, BUT A");
		    c.println ("SCAMMER AS WELL. YOU DO NOT BELIEVE THAT THE WOMAN WILL BE ABLE TO LIVE A NICE");
		    c.println ("LIFE IN LOFUS... OR A SAFE ONE.");
		    delay (1000);
		    c.println ();

		    //continue button
		    Continue ();

		    lofus++;
		    success++;
		    delay (2000);
		    bank.deposit (5);
		    salary += 5;
		}
		else
		{
		    c.println ("YOU: WAIT HERE.");
		    c.println ();
		    delay (500);
		    c.println ("JOSHUA: WAIT, WHAT ARE YOU DOING? NO, MY LOVE! MY SWEET SUGAR LOVE PIE!");
		    c.println ();
		    delay (500);
		    c.println ("GAME MASTER: OFFICER CAIN ENTERS AND ESCORTS THE PERSON OUT OF YOUR SIGHT.");
		    c.println ();
		    delay (500);
		    c.println ("GAME MASTER: THAT'S A GOOD CHOICE. ANYONE WOULD KNOW THAT SOMEONE IS DANGEROUS");
		    c.println ("IF THEY STILL CALL THEIR EX-GIRLFRIEND BY THEIR NICKNAMES THEY USED WHEN THEY");
		    c.println ("WERE STILL IN A RELATIONSHIP. NO LESS A PERSON WHO CALLS THEM \"MY SWEET SUGAR");
		    c.println ("LOVE PIE.\" YUCK.");

		    //continue button
		    Continue ();

		    delay (2000);
		    if (penaltyCheck > 0)
		    {
			if (penaltyCheck == 1)
			{
			    c.println ("________________________________________________________________________________");
			    c.println ("PROTOCAL VIOLATION");
			    c.println ("LAST WARNING - NO PENALTY");
			    c.println ("________________________________________________________________________________");
			}
			else
			{
			    c.println ("________________________________________________________________________________");
			    c.println ("PROTOCAL VIOLATION");
			    c.println ("WARNING - NO PENALTY");
			    c.println ("________________________________________________________________________________");
			}
			penaltyCheck--;
		    }
		    else
		    {
			if (bank.withdraw (5) == 0)
			{
			    c.println ("________________________________________________________________________________");
			    c.println ("PROTOCAL VIOLATION");
			    c.println ("NO PENALTY - NO MONEY");
			    c.println ("________________________________________________________________________________");
			}
			else
			{
			    c.println ("________________________________________________________________________________");
			    c.println ("PROTOCAL VIOLATION");
			    c.println ("PENALTY ASSESSED - $5");
			    c.println ("________________________________________________________________________________");
			}
		    }
		    lofus--;
		    delay (3000);
		    detain++;
		}
	    }
	    else
	    {
		c.println ("YOU: WAIT HERE.");
		c.println ();
		delay (500);
		c.println ("NPC: WAIT, WHAT ARE YOU DOING? NO, MY LOVE! MY SWEET SUGAR LOVE PIE!");
		c.println ();
		delay (500);
		c.println ("GAME MASTER: OFFICER CAIN ENTERS AND ESCORTS THE PERSON OUT OF YOUR SIGHT.");
		c.println ();

		delay (2000);
		if (penaltyCheck > 0)
		{
		    if (penaltyCheck == 1)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("LAST WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("WARNING - NO PENALTY");
			c.println ("________________________________________________________________________________");
		    }
		    penaltyCheck--;
		}
		else
		{
		    if (bank.withdraw (5) == 0)
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("NO PENALTY - NO MONEY");
			c.println ("________________________________________________________________________________");
		    }
		    else
		    {
			c.println ("________________________________________________________________________________");
			c.println ("PROTOCAL VIOLATION");
			c.println ("PENALTY ASSESSED - $5");
			c.println ("________________________________________________________________________________");
		    }
		}
		lofus--;
		delay (3000);
		detain++;
	    }
	}
	f.clear ();
	h.clear ();


	//Round 9 continue
	c.clear ();
	delay (500);
	c.println ("YOU: NEXT!");
	delay (1000);

	Record = 0;
	nameUsed = "";
	do
	{
	    Record = (int) (Math.random () * (80));
	    nameUsed = rec [Record].getName ();
	}
	while (nameUsed.equals (""));

	c.println (rec [Record].toString ());
	c.println ();
	c.println ("YOU: PAPERS, PLEASE.");
	delay (1000);
	c.println ();

	//Passport
	f.println ("PASSPORT");
	f.println ("NAME: " + rec [Record].getName ());
	f.println ("DATE OF BIRTH: " + rec [Record].getDOB ());
	f.println ("SEX: " + rec [Record].getSex ());
	f.println ("NATIONALITY (COUNTRY): " + rec [Record].getNationCountry ());
	f.println ("EXPIRATION DATE: " + rec [Record].getExpire ());

	//Access permit
	h.println ("ACCESS PERMIT");
	h.println ("NAME: " + rec [Record].getName ());
	h.println ("NATIONALITY (CITY): " + rec [Record].getNationCity ());
	h.println ("NATION SYMBOL: " + rec [Record].getNationSymbol ());
	h.println ("PURPOSE: " + rec [Record].getPurpose ());
	h.println ("DURATION: " + rec [Record].getDuration ());
	h.println ("PRINTED TIME: " + rec [Record].getPrintedTime ());

	c.println ("YOU: WHAT IS YOUR NAME?");
	delay (500);
	c.println ("NPC: " + rec [Record].getName ());
	delay (1000);
	c.println ();
	c.println ("YOU: WHAT IS THE PURPOSE OF YOUR VISIT?");
	delay (500);
	c.println ("NPC: " + rec [Record].getPurpose ());
	delay (1000);
	c.println ();
	c.println ("YOU: FOR HOW LONG WILL YOU BE STAYING?");
	delay (500);
	c.println ("NPC: " + rec [Record].getDuration ());
	delay (1000);
	c.println ();

	if (officer == 1)
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE) OR DETAIN (SPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8 || user == (int) 32))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8 || user == (int) 32));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else if (user == (int) 8)
	    {
		c.println (respond ("DECLINE"));
	    }
	    else
	    {
		c.println ("YOU: WAIT HERE.");
		c.println ();
		delay (500);
		c.println ("NPC: WAIT, WHAT ARE YOU DOING?");
		c.println ();
		delay (500);
		c.println ("GAME MASTER: OFFICER CAIN ENTERS AND ESCORTS THE PERSON OUT OF YOUR SIGHT.");
		c.println ();

		detain++;
	    }
	}
	else
	{
	    c.println ("APPROVE (ENTER) OR DECLINE (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));

	    //Respond
	    if (user == (int) 10)
	    {
		c.println (respond ("APPROVE"));
	    }
	    else
	    {
		c.println (respond ("DECLINE"));
	    }
	}
	f.clear ();
	h.clear ();

	//Did you get it right?
	conditionChecker = rec [Record].getCondition ();

	if (user == (int) 10 && conditionChecker == 0 || user == (int) 8 && conditionChecker == 1 || user == (int) 32 && conditionChecker == 1)
	{
	    lofus++;
	    success++;
	    delay (2000);
	    bank.deposit (5);
	    salary += 5;
	}
	else
	{
	    delay (2000);
	    if (penaltyCheck > 0)
	    {
		if (penaltyCheck == 1)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("LAST WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("WARNING - NO PENALTY");
		    c.println ("________________________________________________________________________________");
		}
		penaltyCheck--;
	    }
	    else
	    {
		if (bank.withdraw (5) == 0)
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("NO PENALTY - NO MONEY");
		    c.println ("________________________________________________________________________________");
		}
		else
		{
		    c.println ("________________________________________________________________________________");
		    c.println ("PROTOCAL VIOLATION");
		    c.println ("PENALTY ASSESSED - $5");
		    c.println ("________________________________________________________________________________");
		}
	    }
	    lofus--;
	    delay (3000);
	}
	rec [Record].setName ("");
	c.clear ();


	alarm ();

	//Day 9 over
	c.println ("DAY 9 IS OVER");

	//continue button
	Continue ();

	//Round clear
	numRoundClear = roundClear (bank.getBalance (), salary, family);

	if (numRoundClear % 5 == 0)
	{
	    bank.setBalance (numRoundClear);
	    family = 0;
	}
	else if (numRoundClear % 5 == 1)
	{
	    bank.setBalance (numRoundClear - 1);
	    family = 1;
	}
	else
	{
	    bank.setBalance (numRoundClear - 2);
	    family = 2;
	}


	//Round 10 starts
	//round #
	c.println ("DAY 10");

	//continue button
	Continue ();

	delay (1000);
	c.println ("GAME MASTER: IT'S MORNING.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU WOKE AND BRUSHED YOURSELF UP.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU TOOK OUT A CLEAN SUIT FROM YOUR CLOSET AND WORE IT.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: SEEING YOUR REFLECTION FROM YOUR MIRROR, YOU SEE A TIRED INSPECTOR,");
	c.println ("STRUGGLING TO MAKE A LIVING WHILE TRYING TO DO THE BEST FOR THEIR FAMILY.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THEY LOOK STRESSED OUT, NERVOUS, AND OBLIVIOUS TO WHAT'S HAPPENING");
	c.println ("TO THEIR LIFE, TO THE WORLD.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THE INSPECTOR HAS ALWAYS WANTED TO DO THE BEST FOR THEIR FAMILY.");
	c.println ("THEY WANTED TO LIVE HAPPY.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: A CHANCE DID COME. A GREAT ONE AT THAT. AND WHAT WAS SUPPOSED TO BE");
	c.println ("A BLESSING, BECAME... SOMETHING TERRIBLE.");

	//continue button
	Continue ();

	c.println ("GAME MASTER: SOMETHING SHINY CATCHES YOUR EYE. IT'S YOUR PISTOL.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: SEEING YOUR PISTOL REMINDS YOU OF EVERYTHING YOU HAVE DONE AS AN");
	c.println ("INSPECTOR.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU HAVE DONE EVERYTHING AS AN INSPECTOR TO FOLLOW THE LAW OR DO");
	c.println ("GOOD DEEDS. HOWEVER, FOR SOME REASON, WHATEVER YOU CHOOSE, YOU ARE NOT SATISFIED");
	c.println ("WITH THE DECISIONS. PROBABLY BECAUSE OF THE RESULT; THE INEVITABLE OUTCOME OF");
	c.println ("YOUR LIFE.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU, AND BECAUSE OF YOU, A WAR WILL OCCUR.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THERE WILL BE CHAOS AND THERE WILL BE DEATH. NO ONE WILL BE SAFE IN");
	c.println ("LOFUS. NOT EVEN YOU OR YOUR FAMILY.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU SHAKE YOUR HEAD AND CLEAR YOUR MIND. YOU LOOK INTO THE MIRROR");
	c.println ("ONCE MORE AND TRY SMILING.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THE SMILE IS DEFINITELY DIFFERENT FROM WHEN YOU SMILED THE FIRST");
	c.println ("TIME YOU CAME HERE. YOU KNOW THAT FOR SURE. HOWEVER, IT WILL BE SUFFICIENT");
	c.println ("ENOUGH TO FOOL YOUR FAMILY.");

	//continue button
	Continue ();

	c.println ("GAME MASTER: YOU'RE AT THE KITCHEN TABLE HAVING BREAKFAST WITH YOUR FAMILY.");
	c.println ();
	delay (1000);
	c.println ("YOUNGER BROTHER: LOOK, LOOK!");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOUR YOUNGER BROTHER TUGS YOUR ARM AND GRABS YOUR ATTENTION.");
	c.println ();
	delay (1000);
	c.println ("YOUNGER BROTHER: I DREW YOU!");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: HE SHOWS YOU A... DRAWING - A LEVEL APPROPRIATE FOR A 5-YEAR-OLD - ");
	c.println ("AND YOU FEEL BITTERSWEET.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THE DRAWING HAD A STICKMAN, WHO IS ASSUMED TO BE YOU, HOLDING A GUN");
	c.println ("AND A SWORD, SHOOTING AT ALIENS THAT ARE INVADING EARTH. YOUR NAME IS BESIDE");
	c.println ("THE STICK FIGURE AND THE WORDS \"LOFUS HERO\" ARE WRITTEN ON THE TOP.");
	c.println ();
	delay (1000);
	c.println ("YOU: THAT'S REALLY COOL! THANKS SO MUCH!");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOUR YOUNGER BROTHER CONTINUES TO DRAW.");

	//continue button
	Continue ();

	c.println ("GAME MASTER: NOT ONLY YOUR YOUNGER BROTHER, BUT PROBABLY EVERY ONE OF YOUR");
	c.println ("FAMILY MEMBERS FEEL THE SAME ABOUT YOU; A HERO.");
	c.println ();
	delay (1000);
	c.println ("YOU: ...");
	c.println ();
	delay (1000);
	c.println ("YOU: OKAY, I'M OFF!");
	c.println ();
	delay (1000);
	c.println ("MOM: OH, ARE YOU LEAVING ALREADY?");
	c.println ();
	delay (1000);
	c.println ("YOU: YA, I'LL PROBABLY GET A BONUS FOR ARRIVING EARLY.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU LIED.");
	c.println ();
	delay (1000);
	c.println ("MOM: BECAREFUL, HONEY. THERE IS A LOT OF DANGEROUS THINGS HAPPENING NEAR THE");
	c.println ("BORDER.");
	c.println ();
	delay (1000);
	c.println ("YOU: YA, YA, I KNOW.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOUR MOTHER STOPS YOU.");
	c.println ();
	delay (1000);

	//continue button
	Continue ();

	c.println ("MOM: I'M SERIOUS.");
	c.println ();
	delay (1000);
	c.println ("MOM: WE ARE GREATFUL FOR WHAT YOU ARE DOING FOR YOUR FAMILY. OUR LIVES HAVE");
	c.println ("NEVER BEEN MORE FUN AND EASIER THAN BEFORE.");
	c.println ();
	delay (1000);
	c.println ("MOM: HOWEVER, AS A MOTHER, I CANNOT HELP BUT BE WORRIED ABOUT YOUR SAFETY AFTER");
	c.println ("LISTENING TO ALL OF THE TERROR NEWS EVERY SINGLE DAY NEAR YOUR WORKPLACE.");
	c.println ();
	delay (1000);
	c.println ("MOM: IF YOU FEEL UNSAFE OR IF YOU JUST DON'T WANT TO WORK THERE AT ALL. WHATEVER");
	c.println ("THE CASE IS, WE WILL ALL SUPPORT YOU. WE WOULD WANT OUR FAMILY TO BE SAFER THAN");
	c.println ("WEALTHY.");
	c.println ();
	delay (1000);
	c.println ("DAD: NO MATTER WHAT HAPPENS, YOUR FAMILY WILL ALWAYS BE ON YOUR SIDE.");
	c.println ();
	delay (1000);
	c.println ("YOUNGER BROTHER: DON'T WORRY, IF YOU QUIT YOUR JOB, I WILL FIND ANOTHER ONE FOR");
	c.println ("YOU! THE SALARY PROBABLY WON'T BE AS GOOD AS THIS ONE, BUT YOU WILL BE SAFER,");
	c.println ("AND THAT IS ALL THAT MATTERS.");
	c.println ();
	delay (1000);
	c.println ("YOUNGER SISTER: YA, WHAT HE SAID!");
	c.println ();
	delay (1000);

	//continue button
	Continue ();

	c.println ("GAME MASTER: YOU FEEL LIKE A HEAVY WEIGHT HAS BEEN LIFTED FROM YOUR BODY.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THIS IS THE POWER OF FAMILY. THEY WILL ALWAYS BE WITH YOU WHENEVER");
	c.println ("AND WHEREVER YOU ARE.");
	c.println ();
	delay (1000);
	c.println ("YOU: *laugh* THANKS!");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: AND YOU HEAD OFF TO WORK.");
	c.println ();
	delay (1000);

	//continue button
	Continue ();

	c.println ("GAME MASTER: YOU WERE WAITING FOR THE CROSSWALK LIGHT TO TURN GREEN, WHEN YOU");
	c.println ("BRIEFLY LOOKED UP.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU NEVER PAYED ATTENTION, SO YOU DIDN'T KNOW, BUT SEEING IT NOW,");
	c.println ("YOU REALIZE THAT THE WALL THAT SEPARATES LOFUS FROM NEIGHBOURING COUNTRIES IS");
	c.println ("PRETTY BIG.");
	c.println ();
	delay (1000);
	c.println ("*ding*");
	c.println ();
	delay (5000);
	c.println ("GAME MASTER: THE LIGHT CHANGES AND YOU STARTED CROSSING THE INTERSECTION WHEN");
	c.println ("A SUDDEN SIREN WAS HEARD.");

	delay (800);

	c.println ();
	delay (2000);
	c.println ("GAME MASTER: EVERYONE WAS SO CONFUSED, UNTIL THEY HEARD...");
	c.println ();
	delay (2000);
	c.println ("*BOOOOOM!!!!!*");

	//continue button
	Continue ();

	c.println ("GAME MASTER: THE SHOCKWAVE PUSHED YOU AND EVERYONE ELSE ON THE GROUND. EVEN THE");
	c.println ("VEHICLES WERE SHAKING.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: THERE WAS A BIG EXPLOSION NEAR THE BORDER OF YOUR WORKPLACE.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: CRIMSON RED FIRE WAS BLAZING FROM THE DIRECTION ALONG WITH MULTIPLE");
	c.println ("GUN FIRES AND MORE EXPLOSIONS.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: PEOPLE WERE SCREAMING, LEAVING THEIR VEHICLES AND SPRINTING AWAY");
	c.println ("TO GOD KNOWS WHERE.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU QUICKLY WITHDRAW YOUR PISTOL AND RUN TOWARDS THE BORDER.");

	//continue button
	Continue ();

	c.println ("GAME MASTER: PLEASE MINIMIZE ALL OF YOUR SCREENS EXCEPT FOR CONSOLE 1 (MAIN");
	c.println ("SCREEN), THE BATTLE SCREENS (INCLUDING THE ROULETTE SCREEN), AND THE MAPLE.");
	c.println ("LEAF, FLOWER, AND HEART SCREENS.");

	//continue button
	Continue ();

	p.clear ();

	//Almost war
	c.println ("GAME MASTER: WHEN YOU ARRIVED AT THE BORDER, YOU SAW YOUR OFFICE ON FIRE.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: ACTUALLY, THERE WASN'T A THING THAT DIDN'T CATCH ON FIRE. EXCEPT");
	c.println ("FOR THE WALL.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: YOU SAW FAMILIAR FACES AS WELL.");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: GENERAL AND HIS SOLDIERS WERE GUARDING THE WALL AND ATTACKING THE");
	c.println ("OUTSIDERS, WHILE EVALT AND THEIR SOLDIERS WERE ATTEMPTING TO DESTROY IT.");
	c.println ();
	delay (1000);
	c.println ("*BOOM!*");
	c.println ();
	delay (1000);
	c.println ("GAME MASTER: AN EXPLOSION OCCURRED AND YOU WERE THROWN AWAY FROM THE SHOCKWAVE.");
	c.println ();
	delay (1000);

	//continue button
	Continue ();

	if (officer == 1)
	{
	    c.println ("GAME MASTER: ALL OF A SUDDEN, YOU WERE PULLED BY AN UNKNOWN PERSON AND BROUGHT");
	    c.println ("BEHIND A CONCEALMENT.");
	    c.println ();
	    delay (1000);
	    c.println ("GAME MASTER: YOU REACH FOR YOUR GUN AND TRIED TO AIM AT THE STRANGER, BUT TO");
	    c.println ("YOUR SURPRISE, IT WAS OFFICER CAIN.");
	    c.println ();
	    delay (1000);
	    c.println ("YOU: OFFICER CAIN! W-WHAT'S GOING ON?");
	    c.println ();
	    delay (1000);
	    c.println ("OFFICER CAIN: IT'S THEM, THE TERRORIST. WE HAVE TO DEFEND THE BORDER AT ALL");
	    c.println ("COSTS BEFORE SUPPORT COMES! CMON!");
	    c.println ();
	    delay (1000);
	    c.println ("GAME MASTER: HE TRIED TO LEAVE, BUT YOU STOPPED HIM");
	    c.println ();
	    delay (1000);
	    c.println ("OFFICER CAIN: WHY? WHAT'S WRONG?");
	    c.println ();
	    delay (1000);
	    c.println ("YOU: ARE YOU GOING TO HELP DEFEND LOFUS?");
	    c.println ();
	    delay (1000);

	    //continue button
	    Continue ();

	    c.println ("OFFICER: HUH?! W-WELL, YA. OF COURSE!");
	    c.println ();
	    delay (1000);
	    c.println ("YOU: WHY?!");
	    c.println ();
	    delay (1000);
	    c.println ("OFFICER: 'CAUSE IT'S MY JOB! THERE'S NO TIME FOR CHITCHAT!");
	    c.println ();
	    delay (1000);
	    c.println ("YOU: WHAT IF WE ARE WRONG?! WHAT IF CREED IS TRYING TO DO SOMETHING RIGHT? TO");
	    c.println ("HELP REBUILD LOFUS INTO A BETTER PLACE?");
	    c.println ();
	    delay (1000);
	    c.println ("OFFICER: ...I... I DON'T KNOW WHAT YOU'RE ON ABOUT. SO WHAT? YOU'RE GOING TO");
	    c.println ("HELP THEM?!");
	}
	else
	{
	    c.println ("GAME MASTER: YOU QUICKLY HIDE BEHIND A CAR TO COVER YOURSELF.");
	    c.println ();
	    delay (1000);
	    c.println ("GAME MASTER: IT WILL BE A MATTER OF TIME BEFORE THE WALL IS BREACHED.");
	    c.println ("HOWEVER, THE LOFUSAN ARMY WILL SOON BE HERE TO SUPPORT GENERAL.");
	    c.println ();
	    delay (1000);
	    c.println ("GAME MASTER: IF CREED SUCCESSFULLY DESTROYS THE BORDER BEFORE BACKUP");
	    c.println ("ARRIVES, LOFUS WILL FALL. IF THEY CAN'T, THEN LOFUS WILL WIN.");
	}

	//continue button
	Continue ();

	//DECISION TIME
	c.println ("GAME MASTER: THIS IS YOUR MOMENT. YOU'RE INVOLVEMENT IN THE WAR WILL BRING AN");
	c.println ("ADVANTAGE TO YOUR SIDE. SO, YOU MUST CHOOSE CAREFULLY.");
	do
	{
	    c.println ();
	    c.println ("GAME MASTER: WHICH SIDE WILL YOU CHOOSE?");
	    c.println ();
	    c.println ("LOFUS ('L' KEY) OR CREED ('C' KEY)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 67 || user == (int) 99 || user == (int) 76 || user == (int) 108))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 67 || user == (int) 99 || user == (int) 76 || user == (int) 108));

	    if (user == (int) 76 || user == (int) 108)
	    {
		creed = -1;
		lofus = 1;
	    }
	    else
	    {
		creed = 1;
		lofus = -1;
	    }

	    c.println ("GAME MASTER: ARE YOU SURE?");
	    c.println ();
	    c.println ("YES (ENTER) OR NO (BACKSPACE)");
	    user = c.getChar ();
	    do
	    {
		if (!(user == (int) 10 || user == (int) 8))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 10 || user == (int) 8));
	}
	while (!(user == (int) 10));

	//continue button
	Continue ();

	if (officer == 1 && creed == 1)
	{
	    c.println ("YOU: YES. YES, I WILL HELP THEM.");
	    c.println ();
	    delay (1000);
	    c.println ("GAME MASTER: SEEING YOUR DETERMINED FACE AND UNUSUAL ANSWER, OFFICER CAIN");
	    c.println ("WAS A LITTLE TAKEN ABACK.");
	    c.println ();
	    delay (1000);
	    c.println ("GAME MASTER: HE PONDERED REALLY HARD FOR A MOMENT, UNTIL HE CAME TO A");
	    c.println ("CONCLUSION.");
	    c.println ();
	    delay (1000);
	    c.println ("OFFICER CAIN: ...OKAY. I TOLD YOU THAT I WOULD STAND BESIDE YOU NO MATTER");
	    c.println ("WHAT. SO, I WILL KEEP MY WORD AND FOLLOW YOU... I JUST HOPE YOU DON'T REGRET");
	    c.println ("YOUR DECISION.");
	    c.println ();
	    delay (1000);
	    c.println ("OFFICER CAIN: ALRIGHT THEN, LET'S GO!");
	    c.println ();
	    delay (1000);
	}
	else if (officer == 1 && lofus == 1)
	{
	    c.println ("YOU: N-NO, NO... NEVERMIND.");
	    c.println ();
	    delay (1000);
	    c.println ("OFFICER CAIN: ALRIGHT THEN, LET'S GO!");
	    c.println ();
	    delay (1000);
	}
	else if (creed == 1)
	{
	    c.println ("GAME MASTER: NOW, YOUR ENEMY IS LOFUS.");
	    c.println ();
	    delay (1000);
	}
	else if (lofus == 1)
	{
	    c.println ("GAME MASTER: NOW, YOUR ENEMY IS CREED.");
	    c.println ();
	    delay (1000);
	}

	//continue button
	Continue ();

	//ROUND START
	r = new Console (5, 80);
	r.setColor (Color.red);
	r.setCursor (4, 1);
	r.print ("ROUND 1");
	r.fillRect (0, 0, 50, 50);

	r.setCursor (4, 15);
	r.print ("ROUND 2");
	r.fillRect (112, 0, 50, 50);

	r.setCursor (4, 29);
	r.print ("ROUND 3");
	r.fillRect (223, 0, 50, 50);

	r.setCursor (4, 43);
	r.print ("ROUND 4");
	r.fillRect (334, 0, 50, 50);

	r.setCursor (4, 57);
	r.print ("ROUND 5");
	r.fillRect (445, 0, 50, 50);

	//YOU
	r.setColor (Color.blue);
	r.fillOval (0, 0, 50, 50);

	//WALL
	r.setColor (Color.gray);
	r.setCursor (4, 71);
	r.print ("WALL");
	r.fillRect (560, 0, 30, 50);


	if (creed == 1)
	{
	    c.println ("GAME MASTER: YOU SEE AN ARMED LOFUS OFFICER. WHEN THEY WERE ABOUT TO ASK FOR");
	    c.println ("BACKUP, YOU IMMEDIATELY RAISE YOUR PISTOL. STARTLING THE OFFICER, THEY QUICKLY");
	    c.println ("CATCH ON AND JUMP INTO COVER. YOU DO THE SAME. YOU HEAR THE OFFICER THROUGH A");
	    c.println ("RADIO TRANSMISSION FROM A DEAD LOFUS SOLDIER CORPSE RIGHT BESIDE YOU.");
	    c.println ();
	    c.println ("RADIO: *bzz* *tss* ...INS- *tss* *tss* -PECTOR HAS BETRAYED US- *bzz* *tss*");
	    c.println ("KILL- *bzz* ON SIGHT. *tss*");
	    c.println ();
	    c.println ("GAME MASTER: YOU TAKE A DEEP BREATH AND CHARGE IN.");
	}
	else
	{
	    c.println ("GAME MASTER: YOU SEE AN ARMED CREED MEMBER. WHEN THEY WERE ABOUT TO ASK FOR");
	    c.println ("BACKUP, YOU IMMEDIATELY RAISE YOUR PISTOL. STARTLING THE MEMBER, THEY QUICKLY");
	    c.println ("CATCH ON AND JUMP INTO COVER. YOU DO THE SAME. YOU HEAR THE MEMBER THROUGH A");
	    c.println ("RADIO TRANSMISSION FROM A DEAD CREED MEMBER CORPSE RIGHT BESIDE YOU.");
	    c.println ();
	    c.println ("RADIO: *bzz* *tss* ...INS- *tss* *tss* -PECTOR HAS BETRAYED US- *bzz* *tss*");
	    c.println ("KILL- *bzz* ON SIGHT. *tss*");
	    c.println ();
	    c.println ("GAME MASTER: YOU TAKE A DEEP BREATH AND CHARGE IN.");
	}

	//continue button
	Continue ();

	c.println ("ATTACK: ROLL 20-SIDED DICE. IF DICE > AC, HIT.");
	c.println ("CHARGE: EXTRA DAMAGE.");
	c.println ("TAKE COVER: REDUCE DAMAGE.");
	c.println ("ESCAPE: SKIPPING FIGHT IF YOUR DICE > OPPONENT DICE.");
	c.println ();

	//round 1
	Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);

	while (Hp < 1)
	{
	    gameOverWar ();
	    Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);
	}

	//After round 1
	r.setColor (Color.red);
	r.fillRect (0, 0, 50, 50);

	r.setColor (Color.blue);
	r.fillOval (112, 0, 50, 50);

	p.clear ();

	if (creed == 1)
	{
	    c.println ("GAME MASTER: AFTER FINISHING YOUR FIRST BATTLE, YOU QUICKLY RUN TOWARDS THE");
	    c.println ("WALL, ONLY TO BE INTERRUPTED BY ANOTHER OFFICER.");
	}
	else
	{
	    c.println ("GAME MASTER: AFTER FINISHING YOUR FIRST BATTLE, YOU QUICKLY RUN TOWARDS THE");
	    c.println ("WALL, ONLY TO BE INTERRUPTED BY ANOTHER CREED MEMBER.");
	}

	//continue button
	Continue ();

	c.println ("ATTACK: ROLL 20-SIDED DICE. IF DICE > AC, HIT.");
	c.println ("CHARGE: EXTRA DAMAGE.");
	c.println ("TAKE COVER: REDUCE DAMAGE.");
	c.println ("ESCAPE: SKIPPING FIGHT IF YOUR DICE > OPPONENT DICE.");
	c.println ();

	//round 2
	Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);

	while (Hp < 1)
	{
	    gameOverWar ();
	    Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);
	}

	//After round 2
	r.setColor (Color.red);
	r.fillRect (112, 0, 50, 50);

	r.setColor (Color.blue);
	r.fillOval (223, 0, 50, 50);

	p.clear ();

	if (creed == 1)
	{
	    c.println ("GAME MASTER: YOU TRY TO TAKE A BREATHER BEFORE PROCEEDING TO GO TO THE");
	    c.println ("WALL, BUT A DIFFERENT ARMED OFFICER STARTED COMING TOWARDS YOU.");
	}
	else
	{
	    c.println ("GAME MASTER: YOU TRY TO TAKE A BREATHER BEFORE PROCEEDING TO GO TO THE");
	    c.println ("WALL, BUT A DIFFERENT ARMED CREED MEMBER STARTED COMING TOWARDS YOU.");
	}

	//continue button
	Continue ();

	c.println ("ATTACK: ROLL 20-SIDED DICE. IF DICE > AC, HIT.");
	c.println ("CHARGE: EXTRA DAMAGE.");
	c.println ("TAKE COVER: REDUCE DAMAGE.");
	c.println ("ESCAPE: SKIPPING FIGHT IF YOUR DICE > OPPONENT DICE.");
	c.println ();

	//round 3
	Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);

	while (Hp < 1)
	{
	    gameOverWar ();
	    Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);
	}

	//After round 3
	r.setColor (Color.red);
	r.fillRect (223, 0, 50, 50);

	r.setColor (Color.blue);
	r.fillOval (334, 0, 50, 50);

	p.clear ();

	if (creed == 1)
	{
	    c.println ("GAME MASTER: BEFORE YOU COULD EVEN THINK, OTHER OFFICERS BEGAN TO RUN");
	    c.println ("TOWARDS YOU. YOU QUICKLY SPRINT TO THE CLOSEST ROUTE TO THE WALL, BUT");
	    c.println ("ONE OFFICER STOOD BETWEEN YOU AND THE EXIT.");
	}
	else
	{
	    c.println ("GAME MASTER: BEFORE YOU COULD EVEN THINK, OTHER CREED MEMBERS BEGAN TO");
	    c.println ("RUN TOWARDS YOU. YOU QUICKLY SPRINT TO THE CLOSEST ROUTE TO THE WALL,");
	    c.println ("BUT ONE CREED MEMBER STOOD BETWEEN YOU AND THE EXIT.");
	}

	//continue button
	Continue ();

	c.println ("ATTACK: ROLL 20-SIDED DICE. IF DICE > AC, HIT.");
	c.println ("CHARGE: EXTRA DAMAGE.");
	c.println ("TAKE COVER: REDUCE DAMAGE.");
	c.println ("ESCAPE: SKIPPING FIGHT IF YOUR DICE > OPPONENT DICE.");
	c.println ();

	//round 4
	Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);

	while (Hp < 1)
	{
	    gameOverWar ();
	    Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);
	}

	//After round 3
	r.setColor (Color.red);
	r.fillRect (334, 0, 50, 50);

	r.setColor (Color.blue);
	r.fillOval (445, 0, 50, 50);

	p.clear ();

	if (creed == 1 && officer != 1)
	{
	    c.println ("GAME MASTER: YOU BOLTED TOWARDS THE EXIT. YOU FELT EVERY SINGLE OFFICER");
	    c.println ("IN THE WARZONE, CHASING AFTER YOU. YOU QUICKLY GO AROUND A CORNER AND");
	    c.println ("HIDE YOURSELF.");
	    c.println ();
	    c.println ("GAME MASTER: WHEN THEY WERE ALL GONE, YOU TURNED AROUND, JUST TO SEE");
	    c.println ("THE OFFICER THAT DESPISES YOU; OFFICER CAIN.");
	    c.println ();
	    c.println ("OFFICER CAIN: WELL, WELL, WELL. LOOK WHAT THE CAT DRAGGED IN. A TRAITOR");
	    c.println ("WHO IS FLEEING FROM THE ONES WHO USED TO PROTECT AND SECURE YOU.");
	    c.println ();
	    c.println ("OFFICER CAIN: I USED TO DO THAT TOO. I EVEN HELPED YOU DISABLE A BOMB");
	    c.println ("AND SAVED YOU... I THOUGHT WE GOT CLOSER, BUT... MAYBE THAT WAS JUST ME.");
	    c.println ("WELL, I GUESS IT WAS MY FAULT FOR TRUSTING YOU.");
	    c.println ();
	    c.println ("OFFICER CAIN: I NEVER SHOULD HAVE TRUSTED YOU. I NEVER SHOULD HAVE TOLD");
	    c.println ("YOU ANYTHING ABOUT HER! ABOUT MY ELISA!");
	}
	else if (creed == 1 && officer == 1)
	{
	    c.println ("GAME MASTER: YOU BOLTED TOWARDS THE EXIT. YOU FELT EVERY SINGLE OFFICER");
	    c.println ("IN THE WARZONE, CHASING AFTER YOU. YOU QUICKLY GO AROUND A CORNER AND");
	    c.println ("HIDE YOURSELF.");
	    c.println ();
	    c.println ("GAME MASTER: WHEN THEY WERE ALL GONE, YOU TURNED AROUND, JUST TO SEE");
	    c.println ("ANOTHER OFFICER.");
	    c.println ();
	    c.println ("YOU: OH, C'MON!");
	}
	else
	{
	    c.println ("GAME MASTER: YOU BOLTED TOWARDS THE EXIT. YOU FELT EVERY SINGLE CREED");
	    c.println ("MEMBERS IN THE WARZONE, CHASING AFTER YOU. YOU QUICKLY GO AROUND A");
	    c.println ("CORNER AND HIDE YOURSELF.");
	    c.println ();
	    c.println ("GAME MASTER: WHEN THEY WERE ALL GONE, YOU TURNED AROUND, JUST TO SEE");
	    c.println ("THE CREED AGENT WHO YOU DECLINED DURING YOUR DAYS AS AN INSPECTOR.");
	    c.println ();
	    c.println ("SHADOW STARS: YOU!!!");
	    c.println ();
	    c.println ("YOU: ...CRAP.");
	}

	//continue button
	Continue ();

	c.println ("ATTACK: ROLL 20-SIDED DICE. IF DICE > AC, HIT.");
	c.println ("CHARGE: EXTRA DAMAGE.");
	c.println ("TAKE COVER: REDUCE DAMAGE.");
	c.println ("ESCAPE: SKIPPING FIGHT IF YOUR DICE > OPPONENT DICE.");
	c.println ();

	//round 5
	if (creed == 1 && officer != 1)
	    Hp = BattleCain (creed, AC, Hp, dam1, dam2, dam3);
	if (creed == 1 && officer == 1)
	    Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);
	else
	    Hp = BattleShadow (creed, AC, Hp, dam1, dam2, dam3);

	while (Hp < 1)
	{
	    gameOverWar ();
	    if (creed == 1 && officer != 1)
		Hp = BattleCain (creed, AC, Hp, dam1, dam2, dam3);
	    if (creed == 1 && officer == 1)
		Hp = Battle (creed, AC, Hp, dam1, dam2, dam3);
	    else
		Hp = BattleShadow (creed, AC, Hp, dam1, dam2, dam3);
	}

	//continue button
	Continue ();

	p.clear ();

	r.clear ();

	//LAST DIALOGUE
	c.println ("GAME MASTER: IT'S BEEN A LONG JOURNEY. YOU STARTED FROM A NORMAL, HAPPY");
	c.println ("INSPECTOR OF LOFUS WHO JUST WANTED TO MAKE HIS FAMILY HAPPY. HOWEVER, AS THINGS");
	c.println ("BECOME \"TOO GOOD,\" THEY WILL EVENTUALLY BECOME \"TOO TRUE.\" YOU ARE NOW");
	c.println ("FIGHTING IN THIS WORLD TO DO WHAT YOU THINK IS RIGHT.");
	c.println ();
	c.println ("GAME MASTER: THE WALL THAT BLOCKS THE NEIGHBOURING COUNTRIES OF LOFUS IS");
	c.println ("STANDING RIGHT IN FRONT OF YOU.");
	c.println ();
	c.println ("GAME MASTER: IT'S NEARLY DESTROYED DUE TO THE CURRENT CHAOS, BUT WHY HASN'T IT");
	c.println ("FALLEN, YET?");
	c.println ();
	c.println ("GAME MASTER: YOU LOOK AT THE BOTTOM OF THE WALL AND SEE EVALT ALIMARIDE");
	c.println ("KNEELING ON THE GROUND WITH GENERAL RIGHT IN FRONT OF HER.");

	//continue button
	Continue ();

	c.println ("GAME MASTER: ...");
	c.println ();
	c.println ("GAME MASTER: ...HER?");
	c.println ();
	c.println ("GAME MASTER: EVALT ALIMARIDE WAS A WOMAN! AND NOT JUST ANY WOMAN! SHE IS");
	c.println ("THE MOTHER WHO WANTED TO CROSS THE BORDER IN THE VERY BEGINNING OF YOUR");
	c.println ("JOURNEY!");
	c.println ();
	c.println ("GAME MASTER: IT ALL MAKE SENSE NOW! THE REASON WHY SHE FORMED THE GROUP");
	c.println ("\"CREED\" AND WANTED TO REVOLUTIONIZE LOFUS WAS BECAUSE OF THE DEATH OF");
	c.println ("HER SON!");
	c.println ();
	c.println ("GAME MASTER: MMHMM!... EVALT ALIMARIDE IS AN ACRONYM OF MATILDA VALERIE!");
	c.println ();

	//continue button
	Continue ();

	c.println ("GENERAL: CAN'T BELIEVE YOU DECIDED TO CREATE A TERRORIST GROUP JUST BECAUSE");
	c.println ("YOUR SON DIED.");
	c.println ();
	c.println ("MATILDA VALERIE: HOW DARE YOU! MY SON WAS EVERYTHING TO ME! AND YOU! YOU!");
	c.println ("TOOK HIM AWAY FROM ME!!!");
	c.println ();
	c.println ("GENERAL: WHAT?! ME?! I KILLED HIM?! NO!... THE DISEASE DID... THE DISEASE THAT");
	c.println ("YOUR SON HAD... WAIT, WHAT WAS THE DISEASE?");
	c.println ();
	c.println ("GENERAL: WELL, I GUESS I INDIRECTLY KILLED HIM FOR PREVENTING YOU FROM CROSSING");
	c.println ("THE BORDER, BUT HEY! I WAS JUST DOING MY JOB AND FOLLOWING ORDERS!");
	c.println ();
	c.println ("GAME MASTER: GENERAL NOTICES YOUR PRESENCE.");

	//continue button
	Continue ();

	//LAST BATTLE
	if (creed == 1)
	{
	    c.println ("GAME MASTER: GENERAL KNOCKS MATILDA OUT AND MAKES HER UNCONSCIOUS.");
	    c.println ();
	    c.println ("GENERAL: *hmph* LOOK WHO IT IS. THE TRAITOR OF AN INSPECTOR... IT REALLY WAS A");
	    c.println ("MISTAKE TO RELY ON LOTTERY... *tsk* DAMN IT.");
	    c.println ();
	    c.println ("GENERAL: WHATEVER, WHAT'S DONE IS DONE... SO, YOU'VE BEEN BUSY, HUH?");
	    c.println ();
	    c.println ("GENERAL: ...");
	    c.println ();
	    c.println ("GENERAL: SO, I'VE GOT A QUESTION FOR YA...");
	    c.println ();
	    c.println ("GENERAL: DO YOU THINK EVEN THE WORST PERSON CAN CHANGE? THAT EVERYBODY CAN BE A");
	    c.println ("GOOD PERSON, IF THEY JUST TRY?");
	    c.println ();
	    c.println ("GENERAL: HEH HEH HEH HEH...");
	    c.println ();
	    c.println ("GAME MASTER: YOU TOOK A STEP TOWARDS HIM WITH YOUR GUN CLENCHED IN YOUR HAND.");
	    c.println ();
	    c.println ("GENERAL: ALRIGHT... WELL, HERE'S A BETTER QUESTION...");

	    //continue button
	    Continue ();

	    c.println ("GENERAL: DO YOU WANNA HAVE A BAD TIME?");
	    c.println ();
	    c.println ("GENERAL: 'CAUSE IF YOU TAKE ANOTHER STEP FORWARD...");
	    c.println ();
	    c.println ("GENERAL: YOU ARE REALLY NOT GOING TO LIKE WHAT HAPPENS NEXT.");
	    c.println ();
	    c.println ("GAME MASTER: YOU TOOK ANOTHER STEP TOWARDS HIM.");
	    c.println ();
	    c.println ("GENERAL: WELP");
	    c.println ();
	    c.println ("GENERAL: SORRY, INSPECTOR.");
	    c.println ();
	    c.println ("GENERAL: THIS IS WHY I NEVER MAKE PROMISES.");

	    //continue button
	    Continue ();

	    c.println ("GENERAL: IT'S A BEAUTIFUL DAY OUTSIDE... APART FROM THE BOMBINGS, OF COURSE.");
	    c.println ();
	    delay (1000);
	    c.println ("GENERAL: BIRDS ARE SINGING, FLOWERS ARE BLOOMING...");
	    c.println ();
	    delay (1000);
	    c.println ("GENERAL: ON DAYS LIKE THESE, PEOPLE LIKE YOU...");
	    c.println ();
	    delay (5000);
	    c.println ("GENERAL: SHOULD BE BURNING IN HELL.");
	    c.println ();

	    Hp = BattleGeneral (creed, AC, Hp, dam1, dam2, dam3, luckyToken, flower, officer);
	    while (Hp < 1)
	    {
		gameOverWar ();
		Hp = BattleGeneral (creed, AC, Hp, dam1, dam2, dam3, luckyToken, flower, officer);
	    }

	    c.clear ();

	    c.println ("GAME MASTER: GENERAL FALLS ONTO THE GROUND AND STRUGGLES TO GET BACK UP.");
	    c.println ();
	    c.println ("GENERAL: I... I WAS ONLY FOLLOWING ORDERS...");
	    c.println ();
	    c.println ("YOU: LOFUS BECAME CORRUPT AFTER THE WAR WITH OTHARIA. I WITNESSED THEM MYSELF.");
	    c.println ("THEY WILL ALL CHANGE ONCE CREED'S REVOLUTIONARY PLAN IS COMPLETED.");
	    c.println ();
	    c.println ("GENERAL: ...HEH... HAHAHAH!");
	    c.println ();
	    c.println ("GENERAL: REVOLTIONARY PLAN?... WELL I GUESS IT IS REVOLUTIONARY; YOU GUYS");
	    c.println ("GETTING RID OF THE CURRENT GOVERNMENT JUST TO BRING IN A NEW ONE.");
	    c.println ();
	    c.println ("GENERAL: BUT MARK MY WORDS BECAUSE IT WILL COME TRUE.");
	    c.println ();
	    c.println ("GENERAL: WHETHER IT TAKES THEM A DAY OR WEEK, EVEN A YEAR, THEY WILL EVENTUALLY");
	    c.println ("END UP LIKE US. THAT IS THE CYCLE OF HIERARCHY.");
	    c.println ();
	    c.println ("GAME MASTER: AFTER TAKING HIS FINAL BREATH, GENERAL COLLAPSES.");
	    c.println ();

	    //continue button
	    Continue ();

	    c.println ("GAME MASTER: A RUSTLING SOUND WAS HEARD BEHIND YOU. MATILDA HAS WOKEN UP.");
	    c.println ();
	    c.println ("MATILDA VALERIE: UHH... WHAT HAPPENED... D-DID YOU KILL HIM?");
	    c.println ();
	    c.println ("YOU: ...YES... LOFUS IS NO LONGER CORRUPT.");
	    c.println ();
	    c.println ("MATILDA VALERIE: OKAY... GOOD, GOOD.");
	    c.println ();
	    c.println ("YOU: ...OH! I NEED TO CHECK ON MY FAMILY!");
	    c.println ();
	    c.println ("MATILDA VALERIE: HUH?");
	    c.println ();
	    c.println ("YOU: I NEED TO MAKE SURE MY FAMILY IS SAFE!");
	    c.println ();
	    c.println ("MATILDA VALERIE: OH... WAIT A SECOND THEN...");
	    c.println ();
	    c.println ("GAME MASTER: YOU WERE ABOUT TO GO BACK TO YOUR FAMILY, BUT WERE INTERRUPTED");
	    c.println ("BY MATILDA'S CALLING.");
	    c.println ();
	    c.println ("*BANG!*");
	    c.println ();

	    //continue button
	    Continue ();

	    c.println ("GAME MASTER: YOU WERE STARTLED BY THE GUN SHOT. YOU CHECKED TO SEE WHERE THE");
	    c.println ("SHOT CAME FROM, UNTIL YOU SAW MATILDA POINTING A GUN AT YOU WITH SMOKE COMING");
	    c.println ("OUT OF IT.");
	    c.println ();
	    c.println ("GAME MASTER: YOU SLOWLY START TO FEEL PAIN IN YOUR CHEST AREA. YOU CAREFULLY");
	    c.println ("LOOK DOWN AND SEE A HOLE RIGHT THROUGH YOUR HEART.");
	    c.println ();
	    c.println ("GAME MASTER: DUE TO YOUR SHOCK, YOUR LEGS GIVE UP ON YOU AND MAKE YOU COLLAPSE");
	    c.println ("ONTO THE GROUND.");

	    //continue button
	    Continue ();

	    c.println ("YOU: W-WHY?");
	    c.println ();
	    c.println ("MATILDA VALERIE: IT IS TRULY UNFORTUNATE FOR THIS TO HAPPEN SO QUICKLY.");
	    c.println ();
	    c.println ("MATILDA VALERIE: YOU HAVE DONE US A GREAT SERVICE IN WINNING THIS WAR. HOWEVER,");
	    c.println ("DUE TO YOUR INVOLVMENT WITH LOFUS AS AN INSPECTOR, WE FEEL DISCOURAGED TO LET");
	    c.println ("YOU LIVE.");
	    c.println ();
	    c.println ("MATILDA VALERIE: DO NOT WORRY. EVERYONE, INCLUDING YOUR FAMILY, WILL KNOW ABOUT");
	    c.println ("YOUR HEROIC DUTIES...");
	    c.println ();
	    c.println ("MATILDA VALERIE: ...AND THAT YOU DIED FIGHTING. WELL, IF THEY ARE ALIVE, THAT IS.");
	    c.println ();
	    c.println ("YOU: !!!");
	    c.println ();
	    c.println ("MATILDA VALERIE: GLORY TO CREED.");
	    c.println ();
	    delay (18000);
	    c.println ("*BANG!*");
	}
	else
	{
	    c.println ("GENERAL: WELL, WELL, WELL, LOOK WHO IT IS. GOOD MORNING, INSPECTOR... OR IS");
	    c.println ("IT AFTERNOON?... OH WELL, ANYWAYS, I HAVE SUCCESSFULLY COMPREHENDED THIS");
	    c.println ("WOMAN'S INTENTIONS AND HAVE STOPPED HER CRUCIAL PLANS. PRETTY HEROIC DON'T");
	    c.println ("YOU THINK?");
	    c.println ();
	    c.println ("GENERAL: BY THE WAY, THIS WOMAN IS THE SAME PERSON AS THE ONE WE... I DECLINED");
	    c.println ("FROM THE BORDER A LONG TIME AGO. IN CASE YOU DIDN'T KNOW.");
	    c.println ();
	    c.println ("GENERAL: UMM... SUPPORT WILL ARRIVE SOON, SO WHILE I WATCH HER, YOU SH-");
	    c.println ();
	    c.println ("GAME MASTER: WHILE GENERAL WAS BUSY TALKING TO YOU, MATILDA AMBUSHED HIM AND");
	    c.println ("KNOCKED HIM OUT.");
	    c.println ();
	    c.println ("GAME MASTER: BEFORE GOING FOR THE KILL, YOU TAKE YOUR GUN AND SHOOT HER, WHICH");
	    c.println ("SKIMS HER RIGHT ARM AS SHE TRIED TO DODGE THE BULLET.");
	    c.println ();
	    c.println ("MATILDA VALERIE: ...SO, YOU ARE THE INSPECTOR... HUH? THEN THAT MEANS YOU ARE MY");
	    c.println ("ENEMY AS WELL!");

	    //continue button
	    Continue ();

	    c.println ("MATILDA VALERIE: I LOST EVERYTHING THAT DAY...");
	    c.println ();
	    delay (1000);
	    c.println ("MATILDA VALERIE: MY HEART, MY SOUL, MY SON... LOFUS WAS ONCE A GREAT PLACE. A");
	    c.println ("LOVELY PLACE WHERE EVERYONE WOULD BE HAPPY... THAT WAS BEFORE MY SON DIED.");
	    c.println ();
	    delay (1000);
	    c.println ("MATILDA VALERIE: NOW, IT'S JUST A POWER HUNGRY COUNTRY FILLED WITH CRAZY PEOPLE!");
	    c.println ();
	    delay (1000);
	    c.println ("MATILDA VALERIE: I WILL FIX THIS WORLD! FIX IT NICE AND CLEAN!!!");
	    c.println ();

	    Hp = BattleMatilda (creed, AC, Hp, dam1, dam2, dam3, luckyToken, flower, officer);
	    while (Hp < 1)
	    {
		gameOverWar ();
		Hp = BattleMatilda (creed, AC, Hp, dam1, dam2, dam3, luckyToken, flower, officer);
	    }

	    c.clear ();

	    c.println ("GAME MASTER: MATILDA FALLS ONTO THE GROUND AND STRUGGLES TO GET BACK UP.");
	    c.println ();
	    c.println ("MATILDA VALERIE: I... I JUST WANTED TO MAKE LOFUS BETTER AGAIN...");
	    c.println ();
	    c.println ("YOU: ALTHOUGH LOFUS HAS SOME ISSUES, TERRORIZING US AND KILLING INNOCENTS");
	    c.println ("ARE WORSE.");
	    c.println ();
	    c.println ("MATILDA VALERIE: ...HEH... HAHAHAH!");
	    c.println ();
	    c.println ("MATILDA VALERIE: TERRORIZING? KILLING INNOCENTS? YOU GUYS DID MORE THAN THAT.");
	    c.println ();
	    c.println ("MATILDA VALERIE: IT WAS A MISTAKE FOR YOU TO NOT CHOOSE US AS YOUR ALLIES.");
	    c.println ();
	    c.println ("GAME MASTER: AFTER TAKING HER FINAL BREATH, MATILDA COLLAPSES.");
	    c.println ();

	    //continue button
	    Continue ();

	    c.println ("GAME MASTER: A RUSTLING SOUND WAS HEARD BEHIND YOU. GENERAL HAS WOKEN UP.");
	    c.println ();
	    c.println ("GENERAL: UHH... WHAT HAPPENED... D-DID YOU KILL HER?");
	    c.println ();
	    c.println ("YOU: ...YES... THERE IS CREED NO LONGER.");
	    c.println ();
	    c.println ("GENERAL: OKAY... GOOD, GOOD.");
	    c.println ();
	    c.println ("YOU: ...OH! I NEED TO CHECK ON MY FAMILY!");
	    c.println ();
	    c.println ("GENERAL: HUH?");
	    c.println ();
	    c.println ("YOU: I NEED TO MAKE SURE MY FAMILY IS SAFE!");
	    c.println ();
	    c.println ("GENERAL: OH... WAIT A SECOND THEN...");
	    c.println ();
	    c.println ("GAME MASTER: YOU WERE ABOUT TO GO BACK TO YOUR FAMILY, BUT WERE INTERRUPTED");
	    c.println ("BY GENERAL'S CALLING.");
	    c.println ();
	    c.println ("*BANG!*");
	    c.println ();

	    //continue button
	    Continue ();

	    c.println ("GAME MASTER: YOU WERE STARTLED BY THE GUN SHOT. YOU CHECKED TO SEE WHERE THE");
	    c.println ("SHOT CAME FROM, UNTIL YOU SAW GENERAL POINTING A GUN AT YOU WITH SMOKE COMING");
	    c.println ("OUT OF IT.");
	    c.println ();
	    c.println ("GAME MASTER: YOU SLOWLY START TO FEEL PAIN IN YOUR CHEST AREA. YOU CAREFULLY");
	    c.println ("LOOK DOWN AND SEE A HOLE RIGHT THROUGH YOUR HEART.");
	    c.println ();
	    c.println ("GAME MASTER: DUE TO YOUR SHOCK, YOUR LEGS GIVE UP ON YOU AND MAKE YOU COLLAPSE");
	    c.println ("ONTO THE GROUND.");

	    //continue button
	    Continue ();

	    c.println ("YOU: W-WHY?");
	    c.println ();
	    c.println ("GENERAL: IT IS TRULY UNFORTUNATE FOR THIS TO HAPPEN SO QUICKLY.");
	    c.println ();
	    c.println ("GENERAL: YOU HAVE DONE US A GREAT SERVICE IN WINNING THIS WAR. HOWEVER,");
	    c.println ("DUE TO YOUR SUSPICIOUS INVOLVMENT WITH CREED, WE FEEL DISCOURAGED TO LET");
	    c.println ("YOU LIVE.");
	    c.println ();
	    c.println ("GENERAL: DO NOT WORRY. EVERYONE, INCLUDING YOUR FAMILY, WILL KNOW ABOUT");
	    c.println ("YOUR HEROIC DUTIES...");
	    c.println ();
	    c.println ("GENERAL: ...AND THAT YOU DIED FIGHTING. WELL, IF THEY ARE ALIVE, THAT IS.");
	    c.println ();
	    c.println ("YOU: !!!");
	    c.println ();
	    c.println ("GENERAL: GLORY TO LOFUS.");
	    c.println ();
	    delay (18000);
	    c.println ("*BANG!*");
	}


	//continue button
	Continue ();


	//ending
	ending ();



	//_____________________________________________________________________________________________________________________


    } // main method


    //_____________________________________________________________________________________________________________________
    //intro screen
    public static void IntroScreen ()
    {
	char user;
	//Program Header
	Font myFont = new Font ("Castellar", Font.PLAIN, 40);
	c.setFont (myFont);
	c.drawString ("BORDERLINE", 195, 100);

	Font myFont2 = new Font ("Tempus sans itc", Font.PLAIN, 25);
	c.setFont (myFont2);
	c.drawString ("BY ANDREW CHAI", 225, 170);
	c.drawString ("\"SUBMISSION DATE\"", 215, 210);

	//Description
	c.drawString ("DESCRIPTION", 0, 250);

	Font myFont3 = new Font ("Tempus sans itc", Font.PLAIN, 20);
	c.setFont (myFont3);
	c.drawString ("YOU, AS THE INSPECTOR, WILL DECIDE WHO GETS TO CROSS THE", 0, 280);
	c.drawString ("BORDER OR NOT.", 0, 310);
	c.drawString ("YOU WILL EARN $5 FOR EVERY PERSON YOU APPROVE OR DECLINE", 0, 340);
	c.drawString ("CORRECTLY AND LOSE $5 FOR EVERY PERSON YOU DO NOT.", 0, 370);

	c.setColor (Color.red);
	Font myFont4 = new Font ("Chiller", Font.PLAIN, 30);
	c.setFont (myFont4);
	c.drawString ("HOWEVER, WILL YOU BE ABLE TO KEEP YOURSELF FIXED AND", 0, 420);
	c.drawString ("LOYAL TO THE LAWS AND RULES OF YOUR COUNTRY, OR WILL", 0, 450);
	c.drawString ("YOU FALL INTO THE HANDS OF YOUR MORALS AND VIRTUES?", 0, 480);

	Continue ();
    }


    //logging in
    public static void LoggingIn ()
    {
	//Logging in Screen
	//Title
	c.setColor (Color.black);
	Font fnt = new Font ("Castellar", Font.PLAIN, 50);
	c.setFont (fnt);
	c.drawString ("BORDERLINE", 155, 70);

	c.setColor (Color.red);
	Font font = new Font ("Times New Roman", Font.PLAIN, 20);
	c.setFont (font);
	c.drawString ("INSPIRED BY: PAPERS, PLEASE", 185, 100);

	//Symbol of Lofus: Horse
	new Picture ("Horse.jpg", c, Pic, 190, 100);

	//extra
	Color mycolor = new Color (64, 224, 208);
	c.setColor (mycolor);
	c.fillRect (0, 0, 60, 60);
	c.fillRect (0, 440, 60, 60);
	c.fillRect (580, 0, 60, 60);
	c.fillRect (580, 440, 60, 60);
	c.fillRect (0, 0, 10, 500);
	c.fillRect (0, 0, 640, 10);
	c.fillRect (0, 490, 640, 10);
	c.fillRect (630, 0, 10, 500);

	c.setColor (Color.black);
	c.drawRect (0, 0, 60, 60);
	c.drawRect (0, 440, 60, 60);
	c.drawRect (580, 0, 60, 60);
	c.drawRect (580, 440, 60, 60);
	c.drawLine (10, 0, 10, 500);
	c.drawLine (0, 10, 640, 10);
	c.drawLine (0, 490, 640, 490);
	c.drawLine (630, 0, 630, 500);

	//TIP
	Font font1 = new Font ("Times New Roman", Font.PLAIN, 15);
	c.setFont (font1);
	c.drawString ("FUN FACT: THE HORSE IS THE SYMBOL OF LOFUS", 150, 480);

	//Loading
	c.setColor (Color.black);
	for (int x = 0 ; x <= 430 ; x++)
	{
	    c.drawLine (x, 490, x, 500);
	    delay (3);
	}


	delay (1500);
	for (int x = 430 ; x <= 639 ; x++)
	{
	    c.drawLine (x, 490, x, 500);
	    delay (4);
	}


	delay (1500);

	c.clear ();
    }


    //faster loggin in
    public static void LoggingInFast ()
    {
	//Loading screen
	//Title
	c.setColor (Color.black);
	Font fnt = new Font ("Castellar", Font.PLAIN, 50);
	c.setFont (fnt);
	c.drawString ("BORDERLINE", 155, 70);

	c.setColor (Color.red);
	Font font = new Font ("Times New Roman", Font.PLAIN, 20);
	c.setFont (font);
	c.drawString ("INSPIRED BY: PAPERS, PLEASE", 185, 100);

	//Symbol of Lofus: Horse
	new Picture ("HorseCopy.jpg", c, Pic, 190, 100);

	//extra
	Color mycolor = new Color (64, 224, 208);
	c.setColor (mycolor);
	c.fillRect (0, 0, 60, 60);
	c.fillRect (0, 440, 60, 60);
	c.fillRect (580, 0, 60, 60);
	c.fillRect (580, 440, 60, 60);
	c.fillRect (0, 0, 10, 500);
	c.fillRect (0, 0, 640, 10);
	c.fillRect (0, 490, 640, 10);
	c.fillRect (630, 0, 10, 500);

	c.setColor (Color.black);
	c.drawRect (0, 0, 60, 60);
	c.drawRect (0, 440, 60, 60);
	c.drawRect (580, 0, 60, 60);
	c.drawRect (580, 440, 60, 60);
	c.drawLine (10, 0, 10, 500);
	c.drawLine (0, 10, 640, 10);
	c.drawLine (0, 490, 640, 490);
	c.drawLine (630, 0, 630, 500);

	//TIP
	Font font1 = new Font ("Times New Roman", Font.PLAIN, 15);
	c.setFont (font1);
	c.drawString ("TIP: ORGANIZING YOUR WORKPLACE IS CRUCIAL", 150, 480);

	//Loading
	c.setColor (Color.black);
	for (int x = 0 ; x <= 639 ; x++)
	{
	    c.drawLine (x, 490, x, 500);
	    delay (6);
	}


	c.clear ();
    }


    //faster logging in
    public static void LoggingInFast2 ()
    {
	//Loading screen
	//Title
	c.setColor (Color.black);
	Font fnt = new Font ("Castellar", Font.PLAIN, 50);
	c.setFont (fnt);
	c.drawString ("BORDERLINE", 155, 70);

	c.setColor (Color.red);
	Font font = new Font ("Times New Roman", Font.PLAIN, 20);
	c.setFont (font);
	c.drawString ("INSPIRED BY: PAPERS, PLEASE", 185, 100);

	//Symbol of Lofus: Horse
	new Picture ("HorseCopy2.jpg", c, Pic, 190, 100);

	//extra
	Color mycolor = new Color (64, 224, 208);
	c.setColor (mycolor);
	c.fillRect (0, 0, 60, 60);
	c.fillRect (0, 440, 60, 60);
	c.fillRect (580, 0, 60, 60);
	c.fillRect (580, 440, 60, 60);
	c.fillRect (0, 0, 10, 500);
	c.fillRect (0, 0, 640, 10);
	c.fillRect (0, 490, 640, 10);
	c.fillRect (630, 0, 10, 500);

	c.setColor (Color.black);
	c.drawRect (0, 0, 60, 60);
	c.drawRect (0, 440, 60, 60);
	c.drawRect (580, 0, 60, 60);
	c.drawRect (580, 440, 60, 60);
	c.drawLine (10, 0, 10, 500);
	c.drawLine (0, 10, 640, 10);
	c.drawLine (0, 490, 640, 490);
	c.drawLine (630, 0, 630, 500);

	//TIP
	Font font1 = new Font ("Times New Roman", Font.PLAIN, 15);
	c.setFont (font1);
	c.drawString ("TIP: ORGANIZING YOUR WORKPLACE IS CRUCIAL", 150, 480);

	//Loading
	c.setColor (Color.black);
	for (int x = 0 ; x <= 639 ; x++)
	{
	    c.drawLine (x, 490, x, 500);
	    delay (6);
	}


	c.clear ();
    }


    //faster logging in
    public static void LoggingInFast3 ()
    {
	//Loading screen
	//Title
	c.setColor (Color.black);
	Font fnt = new Font ("Castellar", Font.PLAIN, 50);
	c.setFont (fnt);
	c.drawString ("BORDERLINE", 155, 70);

	c.setColor (Color.red);
	Font font = new Font ("Times New Roman", Font.PLAIN, 20);
	c.setFont (font);
	c.drawString ("INSPIRED BY: PAPERS, PLEASE", 185, 100);

	//Symbol of Lofus: Horse
	new Picture ("HorseCopy3.jpg", c, Pic, 190, 100);

	//extra
	Color mycolor = new Color (64, 224, 208);
	c.setColor (mycolor);
	c.fillRect (0, 0, 60, 60);
	c.fillRect (0, 440, 60, 60);
	c.fillRect (580, 0, 60, 60);
	c.fillRect (580, 440, 60, 60);
	c.fillRect (0, 0, 10, 500);
	c.fillRect (0, 0, 640, 10);
	c.fillRect (0, 490, 640, 10);
	c.fillRect (630, 0, 10, 500);

	c.setColor (Color.black);
	c.drawRect (0, 0, 60, 60);
	c.drawRect (0, 440, 60, 60);
	c.drawRect (580, 0, 60, 60);
	c.drawRect (580, 440, 60, 60);
	c.drawLine (10, 0, 10, 500);
	c.drawLine (0, 10, 640, 10);
	c.drawLine (0, 490, 640, 490);
	c.drawLine (630, 0, 630, 500);

	//TIP
	Font font1 = new Font ("Times New Roman", Font.PLAIN, 15);
	c.setFont (font1);
	c.drawString ("TIP: ORGANIZING YOUR WORKPLACE IS CRUCIAL", 150, 480);

	//Loading
	c.setColor (Color.black);
	for (int x = 0 ; x <= 639 ; x++)
	{
	    c.drawLine (x, 490, x, 500);
	    delay (6);
	}


	c.clear ();
    }


    //cheat sheet
    public static void cheatSheet ()
    {
	d.println ("THE WORLD OF BORDERLINE");
	d.println ("Cheat Sheet");
	d.println ();
	d.println ("COUNTRY: LOFUS");
	d.println ("SYMBOL: HORSE");
	d.println ("CITIES: APLEN, TREO, FEPRA");
	d.println ();
	d.println ("COUNTRY: OTHARIA");
	d.println ("SYMBOL: BIRD");
	d.println ("CITIES: ESCUS, UGLOS, HAT");
	d.println ();
	d.println ("COUNTRY: MASWAX");
	d.println ("SYMBOL: SNAKE");
	d.println ("CITIES: OBRAR, SKOYE, XET");
	d.println ();
	d.println ("COUNTRY: ESPUA");
	d.println ("SYMBOL: BEAR");
	d.println ("CITIES: WIKI, TAILS, TRENDLE");
	d.println ();
	d.println ("COUNTRY: UFRA");
	d.println ("SYMBOL: DOG");
	d.println ("CITIES: SPUE, EFILIA, JUNOS");
	d.println ();
	d.println ("COUNTRY: SPONIA");
	d.println ("SYMBOL: CAT");
	d.println ("CITIES: BOST, DATRAX, ABLYA");
	d.println ();
	d.println ("COUNTRY: THYNE");
	d.println ("SYMBOL: FISH");
	d.println ("CITIES: HECTUS, AFRUA, VUNE");
    }


    //letter
    public static void letter ()
    {
	char user = ' ';

	//letter before opening
	c.drawRect (100, 200, 400, 200);
	c.drawLine (100, 200, 300, 330);
	c.drawLine (300, 330, 500, 200);
	c.drawLine (100, 400, 270, 310);
	c.drawLine (330, 310, 500, 400);


	//open letter
	c.println ("PLEASE PRESS THE \"ENTER\" KEY TO OPEN THE LETTER");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}


	while (!(user == (int) 10));

	//animation for opening letter
	for (int i = 0 ; i < 260 ; i++)
	{
	    //left line
	    c.drawLine (100, 200, 300, 330 - i);

	    //right line
	    c.drawLine (300, 330 - i, 500, 200);

	    //letter
	    if (i >= 130)
	    {
		c.drawLine (100, 400, 500, 400);
		c.drawLine (100, 200, 100, 400);
		c.drawLine (500, 200, 500, 400);
		c.drawLine (100, 200, 300, 330);
		c.drawLine (300, 330, 500, 200);
		c.drawLine (100, 400, 270, 310);
		c.drawLine (330, 310, 500, 400);
	    }
	    else
	    {
		c.drawRect (100, 200, 400, 200);
		c.drawLine (100, 200, 300, 330);
		c.drawLine (300, 330, 500, 200);
		c.drawLine (100, 400, 270, 310);
		c.drawLine (330, 310, 500, 400);
	    }

	    if (i >= 95)
	    {
		Font letter = new Font ("Algerian", Font.PLAIN, 20);
		c.setFont (letter);
		c.drawString ("CONGRATULATIONS!", 210, 250);

		if (i >= 110)
		{
		    c.drawLine (150, 220, 450, 220);
		    c.drawLine (150, 220, 150, 233);
		    c.drawLine (450, 220, 450, 233);
		}
	    }

	    delay (5);
	    c.clear ();
	}


	//opened letter
	c.drawLine (100, 400, 500, 400);
	c.drawLine (100, 200, 100, 400);
	c.drawLine (500, 200, 500, 400);
	c.drawLine (100, 200, 300, 330);
	c.drawLine (300, 330, 500, 200);
	c.drawLine (100, 400, 270, 310);
	c.drawLine (330, 310, 500, 400);

	Font letter = new Font ("Algerian", Font.PLAIN, 20);
	c.setFont (letter);
	c.drawString ("CONGRATULATIONS!", 210, 250);

	c.drawLine (100, 200, 300, 70);
	c.drawLine (300, 70, 500, 200);
	c.drawLine (150, 220, 450, 220);
	c.drawLine (150, 220, 150, 233);
	c.drawLine (450, 220, 450, 233);
    }


    //newspaper
    public static void newspaper ()
    {
	//THE LOFUS TIMES
	Font News1 = new Font ("Algerian", Font.PLAIN, 45);
	e.setFont (News1);
	e.drawString ("THE LOFUS TIMES", 145, 50);
	e.drawRect (10, 10, 629, 70);
	e.drawLine (10, 60, 639, 60);
	for (int i = 0 ; i < 120 ; i += 5)
	{
	    e.drawLine (20 + i, 15, 20 + i, 55);
	    e.drawLine (515 + i, 15, 515 + i, 55);
	}


	Font News2 = new Font ("Times New Roman", Font.PLAIN, 15);
	e.setFont (News2);
	e.drawString ("SATURDAY, JANUARY 1, 2000", 210, 75);
	e.drawRect (10, 160, 390, 330);
	for (int i = 0 ; i < 330 ; i += 5)
	{
	    e.drawLine (15, 165 + i, 390, 165 + i);
	}


	//NEWS
	Font News3 = new Font ("Arial Black", Font.PLAIN, 25);
	e.setFont (News3);
	e.drawString ("LOFUS BORDER A SUCCESS!", 10, 120);
	Font News4 = new Font ("Bahnschrift", Font.PLAIN, 15);
	e.setFont (News4);
	e.drawString ("STRICT AND SAFE", 130, 150);

	//THE WEATHER AND POLITICS
	Font News5 = new Font ("Arial Black", Font.PLAIN, 18);
	e.setFont (News5);
	e.drawString ("THE WEATHER", 490, 110);
	e.drawRect (490, 130, 149, 170);
	for (int i = 0 ; i < 170 ; i += 5)
	{
	    e.drawLine (495, 135 + i, 635, 135 + i);
	}


	e.drawString ("POLITICS", 520, 325);
	e.drawRect (490, 345, 149, 150);
	for (int i = 0 ; i < 150 ; i += 5)
	{
	    e.drawLine (495, 350 + i, 635, 350 + i);
	}
    }


    //time
    public static void time ()
    {
	//clock
	j.println ("AM");
	j.setColor (Color.red);
	j.drawLine (137, 55, 165, 85);
	j.setColor (Color.black);
	j.fillRect (115, 55, 27, 5);
	j.fillRect (137, 15, 5, 40);
	j.drawOval (90, 1, 100, 100);
	//o'clock
	j.drawLine (139, 4, 139, 10);
	j.drawLine (139, 92, 139, 98);
	j.drawLine (95, 57, 101, 57);
	j.drawLine (178, 57, 184, 57);
	j.drawLine (160, 20, 166, 14);
	j.drawLine (173, 35, 180, 32);
	j.drawLine (173, 75, 179, 78);
	j.drawLine (157, 85, 162, 91);
	j.drawLine (117, 91, 123, 85);
	j.drawLine (103, 78, 109, 75);
	j.drawLine (101, 32, 109, 35);
	j.drawLine (115, 14, 122, 20);
    }


    //responding system
    public static String respond (String word)
    {
	int a = (int) (Math.random () * (3)) + 1;
	int b = (int) (Math.random () * (3)) + 1;
	int user;

	//different responds from approving or declining
	if (word.equals ("APPROVE"))
	{
	    user = 0;
	}
	else
	{
	    user = 1;
	}


	if (user == 0)
	{
	    switch (a)
	    {
		case 1:
		    {
			switch (b)
			{
			    case 1:
				{
				    return "\nYOU: GLORY TO LOFUS.\nNPC: THANK YOU";
				}
			    case 2:
				{
				    return "\nYOU: GLORY TO LOFUS.\nNPC: FINALLY!";
				}
			    case 3:
				{
				    return "\nYOU: GLORY TO LOFUS.\nNPC: ...";
				}
			}
		    }
		case 2:
		    {
			switch (b)
			{
			    case 1:
				{
				    return "\nYOU: CAUSE NO TROUBLE.\nNPC: THANK YOU";
				}
			    case 2:
				{
				    return "\nYOU: CAUSE NO TROUBLE.\nNPC: FINALLY!";
				}
			    case 3:
				{
				    return "\nYOU: CAUSE NO TROUBLE.\nNPC: ...";
				}
			}
		    }
		case 3:
		    {
			switch (b)
			{
			    case 1:
				{
				    return "\nYOU: LOFUS WELCOMES YOU.\nNPC: THANK YOU";
				}
			    case 2:
				{
				    return "\nYOU: LOFUS WELCOMES YOU.\nNPC: FINALLY!";
				}
			    case 3:
				{
				    return "\nYOU: LOFUS WELCOMES YOU.\nNPC: ...";
				}
			}
		    }
	    }
	}
	else
	{
	    switch (a)
	    {
		case 1:
		    {
			switch (b)
			{
			    case 1:
				{
				    return "\nYOU: YOU DO NOT HAVE THE REQUIREMENTS TO PASS.\nNPC: ...I UNDERSTAND";
				}
			    case 2:
				{
				    return "\nYOU: YOU DO NOT HAVE THE REQUIREMENTS TO PASS.\nNPC: THIS IS MADNESS!";
				}
			    case 3:
				{
				    return "\nYOU: YOU DO NOT HAVE THE REQUIREMENTS TO PASS.\nNPC: ...";
				}
			}
		    }
		case 2:
		    {
			switch (b)
			{
			    case 1:
				{
				    return "\nYOU: WE ARE UNFORTUANTELY UNABLE TO ADMIT YOU.\nNPC: ...I UNDERSTAND";
				}
			    case 2:
				{
				    return "\nYOU: WE ARE UNFORTUANTELY UNABLE TO ADMIT YOU.\nNPC: THIS IS MADNESS!";
				}
			    case 3:
				{
				    return "\nYOU: WE ARE UNFORTUANTELY UNABLE TO ADMIT YOU.\nNPC: ...";
				}
			}
		    }
		case 3:
		    {
			switch (b)
			{
			    case 1:
				{
				    return "\nYOU: YOU ARE INELIGIBLE FOR LOFUS.\nNPC: ...I UNDERSTAND";
				}
			    case 2:
				{
				    return "\nYOU: YOU ARE INELIGIBLE FOR LOFUS.\nNPC: THIS IS MADNESS!";
				}
			    case 3:
				{
				    return "\nYOU: YOU ARE INELIGIBLE FOR LOFUS.\nNPC: ...";
				}
			}
		    }
	    }
	}


	return "";
    }


    //round cleared
    public static int roundClear (int wall, int sal, int fam)
    {
	char user = ' ';

	//putting the proper amount of money inside the wallet
	Wallet bank = new Wallet (wall);

	//animation
	for (int i = 0 ; i < 3 ; i++)
	{
	    c.clear ();
	    c.println ("CALCULATING");
	    delay (500);
	    c.clear ();
	    c.println ("CALCULATING.");
	    delay (500);
	    c.clear ();
	    c.println ("CALCULATING..");
	    delay (500);
	    c.clear ();
	    c.println ("CALCULATING...");
	    delay (500);
	}


	c.clear ();
	c.println ("YOUR BANK ACCOUNT: $" + (bank.getBalance ()));
	c.println (bank.toString ());

	//will you pay or not
	if (fam == 2 && bank.withdraw (40) != 0)
	{
	    c.println ();
	    c.println ("PAY FOR FOOD? (-$15)");
	    c.println ("PAY FOR WATER? (-$15)");
	    c.println ("PAY FOR HEAT? (-$10)");
	    c.println ("TOTAL: -$40");

	    c.println ();
	    c.println ("PLEASE PRESS THE \"Y\" OR \"N\" KEY \"TO PAY\" OR \"TO NOT PAY\"");
	    user = c.getChar ();

	    do
	    {
		if (!(user == (int) 89 || user == (int) 121 || user == (int) 78 || user == (int) 110))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 89 || user == (int) 121 || user == (int) 78 || user == (int) 110));

	    if (user == (int) 89 || user == (int) 121)
	    {
		c.println ();
		c.println (bank.toString ());
		c.println ();
		c.println ("MOTHER: HEALTHY");
		c.println ("FATHER: HEALTHY");
		c.println ("SISTER: HEALTHY");
		c.println ("BROTHER: HEALTHY");
	    }
	    else
	    {
		bank.deposit (40);
		fam--;

		c.println ();
		c.println (bank.toString ());
		c.println ();
		c.println ("MOTHER: HEALTHY --> SICK");
		c.println ("FATHER: HEALTHY --> SICK");
		c.println ("SISTER: HEALTHY --> SICK");
		c.println ("BROTHER: HEALTHY --> SICK");
	    }
	}
	else if (fam < 2 && bank.withdraw (45) != 0)
	{
	    c.println ();
	    c.println ("PAY FOR FOOD? (-$15)");
	    c.println ("PAY FOR WATER? (-$15)");
	    c.println ("PAY FOR HEAT? (-$10)");
	    c.println ("PAY FOR MEDICINE? (-$5)");
	    c.println ("TOTAL: -$45");

	    c.println ();
	    c.println ("PLEASE PRESS THE \"Y\" OR \"N\" KEY \"TO PAY\" OR \"TO NOT PAY\"");
	    user = c.getChar ();

	    do
	    {
		if (!(user == (int) 89 || user == (int) 121 || user == (int) 78 || user == (int) 110))
		{
		    c.println ();
		    c.println ("<ERROR>");
		    user = c.getChar ();
		}
	    }
	    while (!(user == (int) 89 || user == (int) 121 || user == (int) 78 || user == (int) 110));

	    if (user == (int) 89 || user == (int) 121)
	    {
		fam++;
		c.println ();
		c.println (bank.toString ());
		c.println ();

		if (fam == 2)
		{
		    c.println ("MOTHER: SICK --> HEALTHY");
		    c.println ("FATHER: SICK --> HEALTHY");
		    c.println ("SISTER: SICK --> HEALTHY");
		    c.println ("BROTHER: SICK --> HEALTHY");
		}
		else
		{
		    c.println ("MOTHER: NEAR DEATH --> SICK");
		    c.println ("FATHER: NEAR DEATH --> SICK");
		    c.println ("SISTER: NEAR DEATH --> SICK");
		    c.println ("BROTHER: NEAR DEATH --> SICK");
		}
	    }
	    else
	    {
		bank.deposit (45);
		fam--;

		c.println ();
		c.println (bank.toString ());
		c.println ();

		if (fam == 0)
		{
		    c.println ("MOTHER: SICK --> NEAR DEATH");
		    c.println ("FATHER: SICK --> NEAR DEATH");
		    c.println ("SISTER: SICK --> NEAR DEATH");
		    c.println ("BROTHER: SICK --> NEAR DEATH");
		}
		else
		{
		    c.println ("MOTHER: NEAR DEATH --> DEATH");
		    c.println ("FATHER: NEAR DEATH --> DEATH");
		    c.println ("SISTER: NEAR DEATH --> DEATH");
		    c.println ("BROTHER: NEAR DEATH --> DEATH");
		    delay (5000);
		    gameOver ();
		}
	    }
	}
	else
	{
	    fam--;

	    c.println ("NOT ENOUGH MONEY");
	    c.println ();

	    if (fam == 1)
	    {
		c.println ("MOTHER: HEALTHY --> SICK");
		c.println ("FATHER: HEALTHY --> SICK");
		c.println ("SISTER: HEALTHY --> SICK");
		c.println ("BROTHER: HEALTHY --> SICK");
	    }
	    else if (fam == 0)
	    {
		c.println ("MOTHER: SICK --> NEAR DEATH");
		c.println ("FATHER: SICK --> NEAR DEATH");
		c.println ("SISTER: SICK --> NEAR DEATH");
		c.println ("BROTHER: SICK --> NEAR DEATH");
	    }
	    else
	    {
		c.println ("MOTHER: NEAR DEATH --> DEATH");
		c.println ("FATHER: NEAR DEATH --> DEATH");
		c.println ("SISTER: NEAR DEATH --> DEATH");
		c.println ("BROTHER: NEAR DEATH --> DEATH");
		delay (5000);
		gameOver ();
	    }
	}


	//continue button
	Continue ();

	//returning the amount of money + family condition to calculate them in the main method
	return bank.getBalance () + fam;
    }


    //gameover when family dies
    public static void gameOver ()
    {
	c.clear ();
	d.clear ();
	e.clear ();
	f.clear ();
	g.clear ();
	h.clear ();
	j.clear ();
	k.clear ();
	l.clear ();
	m.clear ();
	n.clear ();
	o.clear ();

	c.setCursor (25, 1);
	c.println ("EXIT TO PLAY AGAIN");
	c.setColor (Color.red);
	Font myfont = new Font ("Chiller", Font.PLAIN, 100);
	c.setFont (myfont);
	c.drawString ("GAME OVER", 140, 80);
	Font fontmy = new Font ("Chiller", Font.PLAIN, 30);
	c.setFont (fontmy);
	c.drawString ("YOU SEE YOUR FAMILY SHIVERING AND COUGHING UP BLOOD.", 0, 160);
	c.drawString ("YOUR HOUSE IS LIKE A REFRIGERATOR, AND YOU DON'T HAVE", 0, 190);
	c.drawString ("ENOUGH MONEY TO BUY ANY MEDICATIONS. AFTER A FEW", 0, 220);
	c.drawString ("MOMENTS, YOUR FAMILY BREATHE THEIR LAST BREATH AND", 0, 250);
	c.drawString ("FALLS INTO THE ETERNAL SLUMBER. AFTERWARDS, YOU", 0, 280);
	c.drawString ("DECIDED TO FOLLOW THEM.", 0, 310);
	c.drawString ("YOU HAVE FAILED TO KEEP YOUR FAMILY SAFE AND DIED.", 0, 370);
	c.drawString ("GLORY TO LOFUS.", 0, 430);
	delay (2147483647);
    }


    //gameover when you die
    public static void gameOverDeath ()
    {
	c.clear ();
	d.clear ();
	e.clear ();
	f.clear ();
	g.clear ();
	h.clear ();
	j.clear ();
	k.clear ();
	l.clear ();
	m.clear ();
	n.clear ();
	o.clear ();

	c.setCursor (25, 1);
	c.println ("EXIT TO PLAY AGAIN");
	c.setColor (Color.red);
	Font myfont = new Font ("Chiller", Font.PLAIN, 100);
	c.setFont (myfont);
	c.drawString ("GAME OVER", 140, 80);
	Font fontmy = new Font ("Chiller", Font.PLAIN, 30);
	c.setFont (fontmy);
	c.drawString ("THE LAST THING YOU HEAR IS AN EXPLOSION, BEFORE", 0, 160);
	c.drawString ("FEELING INTENSE PAIN ALL OVER YOUR BODY. YOU SEE A", 0, 190);
	c.drawString ("FLASHBACK OF YOUR FAMILY, HAPPILY AT PLAY. HOWEVER,", 0, 220);
	c.drawString ("RIGHT AFTER A MOMENT, THE SCENE SUDDENLY DARKENS AND", 0, 250);
	c.drawString ("CHANGES INTO A WARZONE, WHERE YOUR FAMILY IS", 0, 280);
	c.drawString ("SUFFERING ONCE MORE... BECAUSE OF YOUR DEATH.", 0, 310);
	c.drawString ("YOU FAILED TO DISABLE THE BOMB AND DIED.", 0, 370);
	c.drawString ("GLORY TO LOFUS.", 0, 430);
	delay (2147483647);
    }


    //gameover when you die during the war
    public static void gameOverWar ()
    {
	char user = ' ';

	c.clear ();

	c.setColor (Color.red);
	Font myfont = new Font ("Chiller", Font.PLAIN, 100);
	c.setFont (myfont);
	c.drawString ("YOU DIED", 150, 490);

	c.println ("PRESS ENTER TO CONTINUE FROM THE LAST SPOT");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 10));
	c.clear ();
    }


    //gameover when you get fired
    public static void gameOverFire ()
    {
	c.clear ();
	d.clear ();
	e.clear ();
	f.clear ();
	g.clear ();
	h.clear ();
	j.clear ();
	k.clear ();
	l.clear ();
	m.clear ();
	n.clear ();
	o.clear ();

	c.setCursor (25, 1);
	c.println ("EXIT TO PLAY AGAIN");
	c.setColor (Color.red);
	Font myfont = new Font ("Chiller", Font.PLAIN, 100);
	c.setFont (myfont);
	c.drawString ("GAME OVER", 140, 80);
	Font fontmy = new Font ("Chiller", Font.PLAIN, 30);
	c.setFont (fontmy);
	c.drawString ("YOU ARE UNDER ARREST FOR ASSOCIATING WITH SUSPICIOUS", 0, 160);
	c.drawString ("GROUPS. THE MINISTRY OF INFORMATION WILL PERFORM A", 0, 190);
	c.drawString ("FULL AUDIT OF YOUR RECENT ACTIVITIES.", 0, 220);
	c.drawString ("YOUR FAMILY WILL BE QUESTIONED FOR THEIR INVOLVEMENT.", 0, 250);
	c.drawString ("YOU HAVE FAILED TO KEEP YOUR JOB.", 0, 310);
	c.drawString ("GLORY TO LOFUS.", 0, 370);
	delay (2147483647);
    }


    //instruction letters
    public static String InstructionBasic (String words)
    {
	k.clear ();
	delay (1500);
	k.println ("LOFUS");
	k.println ("MINISTRY OF ADMISSION");
	k.println ("OFFICIAL BULLETIN");
	k.println ();
	k.println ("INSPECTOR,");
	k.println ();
	k.println (words);
	k.println ();
	k.println ("GLORY TO LOFUS.");
	return "";
    }


    //continue button method
    public static void Continue ()
    {
	char user = ' ';

	c.println ();
	c.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}


	while (!(user == (int) 10));
	c.clear ();
    }


    //sorting method
    public static void bubbleSort (RecordNames data[])
    {
	int Switch = 1;
	RecordNames Temp;

	while (Switch != 0)
	{
	    Switch = 0;
	    for (int j = 0 ; j < data.length - 1 ; j++)
	    {
		if (data [j].getName ().compareTo (data [j + 1].getName ()) > 0)
		{
		    Temp = data [j];
		    data [j] = data [j + 1];
		    data [j + 1] = Temp;
		    Switch = 1;
		}
	    }
	}
    }


    //beep sound
    public static void beep ()
    {
	java.awt.Toolkit.getDefaultToolkit ().beep ();
    }


    //delay method
    public static void delay (int millisecs)  // Delay Method
    {
	try
	{
	    Thread.currentThread ().sleep (millisecs);
	}


	catch (InterruptedException e)
	{
	}
    }


    //Alarm
    public static void alarm ()
    {
	for (int i = 0 ; i < 5 ; i++)
	{
	    delay (500);
	    beep ();
	}


	delay (2000);
    }


    //The Creed Symbol
    public static void creed ()
    {
	n.setColor (Color.blue);
	n.fillRect (95, 20, 90, 90);
	n.setColor (Color.red);
	n.fillRect (117, 42, 45, 45);
	n.setColor (Color.white);
	n.drawLine (95, 20, 117, 42);
	n.drawLine (95, 110, 117, 87);
	n.drawLine (185, 20, 162, 42);
	n.drawLine (185, 110, 162, 87);
    }


    //The Creed Symbol from government
    public static void governCreed ()
    {
	n.drawRect (95, 20, 90, 90);
	n.drawRect (117, 42, 45, 45);
	n.drawLine (95, 20, 117, 42);
	n.drawLine (95, 110, 117, 87);
	n.drawLine (185, 20, 162, 42);
	n.drawLine (185, 110, 162, 87);
    }


    //Mariusz's token
    public static void luckyToken ()
    {
	n.drawOval (90, 15, 100, 100);
	n.setColor (Color.red);
	n.fillMapleLeaf (90, 15, 100, 100);
    }


    //Watcher token
    public static void eyeToken ()
    {
	//upside down star
	Color yel = new Color (255, 223, 0);
	n.setColor (yel);
	n.drawLine (90, 15, 140, 40);
	n.drawLine (140, 40, 190, 15);
	n.drawLine (190, 15, 170, 60);
	n.drawLine (170, 60, 200, 100);
	n.drawLine (200, 100, 160, 90);
	n.drawLine (160, 90, 140, 115);
	n.drawLine (140, 115, 120, 90);
	n.drawLine (120, 90, 80, 100);
	n.drawLine (80, 100, 110, 60);
	n.drawLine (110, 60, 90, 15);

	//Eye
	n.fillOval (111, 40, 58, 58);
	n.setColor (Color.black);
	n.fillOval (125, 55, 30, 30);
	n.setColor (Color.white);
	n.fillOval (145, 55, 12, 12);
    }


    //Immigration token
    public static void immigrateToken ()
    {
	n.drawOval (90, 15, 100, 100);

	n.setColor (Color.blue);
	int[] x = {115, 140, 165};
	int[] y = {55, 95, 55};
	n.drawPolygon (x, y, 3);

	int[] x2 = {115, 140, 165};
	int[] y2 = {80, 40, 80};
	n.drawPolygon (x2, y2, 3);
    }


    //flower
    public static void flower ()
    {
	n = new Console (6, 27);
	t = new Turtle (n);


	t.setColor (Color.green);
	for (int square = 1 ; square <= 36 ; square++)
	{
	    for (int i = 0 ; i < 4 ; i++)
	    {
		t.move (10);
		t.turnRight (90);

	    }
	    t.turnRight (10);
	}


	int[] x = {110, 160, 200, 190, 155, 110};
	int[] y = {60, 70, 88, 90, 72, 70};
	n.fillPolygon (x, y, 6);

	t.setColor (Color.red);
	for (int square = 1 ; square <= 36 ; square++)
	{
	    for (int i = 0 ; i < 4 ; i++)
	    {
		t.move (20);
		t.turnRight (90);

	    }
	    t.turnRight (10);
	}


	t.setColor (Color.yellow);
	for (int square = 1 ; square <= 36 ; square++)
	{
	    for (int i = 0 ; i < 4 ; i++)
	    {
		t.move (30);
		t.turnRight (90);

	    }
	    t.turnRight (10);
	}
    }


    //stars token
    public static int starsToken (int success)
    {
	//continue button
	Continue ();

	if (success >= 10)
	{
	    c.println ("GENERAL: IT SEEMS LIKE YOU HAVE DONE AN EXCELLENT JOB! I'M IMPRESSED!");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: IT'S LIKE THEY SAY, \"GOOD THINGS COME TO THOSE WHO WORK.\" WHAT GOES");
	    c.println ("AROUND, COMES AROUND - AND IN WAYS THAT MIGHT SURPRISE YOU.");
	    c.println ();
	    delay (1500);
	    c.println ("________________________________________________________________________________");
	    c.println ("DEPOSIT: $20");
	    c.println ("________________________________________________________________________________");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: HERE YE GO! $20 RIGHT INTO YOUR BANK ACCOUNT! FROM ME, OF COURSE.");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: AND THIS IS A LITTLE SOMETHING FROM THE GOVERNMENT. KEEP IT UP!");
	    c.println ();
	    delay (1500);

	    //drawing
	    n = new Console (6, 27);
	    eyeToken ();

	    c.println ("GENERAL: GLORY TO LOFUS!");

	    //continue button
	    Continue ();

	    return (20);
	}
	else if (success < 10 && success >= 6)
	{
	    c.println ("GENERAL: IT SEEMS LIKE YOU HAVE DONE A GOOD JOB! NICE JOB!");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: THOUGH YOU ARE NOT PERFECT, YOU'VE DONE A GOOD JOB, WHICH MEANS THAT");
	    c.println ("YOU DESERVE A REWARD.");
	    c.println ();
	    delay (1500);
	    c.println ("________________________________________________________________________________");
	    c.println ("DEPOSIT: $10");
	    c.println ("________________________________________________________________________________");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: HERE YE GO! $10 RIGHT INTO YOUR BANK ACCOUNT! FROM ME, OF COURSE... SO");
	    c.println ("... UHH... KEEP UP THE GOOD WORK!");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: GLORY TO LOFUS");

	    //continue button
	    Continue ();

	    return (10);
	}
	else if (success < 6 && success >= 3)
	{
	    c.println ("GENERAL: YOU'VE DONE A DECENT JOB... I GUESS... NOT BAD, BUT NOT GOOD ENOUGH.");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: MAYBE IT WAS A MISTAKE TO RELY ON LOTTERY... WELL, IT SHOULD GO WITHOUT");
	    c.println ("SAYING THAT YOU GET WHAT YOU PAY FOR.");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: THOUGH YOU STILL DID YOUR JOB... KIND OF... SO I SHOULD AT LEAST GIVE");
	    c.println ("YOU SOMETHING.");
	    c.println ();
	    delay (1500);
	    c.println ("________________________________________________________________________________");
	    c.println ("DEPOSIT: $5");
	    c.println ("________________________________________________________________________________");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: UHH... $5 RIGHT INTO YOUR BANK ACCOUNT... HMM, THAT MIGHT BE TOO MUCH.");
	    c.println ("WHATEVER. BE THANKFUL FOR ME BECAUSE THAT COMES FROM ME, MY BANK ACCOUNT.");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: GLORY TO LOFUS");

	    //continue button
	    Continue ();

	    return (5);
	}
	else
	{
	    c.println ("GENERAL: ...");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: ...");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: ...");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: ...");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: ...");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: UMM... IS SOMETHING WRONG?");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: NO... YEA... I KIND OF LIED. IT'S... IT'S ACTUALLY A BIG REPORT.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: WELL, WHAT IS IT?");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: YOU'R-");
	    c.println ();
	    delay (1500);
	    c.println ("*creak*");
	    c.println ();
	    delay (1500);

	    //continue button
	    Continue ();

	    c.println ("GAME MASTER: A MAN IN A SUIT OPENS THE DOOR TO \"YOUR\" OFFICE. YOU HAVE A BAD");
	    c.println ("FEELING ABOUT THIS.");
	    c.println ();
	    delay (1500);
	    c.println ("INSPECTOR: OH? UHH... HELLO. IS THIS THE WRONG PLACE?");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: NONO, YOU'RE IN THE RIGHT PLACE.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: WHAT'S GOING ON?");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: YOU'RE BEING REPLACED, INS-... EX-INSPECTOR.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: HUH? WH-WHAT DO YOU MEAN?");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: YOU'RE FIRED.");
	    c.println ();
	    delay (1500);

	    //continue button
	    Continue ();

	    c.println ("YOU: WHAT?! WHY?!");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: *scoff* WHY? BUDDY YOU DIDN'T EVEN TRY TO DO WELL ON THIS JOB. YOU'RE");
	    c.println ("EVEN LUCKY ENOUGH TO LAST THIS LONG ACTUALLY.");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: NONONO, THIS CAN'T BE HAPPENING! WHAT ABOUT MY FAMILY? IF YOU FIRE ME, I");
	    c.println ("CAN'T PROVIDE ANYTHING FOR MY FAMILY!");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: YOU SHOULD'VE THOUGHT OF THAT EARLIER.");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: AND YOU SHOULD REALLY WORRY MORE ABOUT YOURSELF.");
	    c.println ();
	    delay (1500);

	    //continue button
	    Continue ();

	    c.println ("*bam* *bam* *bam*");
	    c.println ();
	    delay (1500);
	    c.println ("YOU: WHAT NOW?!");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: TWO SECURITY GUARDS COME IN. ONE OF THEM IS OFFICER CAIN.");
	    c.println ();
	    delay (1500);
	    c.println ("GENERAL: WE HAVE WITNESSES WHO HAVE SEEN YOU SECRETLY MEETING SOMEONE WHO IS");
	    c.println ("LIKELY TO BE INVOLVED WITH A TERRORIST GROUP NAMED \"CREED.\" YOU WILL COME WITH");
	    c.println ("US AND ANSWER A LOT OF QUESTIONS IN PRISON. OH, AND YOUR FAMILY WILL BE");
	    c.println ("QUESTIONED TOO FOR THEIR INVOLVMENT.");
	    c.println ();
	    delay (1500);
	    c.println ("GAME MASTER: BEFORE YOU CAN SAY ANYTHING. THE GUARDS HANDCUFF YOU.");
	    c.println ();
	    delay (1500);

	    //continue button
	    Continue ();

	    c.println ("GENERAL: GLORY TO LOFUS");

	    //continue button
	    Continue ();

	    //game over
	    gameOverFire ();

	    return 0;
	}
    } //bomb puzzle


    public static void bomb () throws IOException
    {
	char user = ' ';

	//bomb lid
	o.clear ();
	o.drawRect (10, 50, 620, 400);

	o.setCursor (12, 37);
	o.print ("2");
	o.setCursor (12, 40);
	o.print ("4");
	o.setCursor (12, 43);
	o.print ("1");
	o.setCursor (12, 46);
	o.print ("3");

	o.setCursor (4, 5);
	o.print ("A");
	o.setCursor (4, 76);
	o.print ("B");
	o.setCursor (22, 5);
	o.print ("C");
	o.setCursor (22, 76);
	o.print ("D");

	o.drawRect (278, 215, 97, 30);
	o.drawLine (303, 215, 303, 245);
	o.drawLine (327, 215, 327, 245);
	o.drawLine (353, 215, 353, 245);

	o.drawOval (24, 64, 26, 26);
	o.drawOval (590, 65, 26, 26);
	o.drawOval (590, 410, 27, 27);
	o.drawOval (23, 412, 27, 27);

	//1
	o.drawLine (590, 80, 150, 80);
	o.drawLine (150, 80, 150, 300);
	o.drawLine (150, 300, 340, 300);
	o.drawLine (340, 300, 340, 245);

	//2
	o.drawLine (600, 410, 600, 380);
	o.drawLine (600, 380, 200, 380);
	o.drawLine (200, 380, 200, 190);
	o.drawLine (200, 190, 400, 190);
	o.drawLine (400, 190, 400, 280);
	o.drawLine (400, 280, 290, 280);
	o.drawLine (290, 280, 290, 245);

	//3
	o.drawLine (50, 420, 450, 420);
	o.drawLine (450, 420, 450, 180);
	o.drawLine (450, 180, 365, 180);
	o.drawLine (365, 180, 365, 215);

	//4
	o.drawLine (40, 90, 40, 150);
	o.drawLine (40, 150, 312, 150);
	o.drawLine (312, 150, 312, 215);

	c.println ("OFFICER CAIN: FIRST, OPEN THE LID BY PRESSING THE \"LETTER\" KEYS IN ORDER");
	c.println ("FROM THE SMALLEST TO GREATEST.");
	c.println ("EX. PRESS THE 'Z' KEY TO UNLOCK THE '9' NAIL");

	delay (1500);

	c.println ();
	c.println ("(PRESS KEY) 'A'     'B'     'C'     'D'");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 65 || user == (int) 97 || user == (int) 66 || user == (int) 98 || user == (int) 67 || user == (int) 99 || user == (int) 68 || user == (int) 100))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}


	while (!(user == (int) 65 || user == (int) 97 || user == (int) 66 || user == (int) 98 || user == (int) 67 || user == (int) 99 || user == (int) 68 || user == (int) 100));

	c.println ();

	if (user == (int) 66 || user == (int) 98)
	{
	    o.drawLine (150, 229, 140, 242);
	    o.drawLine (150, 251, 160, 238);
	    o.setColor (Color.white);
	    o.drawLine (150, 230, 150, 250);

	    c.println ("OFFICER CAIN: GOOD, NOW THE NEXT ONE.");
	}
	else
	{
	    c.println ("OFFICER CAIN: NONONO! NOT THA!-");
	    delay (3500);
	    gameOverDeath ();
	}


	c.println ();
	c.println ("(PRESS KEY) 'A'     'C'     'D'");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99 || user == (int) 68 || user == (int) 100))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99 || user == (int) 68 || user == (int) 100));

	c.println ();

	if (user == (int) 68 || user == (int) 100)
	{
	    o.setColor (Color.black);
	    o.drawLine (400, 239, 410, 252);
	    o.drawLine (400, 260, 390, 248);
	    o.setColor (Color.white);
	    o.drawLine (400, 240, 400, 260);

	    c.println ("OFFICER CAIN: EXCELLENT, AGAIN.");
	}
	else
	{
	    c.println ("OFFICER CAIN: NONONO! NOT THA!-");
	    delay (3500);
	    gameOverDeath ();
	}


	c.println ();
	c.println ("(PRESS KEY) 'A'     'C'");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99));

	c.println ();

	if (user == (int) 67 || user == (int) 99)
	{
	    o.setColor (Color.black);
	    o.drawLine (450, 299, 440, 288);
	    o.drawLine (450, 279, 460, 292);
	    o.setColor (Color.white);
	    o.drawLine (450, 300, 450, 280);

	    c.println ("OFFICER CAIN: PERFECT, NOW THE LAST ONE.");
	}
	else
	{
	    c.println ("OFFICER CAIN: NONONO! NOT THA!-");
	    delay (3500);
	    gameOverDeath ();
	}


	c.println ();
	c.println ("(PRESS KEY) 'A'");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 65 || user == (int) 97))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}
	while (!(user == (int) 65 || user == (int) 97));

	o.setColor (Color.black);
	o.drawLine (40, 109, 50, 121);
	o.drawLine (40, 129, 30, 117);
	o.setColor (Color.white);
	o.drawLine (40, 110, 40, 130);

	c.println ();
	c.println ("OFFICER CAIN: OKAY, GREAT JOB. NOW OPEN IT AND LET'S SEE WHAT'S INSIDE.");

	Continue ();

	//bomb inner
	o.clear ();
	o.setColor (Color.black);
	o.drawRect (10, 50, 620, 400);

	//DECODE
	Font font = new Font ("Forte", Font.PLAIN, 50);
	o.setFont (font);
	o.drawString ("DECODE", 235, 120);

	//FIRST NAME
	Font font2 = new Font ("Forte", Font.PLAIN, 30);
	o.setFont (font2);
	o.drawString ("FIRST NAME", 125, 350);

	//LAST NAME
	Font font3 = new Font ("Forte", Font.PLAIN, 30);
	o.setFont (font3);
	o.drawString ("LAST NAME", 350, 350);

	c.println ();
	c.println ("OFFICER CAIN: OH... THIS IS HARDER THAN I THOUGHT.");
	c.println ();
	delay (1500);
	c.println ("OFFICER CAIN: STUPID TERRORIST.");
	c.println ();
	delay (1500);
	c.println ("OFFICER CAIN: OKAY, SO, BASICALLY... THIS BOMB REQUIRES THE FIRST AND LAST NAME");
	c.println ("OF THE CHOSEN NAME THAT THE TERRORIST SET AS THE PASSWORD. SINCE WE DON'T KNOW");
	c.println ("THAT, ALL WE HAVE TO DO IS TO HACK INTO THIS SYSTEM AND SEE WHAT THE NAME IS.");
	c.println ("AFTERWARDS, WE WILL ENCODE THE NAME INTO THE BOMB AND DISABLE THIS CRAP.");
	c.println ();
	delay (1500);
	c.println ("OFFICER CAIN: EACH DECODING PROCESS WILL ONLY GIVE YOU 3 CHANCES. IF YOU MESS");
	c.println ("THAT UP, WE ARE SCREWED.");
	c.println ();
	delay (1500);
	c.println ("OFFICER CAIN: SO. WHICH ONE DO YOU WANT TO DO FIRST?");
	c.println ();
	delay (1500);
	c.println ("FIRST NAME (KEY '1') OR LAST NAME (KEY '2')");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 49 || user == (int) 50))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}


	while (!(user == (int) 49 || user == (int) 50));

	char a = user;

	c.println ();
	c.println ("OFFICER CAIN: OKAY, LET'S DO THIS.");
	delay (1000);

	Continue ();

	if (user == (int) 49)
	{
	    //bomb first name
	    c.println ("OFFICER CAIN: C'MON, C'MON! WE DON'T HAVE ALL DAY!");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    o.clear ();
	    o.drawRect (10, 50, 620, 400);
	    o.setCursor (4, 5);
	    o.print ("TWO BROTHERS WE ARE, GREAT BURDENS WE BEAR, ALL DAY WE ARE BITTERLY");
	    o.setCursor (5, 5);
	    o.print ("PRESSED; YET THIS I WILL SAY - WE ARE FULL ALL THE DAY, AND EMPTY WHEN WE");
	    o.setCursor (6, 5);
	    o.print ("GO TO REST.");
	    o.setCursor (9, 5);
	    o.print ("1. NATURE");
	    o.setCursor (10, 5);
	    o.print ("2. BOOTS");
	    o.setCursor (11, 5);
	    o.print ("3. DEATH");
	    o.setCursor (12, 5);
	    o.print ("4. HEADPHONES");
	    o.setCursor (13, 5);
	    o.print ("5. HUNGER");
	    o.setCursor (14, 5);
	    o.print ("6. DAY");
	    o.setCursor (15, 5);
	    o.print ("7. ANIMALS");
	    o.setCursor (16, 5);
	    o.print ("8. FAMILY");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 50)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... TWO BROTHERS? LIKE A PAIR?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    Continue ();

	    c.println ("OFFICER CAIN: I THINK YOU GOT IT RIGHT!");
	    c.println ();
	    c.println ("OFFICER CAIN: NOW DO THE NEXT ONE.");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    delay (2000);
	    o.setCursor (4, 5);
	    o.print ("OF ALL YOUR POSSESSIONS, I AM THE HARDEST TO GUARD. IF YOU HAVE ME, YOU");
	    o.setCursor (5, 5);
	    o.print ("WILL WANT TO SHARE ME. IF YOU SHARE ME, YOU NO LONGER HAVE ME.");
	    o.setCursor (9, 5);
	    o.print ("1. THE GODS");
	    o.setCursor (10, 5);
	    o.print ("2. YOUR LIFE");
	    o.setCursor (11, 5);
	    o.print ("3. GOOD INTENTIONS");
	    o.setCursor (12, 5);
	    o.print ("4. WATER");
	    o.setCursor (13, 5);
	    o.print ("5. SECRET");
	    o.setCursor (14, 5);
	    o.print ("6. AIR");
	    o.setCursor (15, 5);
	    o.print ("7. MUSIC");
	    o.setCursor (16, 5);
	    o.print ("8. HATRED");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 53)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... THE HARDEST TO GUARD? THE HARDEST TO KEEP?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    Continue ();

	    c.println ("OFFICER CAIN: GOOD JOB! LAST ONE!!!");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    delay (2000);
	    o.setCursor (4, 5);
	    o.print ("ALIVE AS YOU BUT WITHOUT BREATH, AS COLD IN MY LIFE AS IN MY DEATH;");
	    o.setCursor (5, 5);
	    o.print ("NEVER A THIRST THOUGH I ALWAYS DRINK, DRESSED IN A MAIL BUT NEVER A");
	    o.setCursor (6, 5);
	    o.print ("CLINK.");
	    o.setCursor (9, 5);
	    o.print ("1. SPECTER");
	    o.setCursor (10, 5);
	    o.print ("2. WEALTH");
	    o.setCursor (11, 5);
	    o.print ("3. FISH");
	    o.setCursor (12, 5);
	    o.print ("4. POETRY");
	    o.setCursor (13, 5);
	    o.print ("5. WATER");
	    o.setCursor (14, 5);
	    o.print ("6. SAILS");
	    o.setCursor (15, 5);
	    o.print ("7. THE PLAGUE");
	    o.setCursor (16, 5);
	    o.print ("8. WINTER");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 51)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... DRESSED IN A MAIL? LIKE ARMOUR?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.setColor (Color.black);
	    o.drawRect (10, 50, 620, 400);

	    delay (2000);

	    Font font4 = new Font ("Forte", Font.PLAIN, 70);
	    o.setFont (font4);
	    o.drawString ("ANDREW", 200, 300);

	    Continue ();

	    c.println ("OFFICER CAIN: OKAY, GOOD! WE GOT THE FIRST NAME.");
	    c.println ();
	    c.println ("OFFICER CAIN: OH! ANDREW. THAT'S A COOL NAME!");
	    delay (3000);
	}


	else
	{
	    //bomb last name
	    c.println ("OFFICER CAIN: YOU BETTER BUY ME DINNER AFTER THIS IS OVER.");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    o.clear ();
	    o.drawRect (10, 50, 620, 400);
	    o.setCursor (4, 5);
	    o.print ("I HAVE HOLES THROUGHOUT, FROM BACK TO FRONT AND TOP TO BOTTOM");
	    o.setCursor (5, 5);
	    o.print ("TO CORE. MORE NOTHING THAN SOMETHING WITHIN, AND YET I STILL");
	    o.setCursor (6, 5);
	    o.print ("HOLD WATER.");
	    o.setCursor (9, 5);
	    o.print ("1. A WELL");
	    o.setCursor (10, 5);
	    o.print ("2. A STREAM");
	    o.setCursor (11, 5);
	    o.print ("3. CUPPED HANDS");
	    o.setCursor (12, 5);
	    o.print ("4. A GLASS");
	    o.setCursor (13, 5);
	    o.print ("5. THE OCEAN");
	    o.setCursor (14, 5);
	    o.print ("6. THE SKY");
	    o.setCursor (15, 5);
	    o.print ("7. TEARS");
	    o.setCursor (16, 5);
	    o.print ("8. A SPONGE");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 56)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... HOLD WATER? SO LIKE SUCKING THEM IN?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    Continue ();

	    c.println ("OFFICER CAIN: NEXT!");
	    c.println ();
	    c.println ("OFFICER CAIN: HEH, I'M THE INSPECTOR NOW.");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    delay (2000);
	    o.setCursor (4, 5);
	    o.print ("THE MORE THAT THERE IS, THE LESS THAT YOU SEE. SQUINT ALL YOU WISH");
	    o.setCursor (5, 5);
	    o.print ("WHEN SURROUNDED BY ME.");
	    o.setCursor (9, 5);
	    o.print ("1. THE GODS");
	    o.setCursor (10, 5);
	    o.print ("2. THE SUN");
	    o.setCursor (11, 5);
	    o.print ("3. BLISS");
	    o.setCursor (12, 5);
	    o.print ("4. DRINK");
	    o.setCursor (13, 5);
	    o.print ("5. FIRE");
	    o.setCursor (14, 5);
	    o.print ("6. BREATH");
	    o.setCursor (15, 5);
	    o.print ("7. DARKNESS");
	    o.setCursor (16, 5);
	    o.print ("8. HOPE");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 55)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... WHAT HAPPENS WHEN I CAN'T SEE ANYTHING?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    Continue ();

	    c.println ("OFFICER CAIN: ...");
	    c.println ();
	    delay (2000);
	    c.println ("OFFICER CAIN: ... HUH? WHA? OH... YA GO ON.");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    delay (2000);
	    o.setCursor (4, 5);
	    o.print ("THE LIFE I LEAD IS MERE HOURS OR LESS, I SERVE ALL MY TIME BY BEING");
	    o.setCursor (5, 5);
	    o.print ("CONSUMED. I AM QUICKEST WHEN THIN, SLOWEST WHEN FAT, AND WIND IS THE");
	    o.setCursor (6, 5);
	    o.print ("BANE OF THE GIFT THAT I BRING.");
	    o.setCursor (9, 5);
	    o.print ("1. A CANDLE");
	    o.setCursor (10, 5);
	    o.print ("2. A WISP");
	    o.setCursor (11, 5);
	    o.print ("3. A CLOUD");
	    o.setCursor (12, 5);
	    o.print ("4. A CHILD");
	    o.setCursor (13, 5);
	    o.print ("5. GOOD INTENTIONS");
	    o.setCursor (14, 5);
	    o.print ("6. TIME");
	    o.setCursor (15, 5);
	    o.print ("7. SPEECH");
	    o.setCursor (16, 5);
	    o.print ("8. DAYBREAK");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 49)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... SO, NO MATTER WHAT THE SIZE IS, THIN OR FAT, WHEN THERE IS");
		    c.println ("WIND, IT WILL NEVER CAT-CH?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    delay (2000);

	    Font fon4 = new Font ("Forte", Font.PLAIN, 70);
	    o.setFont (fon4);
	    o.drawString ("CHAI", 200, 300);

	    Continue ();

	    c.println ("OFFICER CAIN: OKAY, GOOD! WE GOT THE LAST NAME.");
	    c.println ();
	    c.println ("OFFICER CAIN: OH! CHAI. LIKE THE TEA!");
	}


	c.println ();
	c.println ("OFFICER CAIN: WE'RE ALMOST DONE! LET'S DO THE NEXT ONE.");
	delay (1000);

	if (a == (int) 49)
	{
	    //bomb inner
	    o.clear ();
	    o.setColor (Color.black);
	    o.drawRect (10, 50, 620, 400);

	    //DECODE
	    o.setFont (font);
	    o.drawString ("DECODE", 235, 120);

	    //LAST NAME
	    o.setFont (font3);
	    o.drawString ("LAST NAME", 350, 350);
	}
	else
	{
	    //bomb inner
	    o.clear ();
	    o.setColor (Color.black);
	    o.drawRect (10, 50, 620, 400);

	    //DECODE
	    o.setFont (font);
	    o.drawString ("DECODE", 235, 120);

	    //FIRST NAME
	    o.setFont (font2);
	    o.drawString ("FIRST NAME", 125, 350);
	}


	delay (3500);

	Continue ();

	if (a == (int) 49)
	{
	    //bomb last name
	    c.println ("OFFICER CAIN: YOU BETTER BUY ME DINNER AFTER THIS IS OVER.");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    o.clear ();
	    o.drawRect (10, 50, 620, 400);
	    o.setCursor (4, 5);
	    o.print ("I HAVE HOLES THROUGHOUT, FROM BACK TO FRONT AND TOP TO BOTTOM");
	    o.setCursor (5, 5);
	    o.print ("TO CORE. MORE NOTHING THAN SOMETHING WITHIN, AND YET I STILL");
	    o.setCursor (6, 5);
	    o.print ("HOLD WATER.");
	    o.setCursor (9, 5);
	    o.print ("1. A WELL");
	    o.setCursor (10, 5);
	    o.print ("2. A STREAM");
	    o.setCursor (11, 5);
	    o.print ("3. CUPPED HANDS");
	    o.setCursor (12, 5);
	    o.print ("4. A GLASS");
	    o.setCursor (13, 5);
	    o.print ("5. THE OCEAN");
	    o.setCursor (14, 5);
	    o.print ("6. THE SKY");
	    o.setCursor (15, 5);
	    o.print ("7. TEARS");
	    o.setCursor (16, 5);
	    o.print ("8. A SPONGE");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 56)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... HOLD WATER? SO LIKE SUCKING THEM IN?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    Continue ();

	    c.println ("OFFICER CAIN: NEXT!");
	    c.println ();
	    c.println ("OFFICER CAIN: HEH, I'M THE INSPECTOR NOW.");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    delay (2000);
	    o.setCursor (4, 5);
	    o.print ("THE MORE THAT THERE IS, THE LESS THAT YOU SEE. SQUINT ALL YOU WISH");
	    o.setCursor (5, 5);
	    o.print ("WHEN SURROUNDED BY ME.");
	    o.setCursor (9, 5);
	    o.print ("1. THE GODS");
	    o.setCursor (10, 5);
	    o.print ("2. THE SUN");
	    o.setCursor (11, 5);
	    o.print ("3. BLISS");
	    o.setCursor (12, 5);
	    o.print ("4. DRINK");
	    o.setCursor (13, 5);
	    o.print ("5. FIRE");
	    o.setCursor (14, 5);
	    o.print ("6. BREATH");
	    o.setCursor (15, 5);
	    o.print ("7. DARKNESS");
	    o.setCursor (16, 5);
	    o.print ("8. HOPE");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 55)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... WHAT HAPPENS WHEN I CAN'T SEE ANYTHING?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    Continue ();

	    c.println ("OFFICER CAIN: ...");
	    c.println ();
	    delay (2000);
	    c.println ("OFFICER CAIN: ... HUH? WHA? OH... YA GO ON.");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    delay (2000);
	    o.setCursor (4, 5);
	    o.print ("THE LIFE I LEAD IS MERE HOURS OR LESS, I SERVE ALL MY TIME BY BEING");
	    o.setCursor (5, 5);
	    o.print ("CONSUMED. I AM QUICKEST WHEN THIN, SLOWEST WHEN FAT, AND WIND IS THE");
	    o.setCursor (6, 5);
	    o.print ("BANE OF THE GIFT THAT I BRING.");
	    o.setCursor (9, 5);
	    o.print ("1. A CANDLE");
	    o.setCursor (10, 5);
	    o.print ("2. A WISP");
	    o.setCursor (11, 5);
	    o.print ("3. A CLOUD");
	    o.setCursor (12, 5);
	    o.print ("4. A CHILD");
	    o.setCursor (13, 5);
	    o.print ("5. GOOD INTENTIONS");
	    o.setCursor (14, 5);
	    o.print ("6. TIME");
	    o.setCursor (15, 5);
	    o.print ("7. SPEECH");
	    o.setCursor (16, 5);
	    o.print ("8. DAYBREAK");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 49)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... SO, NO MATTER WHAT THE SIZE IS, THIN OR FAT, WHEN THERE IS");
		    c.println ("WIND, IT WILL NEVER CAT-CH?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    delay (2000);

	    Font fon4 = new Font ("Forte", Font.PLAIN, 70);
	    o.setFont (fon4);
	    o.drawString ("CHAI", 200, 300);

	    Continue ();

	    c.println ("OFFICER CAIN: OKAY, GOOD! WE GOT THE LAST NAME.");
	    c.println ();
	    c.println ("OFFICER CAIN: OH! CHAI. LIKE THE TEA!");
	}
	else
	{
	    //bomb first name
	    c.println ("OFFICER CAIN: C'MON, C'MON! WE DON'T HAVE ALL DAY!");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    o.clear ();
	    o.drawRect (10, 50, 620, 400);
	    o.setCursor (4, 5);
	    o.print ("TWO BROTHERS WE ARE, GREAT BURDENS WE BEAR, ALL DAY WE ARE BITTERLY");
	    o.setCursor (5, 5);
	    o.print ("PRESSED; YET THIS I WILL SAY - WE ARE FULL ALL THE DAY, AND EMPTY WHEN WE");
	    o.setCursor (6, 5);
	    o.print ("GO TO REST.");
	    o.setCursor (9, 5);
	    o.print ("1. NATURE");
	    o.setCursor (10, 5);
	    o.print ("2. BOOTS");
	    o.setCursor (11, 5);
	    o.print ("3. DEATH");
	    o.setCursor (12, 5);
	    o.print ("4. HEADPHONES");
	    o.setCursor (13, 5);
	    o.print ("5. HUNGER");
	    o.setCursor (14, 5);
	    o.print ("6. DAY");
	    o.setCursor (15, 5);
	    o.print ("7. ANIMALS");
	    o.setCursor (16, 5);
	    o.print ("8. FAMILY");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 50)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... TWO BROTHERS? LIKE A PAIR?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    Continue ();

	    c.println ("OFFICER CAIN: I THINK YOU GOT IT RIGHT!");
	    c.println ();
	    c.println ("OFFICER CAIN: NOW DO THE NEXT ONE.");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    delay (2000);
	    o.setCursor (4, 5);
	    o.print ("OF ALL YOUR POSSESSIONS, I AM THE HARDEST TO GUARD. IF YOU HAVE ME, YOU");
	    o.setCursor (5, 5);
	    o.print ("WILL WANT TO SHARE ME. IF YOU SHARE ME, YOU NO LONGER HAVE ME.");
	    o.setCursor (9, 5);
	    o.print ("1. THE GODS");
	    o.setCursor (10, 5);
	    o.print ("2. YOUR LIFE");
	    o.setCursor (11, 5);
	    o.print ("3. GOOD INTENTIONS");
	    o.setCursor (12, 5);
	    o.print ("4. WATER");
	    o.setCursor (13, 5);
	    o.print ("5. SECRET");
	    o.setCursor (14, 5);
	    o.print ("6. AIR");
	    o.setCursor (15, 5);
	    o.print ("7. MUSIC");
	    o.setCursor (16, 5);
	    o.print ("8. HATRED");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 53)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... THE HARDEST TO GUARD? THE HARDEST TO KEEP?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    Continue ();

	    c.println ("OFFICER CAIN: GOOD JOB! LAST ONE!!!");
	    c.println ();
	    c.println ("CHOOSE A KEY");

	    delay (2000);
	    o.setCursor (4, 5);
	    o.print ("ALIVE AS YOU BUT WITHOUT BREATH, AS COLD IN MY LIFE AS IN MY DEATH;");
	    o.setCursor (5, 5);
	    o.print ("NEVER A THIRST THOUGH I ALWAYS DRINK, DRESSED IN A MAIL BUT NEVER A");
	    o.setCursor (6, 5);
	    o.print ("CLINK.");
	    o.setCursor (9, 5);
	    o.print ("1. SPECTER");
	    o.setCursor (10, 5);
	    o.print ("2. WEALTH");
	    o.setCursor (11, 5);
	    o.print ("3. FISH");
	    o.setCursor (12, 5);
	    o.print ("4. POETRY");
	    o.setCursor (13, 5);
	    o.print ("5. WATER");
	    o.setCursor (14, 5);
	    o.print ("6. SAILS");
	    o.setCursor (15, 5);
	    o.print ("7. THE PLAGUE");
	    o.setCursor (16, 5);
	    o.print ("8. WINTER");

	    for (int i = 3 ; i > 0 ; i--)
	    {
		user = c.getChar ();
		do
		{
		    if (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56))
		    {
			c.println ();
			c.println ("<ERROR>");
			user = c.getChar ();
		    }
		}
		while (!(user == (int) 49 || user == (int) 50 || user == (int) 51 || user == (int) 52 || user == (int) 53 || user == (int) 54 || user == (int) 55 || user == (int) 56));

		if (user == (int) 51)
		{
		    break;
		}
		else if (i == 1)
		{
		    c.println ();
		    c.println ("OFFICER CAIN: OH, SHI-");
		    delay (3000);
		    gameOverDeath ();
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... DRESSED IN A MAIL? LIKE ARMOUR?");
		    c.println ();
		    c.println ("CHANCE: " + (i - 2));
		}
	    }
	    o.clear ();
	    o.drawRect (10, 50, 620, 400);

	    delay (2000);

	    Font fon4 = new Font ("Forte", Font.PLAIN, 70);
	    o.setFont (fon4);
	    o.drawString ("ANDREW", 200, 300);

	    Continue ();

	    c.println ("OFFICER CAIN: OKAY, GOOD! WE GOT THE FIRST NAME.");
	    c.println ();
	    c.println ("OFFICER CAIN: OH! ANDREW. THAT'S A COOL NAME!");
	    delay (3000);
	}


	c.println ();
	c.println ("OFFICER CAIN: OKAY. THIS IS IT. LET'S FINALLY INSERT THE NAME.");
	delay (1000);

	o.clear ();
	o.setColor (Color.black);
	o.drawRect (10, 50, 620, 400);
	o.setFont (font);
	o.drawString ("DECODE", 235, 120);

	c.println ();
	c.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	user = c.getChar ();
	do
	{
	    if (!(user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
		user = c.getChar ();
	    }
	}


	while (!(user == (int) 10));
	delay (1000);
	c.println ();

	c.println ("OFFICER CAIN: THIS LAST PART REQUIRES A DEVICE.");
	delay (1000);
	c.println ();
	c.println ("OFFICER CAIN: DO YOU HAVE A PHONE?");
	delay (1000);
	c.println ();
	c.println ("YOU: UHH... NO.");
	delay (1000);
	c.println ();
	c.println ("OFFICER CAIN: YA, I THOUGHT SO... USE MINE.");
	delay (1000);
	c.println ();

	System.out.println ("SAMSUNG GALAXY s22");
	System.out.println ();
	System.out.println ("1q9qovcnwajwehyt48vco347346tyqwov nbo3r_u@%*Iyhb4bwak73vynaw3na!+b63%asew4n6y^bw");
	System.out.println ();

	c.println ("OFFICER CAIN: OKAY, TYPE THE FIRST NAME ONTO THE PHONE.");
	delay (1000);
	c.println ();

	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	String name;

	name = br.readLine ();
	do
	{
	    if (!(name.equals ("andrew") || name.equals ("Andrew") || name.equals ("ANDREW")))
	    {
		System.out.println ();
		System.out.println ("<ERROR>");
		name = br.readLine ();
	    }
	}


	while (!(name.equals ("andrew") || name.equals ("Andrew") || name.equals ("ANDREW")));
	delay (1000);

	System.out.println ();

	System.out.println ("________________________________________________________________________________");
	c.println ("OFFICER CAIN: NOW TYPE THE LAST NAME.");
	delay (1000);
	c.println ();

	name = br.readLine ();
	do
	{
	    if (!(name.equals ("chai") || name.equals ("Chai") || name.equals ("CHAI")))
	    {
		System.out.println ();
		System.out.println ("<ERROR>");
		name = br.readLine ();
	    }
	}


	while (!(name.equals ("chai") || name.equals ("Chai") || name.equals ("CHAI")));
	delay (1000);

	System.out.println ();

	System.out.println ("________________________________________________________________________________");
	c.println ("OFFICER CAIN: HMM... WHY ISN'T IT WOR-");
	delay (2000);
	c.println ();

	//Name Record data
	BufferedReader fr2 = new BufferedReader (new FileReader ("FiveHundredNames.txt"));
	RecordNames recName[] = new RecordNames [500];

	String num;

	for (int i = 0 ; i < recName.length ; i++)
	{
	    num = fr2.readLine ();

	    recName [i] = new RecordNames (num);
	}


	for (int i = 0 ; i < recName.length ; i++)
	{
	    System.out.println (recName [i]);
	}


	c.println ("OFFICER CAIN: JESUS CHRIST!");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: UHH!!!");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: SO, APPARENTLY, THE TERRORIST DOESN'T WANT YOU TO DISABLE THE");
	c.println ("BOMB, YET.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: OUT OF ALL OF THESE NAMES, YOU MUST FIND \"ANDREW CHAI\" AND.");
	c.println ("WRITE DOWN ITS POSITION. HOWEVER, SINCE WE DON'T WANT TO DIE TRYING TO FIND");
	c.println ("IT, WE WILL HAVE TO DO ONE LAST THING BEFORE DISABLING IT COMPLETELY.");

	Continue ();

	o.clear ();
	o.setColor (Color.black);
	o.fillRect (10, 50, 620, 400);
	o.setColor (Color.white);
	o.fillOval (295, 205, 40, 40);

	c.println ("OFFICER CAIN: THIS LAST \"RIDDLE\" IS CALLED A FLASHLIGHT WORD. YOU MUST");
	c.println ("CONTROL THAT TINY LIGHT, EMITTED FROM A FLASHLIGHT, TO FIND AS MANY LETTER AS");
	c.println ("POSSIBLE USING THE KEYS 'W' (UP), 'A' (LEFT), 'S' (DOWN), 'D' (RIGHT).");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: ALWAYS REMEMBER THAT THE CHOSEN WORD DOESN'T NEED TO USE ALL OF");
	c.println ("THE LETTERS.");
	c.println ("EX. AFTER FINDING THE LETTERS - 'C', 'A', 'B', 'I', AND 'N' - THE CHOSEN WORD");
	c.println ("CAN EITHER BE \"CABIN\" OR \"BIN\" OR \"BAN\" OR \"CAN\" AND SO ON.");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: ONCE YOU FIND THEM ALL, YOU CAN PRESS THE \"ENTER\" KEY TO WRITE");
	c.println ("WHAT YOU THINK THE CORRECT WORD IS. LUCKILY, YOU WILL HAVE UNLIMITED CHANCES.");
	c.println ("AND IF YOU DON'T GET IT RIGHT, YOU WILL HAVE TO GO BACK AND SEARCH CAREFULLY.");
	delay (1500);
	c.println ();

	Continue ();

	name = "";
	int x = 295;
	int y = 205;

	c.println ();
	c.println ("'W' (UP)");
	c.println ("'A' (LEFT)");
	c.println ("'S' (DOWN)");
	c.println ("'D' (RIGHT)");
	c.println ("\"ENTER\" TO ANSWER");

	do
	{
	    user = c.getChar ();

	    if (!(user == (int) 119 || user == (int) 87 || user == (int) 97 || user == (int) 65 || user == (int) 115 || user == (int) 83 || user == (int) 100 || user == (int) 68 || user == (int) 10))
	    {
		c.println ();
		c.println ("<ERROR>");
		c.println ("'W' (UP)");
		c.println ("'A' (LEFT)");
		c.println ("'S' (DOWN)");
		c.println ("'D' (RIGHT)");
		c.println ("\"ENTER\" TO ANSWER");
		user = c.getChar ();
	    }
	    else if (user == (int) 119 || user == (int) 87)
	    {
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x, y - 3, 40, 40);

		y -= 3;
	    }
	    else if (user == (int) 97 || user == (int) 65)
	    {
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x - 3, y, 40, 40);

		x -= 3;
	    }
	    else if (user == (int) 115 || user == (int) 83)
	    {
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x, y + 3, 40, 40);

		y += 3;
	    }
	    else if (user == (int) 100 || user == (int) 68)
	    {
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x + 3, y, 40, 40);

		x += 3;
	    }
	    else if (user == (int) 10)
	    {
		c.println ();
		c.println ("WHAT IS THE WORD? (USE ALL CAPS)");
		name = c.readLine ();
		if (name.equals ("SHOT"))
		{
		    break;
		}
		else
		{
		    c.println ();
		    c.println ("OFFICER CAIN: I THINK THAT'S WRONG. TRY GOING NEAR THE CORNERS.");
		    c.println ();
		    c.println ("OFFICER CAIN: HMM... THERE ARE 5 LETTERS. FIND IT WITH A \"BANG!\"");
		}
	    }

	    if (x >= 521 && x <= 551 && y >= 355 && y <= 385)
	    {
		o.clear ();
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x, y, 40, 40);
		o.setCursor (20, 70);
		o.print ("S");
	    }
	    else if (x >= 121 && x <= 171 && y >= 295 && y <= 345)
	    {
		o.clear ();
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x, y, 40, 40);
		o.setCursor (17, 20);
		o.print ("H");
	    }
	    else if (x >= 441 && x <= 491 && y >= 155 && y <= 205)
	    {
		o.clear ();
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x, y, 40, 40);
		o.setCursor (10, 60);
		o.print ("O");
	    }
	    else if (x >= 81 && x <= 131 && y >= 65 && y <= 125)
	    {
		o.clear ();
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x, y, 40, 40);
		o.setCursor (6, 15);
		o.print ("T");
	    }
	    else if (x >= 9 && x <= 59 && y >= 385 && y <= 445)
	    {
		o.clear ();
		o.setColor (Color.black);
		o.fillRect (10, 50, 620, 400);
		o.setColor (Color.white);
		o.fillOval (x, y, 40, 40);
		o.setCursor (22, 6);
		o.print ("G");
	    }
	}
	while (!(name.equals ("SHOT")));

	Continue ();

	c.println ("OFFICER CAIN: FINALLY! OKAY, NOW DO IT AGAIN.");
	delay (1000);
	c.println ();
	c.println ("OFFICER CAIN: TYPE THE FIRST NAME ONTO THE PHONE.");
	delay (1000);
	c.println ();

	System.out.println ("________________________________________________________________________________");

	name = br.readLine ();
	do
	{
	    if (!(name.equals ("andrew") || name.equals ("Andrew") || name.equals ("ANDREW")))
	    {
		System.out.println ();
		System.out.println ("<ERROR>");
		name = br.readLine ();
	    }
	}


	while (!(name.equals ("andrew") || name.equals ("Andrew") || name.equals ("ANDREW")));
	delay (1000);

	System.out.println ();

	System.out.println ("________________________________________________________________________________");
	c.println ("OFFICER CAIN: AND THE LAST NAME.");
	delay (1000);
	c.println ();

	name = br.readLine ();
	do
	{
	    if (!(name.equals ("chai") || name.equals ("Chai") || name.equals ("CHAI")))
	    {
		System.out.println ();
		System.out.println ("<ERROR>");
		name = br.readLine ();
	    }
	}


	while (!(name.equals ("chai") || name.equals ("Chai") || name.equals ("CHAI")));
	delay (1000);

	System.out.println ();

	System.out.println ("________________________________________________________________________________");
	c.println ("OFFICER CAIN: NOW WE CROSS OUR FINGERS AND WAIT.");
	delay (2000);
	c.println ();

	bubbleSort (recName);

	for (int i = 0 ; i < recName.length ; i++)
	{
	    System.out.println (recName [i]);
	}


	c.println ("OFFICER CAIN: HALLELUJAH! IT WORKS!");
	delay (1500);
	c.println ();
	c.println ("OFFICER CAIN: NOW FIND THE PASSWORD NAME. IT WILL PROBABLY BE AT THE TOP");
	c.println ("BECAUSE ANDREW CHAI IS SUCH A COOL AND SUPERIOR NAME. ;)");

	int number = 0;
	number = c.readInt ();
	do
	{
	    if (!(number == 1))
	    {
		c.println ();
		c.println ("<ERROR>");
		number = c.readInt ();
	    }
	}


	while (!(number == 1));

	o.setColor (Color.black);
	o.fillRect (10, 50, 620, 400);
	o.setColor (Color.white);
	Font font5 = new Font ("Old English Text MT", Font.PLAIN, 50);
	o.setFont (font5);
	o.drawString ("BOMB DISABLED", 65, 250);
    }


    //Cain's pendant
    public static void pendantCain ()
    {
	n = new Console (6, 25);
	n.setColor (Color.red);

	//heart right surface (7)
	n.drawLine (199, 50, 199, 119);
	n.drawLine (199, 50, 178, 35);
	n.drawLine (178, 35, 157, 30);
	n.drawLine (157, 30, 136, 40);
	n.drawLine (136, 40, 126, 60);
	n.drawLine (126, 60, 135, 90);
	n.drawLine (135, 90, 199, 119);
    }


    //Elisa's pendant
    public static void pendantElisa ()
    {
	n = new Console (6, 25);
	n.setColor (Color.red);

	//heart left surface (7)
	n.drawLine (0, 50, 0, 119);
	n.drawLine (0, 50, 21, 35);
	n.drawLine (21, 35, 42, 30);
	n.drawLine (42, 30, 63, 40);
	n.drawLine (63, 40, 72, 60);
	n.drawLine (72, 60, 64, 90);
	n.drawLine (64, 90, 0, 119);
    }


    //battle screen
    public static int Battle (int Creed, int Ac, int HP, int Dam1, int Dam2, int Dam3)
    {
	char user = ' ';
	int charge = 0;
	int reload = 6;
	int Hit = 0;
	int taking = 0;
	int escape = 0;
	int escapeFrom = 0;
	int nextMove = 0;
	int BossAttack = 0;
	int BossAC = (int) (Math.random () * 5 + 14);
	int BossHp = (int) (Math.random () * 4 + 3);

	p.println ("BATTLE");
	p.println ();
	do
	{
	    if (Creed == 1)
		p.println ("<LOFUS OFFICER>");
	    else
		p.println ("<CREED MEMBER>");

	    p.println ("AC: " + BossAC);
	    p.println ("Hp: " + BossHp);
	    p.println ("________________________________________________________________________________");
	    p.println ("<INSPECTOR>");
	    p.println ("AC: " + Ac);
	    p.println ("Hp: " + HP);
	    p.println ("PRESS KEY TO ACT");

	    if (reload == 6 && charge == 0)
	    {
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload == 6 && charge != 0)
	    {
		p.println ("'A': ATTACK. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload < 6 && reload > 0 && charge == 0)
	    {
		p.println ("'A': ATTACK. 'R': RELOAD. 'C': CHARGE. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload < 6 && reload > 0 && charge != 0)
	    {
		p.println ("'A': ATTACK. 'R': RELOAD. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else
	    {
		p.println ("[OUT OF AMMO!]");
		p.println ("'R': RELOAD. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    p.println ("________________________________________________________________________________");

	    //Attack
	    if (user == (int) 65 || user == (int) 97)
	    {
		reload--;
		Hit = (int) (Math.random () * 20) + 1;

		q.println ("ROULETTE");
		delay (1000);
		q.println ("CHANCE: [" + Hit + "]");

		if (Hit >= BossAC)
		{
		    delay (1000);
		    q.println ("CONDITION: HIT!");

		    Dam1 = (int) (Math.random () * 2) + 1;
		    Dam2 = (int) (Math.random () * 2) + 1;
		    Dam3 = (int) (Math.random () * 2) + 1;

		    delay (1000);
		    q.println ("DAMAGE CHANCE: [" + Dam1 + "] " + " [" + Dam2 + "] " + " [" + Dam3 + "]");

		    if (Dam1 == Dam2 && Dam1 == Dam3)
		    {
			if (charge == 1)
			{
			    delay (1000);
			    q.println ("CHARGED AMMO!");
			    delay (1000);
			    q.println ("HEADSHOT!");
			    delay (500);
			    q.println ("DAMMAGE: 3");
			    BossHp -= 3;
			    charge = 0;
			}
			else
			{
			    delay (1000);
			    q.println ("HEADSHOT!");
			    delay (500);
			    q.println ("DAMMAGE: 2");
			    BossHp -= 2;
			}
		    }
		    else
		    {
			if (charge == 1)
			{
			    delay (1000);
			    q.println ("CHARGED AMMO!");
			    delay (1000);
			    q.println ("DAMMAGE: 2");
			    BossHp -= 2;
			    charge = 0;
			}
			else
			{
			    delay (1000);
			    q.println ("DAMMAGE: 1");
			    BossHp--;
			}
		    }
		}
		else
		{
		    if (charge == 1)
		    {
			delay (1000);
			q.println ("CHARGED AMMO!");
			delay (1000);
			q.println ("CONDITION: MISS!");
			charge = 0;
		    }
		    else
		    {
			delay (1000);
			q.println ("CONDITION: MISS!");
		    }
		}
	    }
	    //Reload
	    else if (user == (int) 82 || user == (int) 114)
	    {
		reload = 6;
		q.println ("[RELOAD]");
	    }
	    //Charge
	    else if (user == (int) 67 || user == (int) 99)
	    {
		charge = 1;
		q.println ("[CHARGING AMMO]");
	    }
	    //Take cover
	    else if (user == (int) 84 || user == (int) 116)
	    {
		taking = 1;
		q.println ("[TAKING FIRE!]");
	    }
	    //Escape
	    else
	    {
		escape = (int) (Math.random () * 20 + 1);
		escapeFrom = (int) (Math.random () * 20 + 1);
		delay (1000);
		p.println ("YOUR ROLL: " + escape);
		delay (1000);
		p.println ("OPPONENT'S ROLL: " + escapeFrom);

		if (escape > escapeFrom)
		{
		    delay (1000);
		    p.println ("YOU HAVE ESCAPED!");
		    HP--;
		    BossHp = 0;
		    p.println ("[-1 Hp]");
		}
		else
		{
		    delay (1000);
		    p.println ("YOU COULDN'T ESCAPE!");
		    HP -= 3;
		    p.println ("[-3 Hp]");
		}
	    }

	    if (BossHp > 0)
	    {
		p.println ("________________________________________________________________________________");
		if (Creed == 1)
		    p.println ("<LOFUS OFFICER>");
		else
		    p.println ("<CREED MEMBER>");

		p.println ("AC: " + BossAC);
		p.println ("Hp: " + BossHp);


		BossAttack = (int) (Math.random () * 2);

		p.println ("ACTION: ATTACK");

		if (BossAttack == 0)
		{
		    Hit = (int) (Math.random () * 20) + 1;

		    p.println ("SKILL: SHOOT");

		    if (Hit >= Ac)
		    {
			int bossDamageSkill1 = (int) (Math.random () * 5 + 2);

			p.println ("CONDITION: HIT!");
			if (taking == 1)
			{
			    bossDamageSkill1 = (int) (bossDamageSkill1 / 2);
			    p.println ("[REDUCED BY TAKING COVER]");
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    taking = 0;
			    HP -= bossDamageSkill1;
			}
			else
			{
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    HP -= bossDamageSkill1;
			}
		    }
		    else
		    {
			taking = 0;
			p.println ("CONDITION: MISS!");
		    }
		}
		else
		{
		    p.println ("SKILL: TACKLE");
		    p.println ("CONDITION: HIT!");
		    p.println ("DAMAGE: 1");
		    taking = 0;
		    HP--;
		}
	    }

	    if (BossHp < 1)
	    {
		p.println ();
		p.println ("YOU SURVIVED!");
	    }

	    //continue button
	    p.println ();
	    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	    user = p.getChar ();
	    do
	    {
		if (!(user == (int) 10))
		{
		    p.println ("<ERROR>");
		    user = p.getChar ();
		}
	    }
	    while (!(user == (int) 10));

	    q.clear ();
	    p.clear ();
	    if (BossHp > 0 && HP > 0)
	    {
		p.println ("BATTLE");
		p.println ();
	    }

	    delay (1000);
	}


	while (BossHp > 0 && HP > 0);


	if (BossHp <= 0)
	{
	    p.setColor (Color.black);
	    p.fillRect (10, 50, 620, 400);
	    p.setColor (Color.white);
	    Font font5 = new Font ("Old English Text MT", Font.PLAIN, 50);
	    p.setFont (font5);
	    p.drawString ("VICTORY!", 170, 250);
	}


	delay (10000);

	return HP;
    }


    //battle cain
    public static int BattleCain (int Creed, int Ac, int HP, int Dam1, int Dam2, int Dam3)
    {
	char user = ' ';
	int charge = 0;
	int reload = 6;
	int Hit = 0;
	int taking = 0;
	int escape = 0;
	int escapeFrom = 0;
	int nextMove = 0;
	int BossAttack = 0;
	int BossAC = (int) (Math.random () * 5 + 14);
	int BossHp = (int) (Math.random () * 4 + 3);

	p.println ("BATTLE");
	p.println ();
	do
	{
	    p.println ("<OFFICER CAIN>");
	    p.println ("AC: " + BossAC);
	    p.println ("Hp: " + BossHp);
	    p.println ("________________________________________________________________________________");
	    p.println ("<INSPECTOR>");
	    p.println ("AC: " + Ac);
	    p.println ("Hp: " + HP);
	    p.println ("PRESS KEY TO ACT");

	    if (reload == 6 && charge == 0)
	    {
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload == 6 && charge != 0)
	    {
		p.println ("'A': ATTACK. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload < 6 && reload > 0 && charge == 0)
	    {
		p.println ("'A': ATTACK. 'R': RELOAD. 'C': CHARGE. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload < 6 && reload > 0 && charge != 0)
	    {
		p.println ("'A': ATTACK. 'R': RELOAD. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else
	    {
		p.println ("[OUT OF AMMO!]");
		p.println ("'R': RELOAD. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    p.println ("________________________________________________________________________________");

	    //Attack
	    if (user == (int) 65 || user == (int) 97)
	    {
		reload--;
		Hit = (int) (Math.random () * 20) + 1;

		q.println ("ROULETTE");
		delay (1000);
		q.println ("CHANCE: [" + Hit + "]");

		if (Hit >= BossAC)
		{
		    delay (1000);
		    q.println ("CONDITION: HIT!");

		    Dam1 = (int) (Math.random () * 2) + 1;
		    Dam2 = (int) (Math.random () * 2) + 1;
		    Dam3 = (int) (Math.random () * 2) + 1;

		    delay (1000);
		    q.println ("DAMAGE CHANCE: [" + Dam1 + "] " + " [" + Dam2 + "] " + " [" + Dam3 + "]");

		    if (Dam1 == Dam2 && Dam1 == Dam3)
		    {
			if (charge == 1)
			{
			    delay (1000);
			    q.println ("CHARGED AMMO!");
			    delay (1000);
			    q.println ("HEADSHOT!");
			    delay (500);
			    q.println ("DAMMAGE: 3");
			    BossHp -= 3;
			    charge = 0;
			}
			else
			{
			    delay (1000);
			    q.println ("HEADSHOT!");
			    delay (500);
			    q.println ("DAMMAGE: 2");
			    BossHp -= 2;
			}
		    }
		    else
		    {
			if (charge == 1)
			{
			    delay (1000);
			    q.println ("CHARGED AMMO!");
			    delay (1000);
			    q.println ("DAMMAGE: 2");
			    BossHp -= 2;
			    charge = 0;
			}
			else
			{
			    delay (1000);
			    q.println ("DAMMAGE: 1");
			    BossHp--;
			}
		    }
		}
		else
		{
		    if (charge == 1)
		    {
			delay (1000);
			q.println ("CHARGED AMMO!");
			delay (1000);
			q.println ("CONDITION: MISS!");
			charge = 0;
		    }
		    else
		    {
			delay (1000);
			q.println ("CONDITION: MISS!");
		    }
		}
	    }
	    //Reload
	    else if (user == (int) 82 || user == (int) 114)
	    {
		reload = 6;
		q.println ("[RELOAD]");
	    }
	    //Charge
	    else if (user == (int) 67 || user == (int) 99)
	    {
		charge = 1;
		q.println ("[CHARGING AMMO]");
	    }
	    //Take cover
	    else if (user == (int) 84 || user == (int) 116)
	    {
		taking = 1;
		q.println ("[TAKING FIRE!]");
	    }
	    //Escape
	    else
	    {
		escape = (int) (Math.random () * 20 + 1);
		escapeFrom = (int) (Math.random () * 20 + 1);
		delay (1000);
		p.println ("YOUR ROLL: " + escape);
		delay (1000);
		p.println ("OPPONENT'S ROLL: " + escapeFrom);

		if (escape > escapeFrom)
		{
		    delay (1000);
		    p.println ("YOU HAVE ESCAPED!");
		    HP--;
		    BossHp = 0;
		    p.println ("[-1 Hp]");
		}
		else
		{
		    delay (1000);
		    p.println ("YOU COULDN'T ESCAPE!");
		    HP -= 3;
		    p.println ("[-3 Hp]");
		}
	    }

	    if (BossHp > 0)
	    {
		p.println ("________________________________________________________________________________");
		p.println ("<OFFICER CAIN>");
		p.println ("AC: " + BossAC);
		p.println ("Hp: " + BossHp);


		BossAttack = (int) (Math.random () * 2);

		p.println ("ACTION: ATTACK");

		if (BossAttack == 0)
		{
		    Hit = (int) (Math.random () * 20) + 1;

		    p.println ("SKILL: SHOOT");

		    if (Hit >= Ac)
		    {
			int bossDamageSkill1 = (int) (Math.random () * 5 + 2);

			p.println ("CONDITION: HIT!");
			if (taking == 1)
			{
			    bossDamageSkill1 = (int) (bossDamageSkill1 / 2);
			    p.println ("[REDUCED BY TAKING COVER]");
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    taking = 0;
			    HP -= bossDamageSkill1;
			}
			else
			{
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    HP -= bossDamageSkill1;
			}
		    }
		    else
		    {
			taking = 0;
			p.println ("CONDITION: MISS!");
		    }
		}
		else
		{
		    p.println ("SKILL: TACKLE");
		    p.println ("CONDITION: HIT!");
		    p.println ("DAMAGE: 1");
		    taking = 0;
		    HP--;
		}
	    }

	    if (BossHp < 1)
	    {
		p.println ();
		p.println ("YOU SURVIVED!");
	    }

	    //continue button
	    p.println ();
	    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	    user = p.getChar ();
	    do
	    {
		if (!(user == (int) 10))
		{
		    p.println ("<ERROR>");
		    user = p.getChar ();
		}
	    }
	    while (!(user == (int) 10));

	    q.clear ();
	    p.clear ();
	    if (BossHp > 0 && HP > 0)
	    {
		p.println ("BATTLE");
		p.println ();
	    }

	    delay (1000);
	}


	while (BossHp > 0 && HP > 0);


	if (BossHp <= 0)
	{
	    p.setColor (Color.black);
	    p.fillRect (10, 50, 620, 400);
	    p.setColor (Color.white);
	    Font font5 = new Font ("Old English Text MT", Font.PLAIN, 50);
	    p.setFont (font5);
	    p.drawString ("VICTORY!", 170, 250);
	}


	delay (10000);

	return HP;
    }


    //battle shadow
    public static int BattleShadow (int Creed, int Ac, int HP, int Dam1, int Dam2, int Dam3)
    {
	char user = ' ';
	int charge = 0;
	int reload = 6;
	int Hit = 0;
	int taking = 0;
	int escape = 0;
	int escapeFrom = 0;
	int nextMove = 0;
	int BossAttack = 0;
	int BossAC = (int) (Math.random () * 5 + 14);
	int BossHp = (int) (Math.random () * 4 + 3);

	p.println ("BATTLE");
	p.println ();
	do
	{
	    p.println ("<SHADOW STARS>");
	    p.println ("AC: " + BossAC);
	    p.println ("Hp: " + BossHp);
	    p.println ("________________________________________________________________________________");
	    p.println ("<INSPECTOR>");
	    p.println ("AC: " + Ac);
	    p.println ("Hp: " + HP);
	    p.println ("PRESS KEY TO ACT");

	    if (reload == 6 && charge == 0)
	    {
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload == 6 && charge != 0)
	    {
		p.println ("'A': ATTACK. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload < 6 && reload > 0 && charge == 0)
	    {
		p.println ("'A': ATTACK. 'R': RELOAD. 'C': CHARGE. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 67 || user == (int) 99 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else if (reload < 6 && reload > 0 && charge != 0)
	    {
		p.println ("'A': ATTACK. 'R': RELOAD. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    else
	    {
		p.println ("[OUT OF AMMO!]");
		p.println ("'R': RELOAD. 'T': TAKE COVER. 'E': ESCAPE");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116 || user == (int) 69 || user == (int) 101));
	    }
	    p.println ("________________________________________________________________________________");

	    //Attack
	    if (user == (int) 65 || user == (int) 97)
	    {
		reload--;
		Hit = (int) (Math.random () * 20) + 1;

		q.println ("ROULETTE");
		delay (1000);
		q.println ("CHANCE: [" + Hit + "]");

		if (Hit >= BossAC)
		{
		    delay (1000);
		    q.println ("CONDITION: HIT!");

		    Dam1 = (int) (Math.random () * 2) + 1;
		    Dam2 = (int) (Math.random () * 2) + 1;
		    Dam3 = (int) (Math.random () * 2) + 1;

		    delay (1000);
		    q.println ("DAMAGE CHANCE: [" + Dam1 + "] " + " [" + Dam2 + "] " + " [" + Dam3 + "]");

		    if (Dam1 == Dam2 && Dam1 == Dam3)
		    {
			if (charge == 1)
			{
			    delay (1000);
			    q.println ("CHARGED AMMO!");
			    delay (1000);
			    q.println ("HEADSHOT!");
			    delay (500);
			    q.println ("DAMMAGE: 3");
			    BossHp -= 3;
			    charge = 0;
			}
			else
			{
			    delay (1000);
			    q.println ("HEADSHOT!");
			    delay (500);
			    q.println ("DAMMAGE: 2");
			    BossHp -= 2;
			}
		    }
		    else
		    {
			if (charge == 1)
			{
			    delay (1000);
			    q.println ("CHARGED AMMO!");
			    delay (1000);
			    q.println ("DAMMAGE: 2");
			    BossHp -= 2;
			    charge = 0;
			}
			else
			{
			    delay (1000);
			    q.println ("DAMMAGE: 1");
			    BossHp--;
			}
		    }
		}
		else
		{
		    if (charge == 1)
		    {
			delay (1000);
			q.println ("CHARGED AMMO!");
			delay (1000);
			q.println ("CONDITION: MISS!");
			charge = 0;
		    }
		    else
		    {
			delay (1000);
			q.println ("CONDITION: MISS!");
		    }
		}
	    }
	    //Reload
	    else if (user == (int) 82 || user == (int) 114)
	    {
		reload = 6;
		q.println ("[RELOAD]");
	    }
	    //Charge
	    else if (user == (int) 67 || user == (int) 99)
	    {
		charge = 1;
		q.println ("[CHARGING AMMO]");
	    }
	    //Take cover
	    else if (user == (int) 84 || user == (int) 116)
	    {
		taking = 1;
		q.println ("[TAKING FIRE!]");
	    }
	    //Escape
	    else
	    {
		escape = (int) (Math.random () * 20 + 1);
		escapeFrom = (int) (Math.random () * 20 + 1);
		delay (1000);
		p.println ("YOUR ROLL: " + escape);
		delay (1000);
		p.println ("OPPONENT'S ROLL: " + escapeFrom);

		if (escape > escapeFrom)
		{
		    delay (1000);
		    p.println ("YOU HAVE ESCAPED!");
		    HP--;
		    BossHp = 0;
		    p.println ("[-1 Hp]");
		}
		else
		{
		    delay (1000);
		    p.println ("YOU COULDN'T ESCAPE!");
		    HP -= 3;
		    p.println ("[-3 Hp]");
		}
	    }

	    if (BossHp > 0)
	    {
		p.println ("________________________________________________________________________________");
		p.println ("<SHADOW STARS>");
		p.println ("AC: " + BossAC);
		p.println ("Hp: " + BossHp);


		BossAttack = (int) (Math.random () * 2);

		p.println ("ACTION: ATTACK");

		if (BossAttack == 0)
		{
		    Hit = (int) (Math.random () * 20) + 1;

		    p.println ("SKILL: SHOOT");

		    if (Hit >= Ac)
		    {
			int bossDamageSkill1 = (int) (Math.random () * 5 + 2);

			p.println ("CONDITION: HIT!");
			if (taking == 1)
			{
			    bossDamageSkill1 = (int) (bossDamageSkill1 / 2);
			    p.println ("[REDUCED BY TAKING COVER]");
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    taking = 0;
			    HP -= bossDamageSkill1;
			}
			else
			{
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    HP -= bossDamageSkill1;
			}
		    }
		    else
		    {
			taking = 0;
			p.println ("CONDITION: MISS!");
		    }
		}
		else
		{
		    p.println ("SKILL: TACKLE");
		    p.println ("CONDITION: HIT!");
		    p.println ("DAMAGE: 1");
		    taking = 0;
		    HP--;
		}
	    }

	    if (BossHp < 1)
	    {
		p.println ();
		p.println ("YOU SURVIVED!");
	    }

	    //continue button
	    p.println ();
	    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	    user = p.getChar ();
	    do
	    {
		if (!(user == (int) 10))
		{
		    p.println ("<ERROR>");
		    user = p.getChar ();
		}
	    }
	    while (!(user == (int) 10));

	    q.clear ();
	    p.clear ();
	    if (BossHp > 0 && HP > 0)
	    {
		p.println ("BATTLE");
		p.println ();
	    }

	    delay (1000);
	}


	while (BossHp > 0 && HP > 0);


	if (BossHp <= 0)
	{
	    p.setColor (Color.black);
	    p.fillRect (10, 50, 620, 400);
	    p.setColor (Color.white);
	    Font font5 = new Font ("Old English Text MT", Font.PLAIN, 50);
	    p.setFont (font5);
	    p.drawString ("VICTORY!", 170, 250);
	}


	delay (10000);

	return HP;
    }


    //battle Matilda
    public static int BattleMatilda (int Creed, int Ac, int HP, int Dam1, int Dam2, int Dam3, int lT, int f, int o)
    {
	char user = ' ';
	int reload = 6;
	int Hit = 0;
	int taking = 0;
	int nextMove = 0;
	int BossAttack = 0;
	int BossAC = 20;
	int BossHp = 1;
	int finisher = 0;
	int saves = lT + f + o;

	p.println ("BATTLE");
	p.println ();
	p.println ("<MATILDA VALERIE>");
	p.println ("AC: " + BossAC);
	p.println ("Hp: " + BossHp);
	p.println ("________________________________________________________________________________");
	p.println ("<INSPECTOR>");
	p.println ("AC: " + Ac);
	p.println ("Hp: " + HP);
	p.println ("PRESS KEY TO ACT");
	p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESCAPE");
	p.println ();
	p.println ("MATILDA VALERIE: I WON'T LET YOU WIN THAT EASILY.");
	delay (10000);

	HP = 1;
	Ac = 16;

	for (int i = 0 ; i < 22 ; i++)
	{
	    p.clear ();
	    p.println ("BATTLE");
	    p.println ();
	    p.println ("<MATILDA VALERIE>");
	    p.println ("AC: " + BossAC);
	    p.println ("Hp: " + BossHp);
	    p.println ("________________________________________________________________________________");
	    p.println ("<INSPECTOR>");
	    p.println ("AC: " + Ac);
	    p.println ("Hp: " + HP);
	    p.println ("PRESS KEY TO ACT");

	    if (i == 0)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESCAPE");
	    else if (i == 1)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESCAP");
	    else if (i == 2)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESCA");
	    else if (i == 3)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESC");
	    else if (i == 4)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ES");
	    else if (i == 5)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' E");
	    else if (i == 6)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E'");
	    else if (i == 7)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E");
	    else if (i == 8)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. '");
	    else if (i == 9)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER.");
	    else if (i == 10)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER");
	    else if (i == 11)
		p.println ("'A': ATTACK. 'C': CHARGE 'T': TAKE COVER");
	    else if (i == 12)
		p.println ("'A': ATTACK. 'C': CHARG 'T': TAKE COVER");
	    else if (i == 13)
		p.println ("'A': ATTACK. 'C': CHAR 'T': TAKE COVER");
	    else if (i == 14)
		p.println ("'A': ATTACK. 'C': CHA 'T': TAKE COVER");
	    else if (i == 15)
		p.println ("'A': ATTACK. 'C': CH 'T': TAKE COVER");
	    else if (i == 16)
		p.println ("'A': ATTACK. 'C': C 'T': TAKE COVER");
	    else if (i == 17)
		p.println ("'A': ATTACK. 'C': 'T': TAKE COVER");
	    else if (i == 18)
		p.println ("'A': ATTACK. 'C' 'T': TAKE COVER");
	    else if (i == 19)
		p.println ("'A': ATTACK. 'C 'T': TAKE COVER");
	    else if (i == 20)
		p.println ("'A': ATTACK. ' 'T': TAKE COVER");
	    else if (i == 21)
		p.println ("'A': ATTACK.  'T': TAKE COVER");
	    else
		p.println ("'A': ATTACK. 'T': TAKE COVER");

	    delay (900);
	}


	p.println ();
	p.println ("MATILDA VALERIE: GOOD. NOW SHOW ME WHAT YOU CAN DO!");

	//continue button
	p.println ();
	p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	user = p.getChar ();
	do
	{
	    if (!(user == (int) 10))
	    {
		p.println ("<ERROR>");
		user = p.getChar ();
	    }
	}


	while (!(user == (int) 10));

	p.clear ();

	p.println ("BATTLE");
	p.println ();
	do
	{
	    p.println ("<MATILDA VALERIE>");
	    p.println ("AC: " + BossAC);
	    p.println ("Hp: " + BossHp);
	    p.println ("________________________________________________________________________________");
	    p.println ("<INSPECTOR>");
	    p.println ("AC: " + Ac);
	    p.println ("Hp: " + HP);
	    p.println ("PRESS KEY TO ACT");

	    if (reload == 6)
	    {
		p.println ("'A': ATTACK. 'T': TAKE COVER.");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116));
	    }
	    else if (reload < 6 && reload > 0)
	    {
		p.println ("'A': ATTACK. 'R': RELOAD. 'T': TAKE COVER.");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116));
	    }
	    else
	    {
		p.println ("[OUT OF AMMO!]");
		p.println ("'R': RELOAD. 'T': TAKE COVER.");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116));
	    }
	    p.println ("________________________________________________________________________________");

	    //Attack
	    if (user == (int) 65 || user == (int) 97)
	    {
		reload--;

		if (finisher == 10)
		    Hit = 20;
		else
		    Hit = (int) (Math.random () * 19) + 1;

		finisher++;

		q.println ("ROULETTE");
		delay (1000);
		q.println ("CHANCE: [" + Hit + "]");

		if (Hit >= BossAC)
		{
		    delay (1000);
		    q.println ("CONDITION: HIT!");

		    Dam1 = (int) (Math.random () * 2) + 1;
		    Dam2 = (int) (Math.random () * 2) + 1;
		    Dam3 = (int) (Math.random () * 2) + 1;

		    delay (1000);
		    q.println ("DAMAGE CHANCE: [" + Dam1 + "] " + " [" + Dam2 + "] " + " [" + Dam3 + "]");

		    if (Dam1 == Dam2 && Dam1 == Dam3)
		    {
			delay (1000);
			q.println ("HEADSHOT!");
			delay (500);
			q.println ("DAMMAGE: 2");
			BossHp -= 2;
		    }
		    else
		    {
			delay (1000);
			q.println ("DAMMAGE: 1");
			BossHp--;
		    }
		}
		else
		{
		    delay (1000);
		    q.println ("CONDITION: MISS!");
		}
	    }
	    //Reload
	    else if (user == (int) 82 || user == (int) 114)
	    {
		reload = 6;
		q.println ("[RELOAD]");
	    }
	    //Take cover
	    else
	    {
		taking = 1;
		q.println ("[TAKING FIRE!]");
	    }

	    if (BossHp > 0)
	    {
		p.println ("________________________________________________________________________________");
		p.println ("<MATILDA VALERIE>");
		p.println ("AC: " + BossAC);
		p.println ("Hp: " + BossHp);


		BossAttack = (int) (Math.random () * 2);

		p.println ("ACTION: ATTACK");

		if (BossAttack == 0)
		{
		    Hit = (int) (Math.random () * 20) + 1;

		    p.println ("SKILL: JUSTICE FIST");

		    if (Hit >= Ac)
		    {
			int bossDamageSkill1 = 8;

			p.println ("CONDITION: HIT!");
			if (taking == 1)
			{
			    bossDamageSkill1 = (int) (bossDamageSkill1 / 2);
			    p.println ("[REDUCED BY TAKING COVER]");
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    taking = 0;
			    HP -= bossDamageSkill1;
			}
			else
			{
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    HP -= bossDamageSkill1;
			}
		    }
		    else
		    {
			p.println ("CONDITION: MISS!");
		    }
		}
		else
		{
		    p.println ("SKILL: EXTREME KICK");
		    p.println ("CONDITION: HIT!");
		    p.println ("DAMAGE: 3");
		    HP -= 3;
		}
	    }

	    if (BossHp < 1)
	    {
		p.println ();
		p.println ("YOU SURVIVED!");
	    }

	    //continue button
	    p.println ();
	    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	    user = p.getChar ();
	    do
	    {
		if (!(user == (int) 10))
		{
		    p.println ("<ERROR>");
		    user = p.getChar ();
		}
	    }
	    while (!(user == (int) 10));
	    p.clear ();

	    c.println ();
	    if (HP < 1)
	    {
		HP = 0;
		if (saves == 3)
		{
		    if (lT == 1)
		    {
			HP += 4;
			lT = 0;
			finisher = 10;

			c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, A POWERFUL");
			c.println ("WIND BLOWS AND PUSHES HER AWAY. YOU FELT A BURNING SENSATION INSIDE YOUR POCKET.");
			c.println ();
			c.println ("GAME MASTER: THE LUCKY TOKEN THAT MARIUSZ KWASEK, THE IMMIGRANT WHO HAD TO GET");
			c.println ("A JOB INTERVIEW, GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		    else if (f == 1)
		    {
			HP += 4;
			f = 0;
			finisher = 10;

			c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN AND ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, A POWERFUL");
			c.println ("ENERGY COVERS MATILDA'S EYES AND GIVES YOU TIME TO STAND UP.");
			c.println ();
			c.println ("GAME MASTER: YOU REALISED THAT THE FLOWER THAT AERITH, THE IMMIGRANT WHO WAS");
			c.println ("RUNNING AWAY FROM \"SHINRA,\" GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		    else if (o == 1)
		    {
			HP += 4;
			o = 0;
			finisher = 10;

			c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN AND ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, OFFICER CAIN");
			c.println ("JUMPS HER FROM BEHIND AND TRIES TO KEEP HER AT BAY. UNFORTUNATELY, IT ONLY TOOK");
			c.println ("HER A SECOND TO FLIP OFFICER CAIN OVER AND KNOCK HIM OUT.");
			c.println ();
			c.println ("GAME MASTER: THANKS TO OFFICER CAIN, YOU ARE GIVEN ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		}
		else if (saves == 2)
		{
		    if (lT == 1 && f == 1)
		    {
			if (lT == 1)
			{
			    HP += 4;
			    lT = 0;
			    finisher = 10;

			    c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, A POWERFUL");
			    c.println ("WIND BLOWS AND PUSHES HER AWAY. YOU FELT A BURNING SENSATION INSIDE YOUR POCKET.");
			    c.println ();
			    c.println ("GAME MASTER: THE LUCKY TOKEN THAT MARIUSZ KWASEK, THE IMMIGRANT WHO HAD TO GET");
			    c.println ("A JOB INTERVIEW, GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
			else if (f == 1)
			{
			    HP += 4;
			    f = 0;
			    finisher = 10;

			    c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN AND ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, A POWERFUL");
			    c.println ("ENERGY COVERS MATILDA'S EYES AND GIVES YOU TIME TO STAND UP.");
			    c.println ();
			    c.println ("GAME MASTER: YOU REALISED THAT THE FLOWER THAT AERITH, THE IMMIGRANT WHO WAS");
			    c.println ("RUNNING AWAY FROM \"SHINRA,\" GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
		    }
		    else if (lT == 1 && o == 1)
		    {
			if (lT == 1)
			{
			    HP += 4;
			    lT = 0;
			    c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, A POWERFUL");
			    c.println ("WIND BLOWS AND PUSHES HER AWAY. YOU FELT A BURNING SENSATION INSIDE YOUR POCKET.");
			    c.println ();
			    c.println ("GAME MASTER: THE LUCKY TOKEN THAT MARIUSZ KWASEK, THE IMMIGRANT WHO HAD TO GET");
			    c.println ("A JOB INTERVIEW, GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
			else if (o == 1)
			{
			    HP += 4;
			    o = 0;
			    finisher = 10;

			    c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN AND ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, OFFICER CAIN");
			    c.println ("JUMPS HER FROM BEHIND AND TRIES TO KEEP HER AT BAY. UNFORTUNATELY, IT ONLY TOOK");
			    c.println ("HER A SECOND TO FLIP OFFICER CAIN OVER AND KNOCK HIM OUT.");
			    c.println ();
			    c.println ("GAME MASTER: THANKS TO OFFICER CAIN, YOU ARE GIVEN ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
		    }
		    else if (f == 1 && o == 1)
		    {
			if (f == 1)
			{
			    HP += 4;
			    f = 0;
			    finisher = 10;

			    c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN AND ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, A POWERFUL");
			    c.println ("ENERGY COVERS MATILDA'S EYES AND GIVES YOU TIME TO STAND UP.");
			    c.println ();
			    c.println ("GAME MASTER: YOU REALISED THAT THE FLOWER THAT AERITH, THE IMMIGRANT WHO WAS");
			    c.println ("RUNNING AWAY FROM \"SHINRA,\" GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
			else if (o == 1)
			{
			    HP += 4;
			    o = 0;
			    finisher = 10;

			    c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN AND ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, OFFICER CAIN");
			    c.println ("JUMPS HER FROM BEHIND AND TRIES TO KEEP HER AT BAY. UNFORTUNATELY, IT ONLY TOOK");
			    c.println ("HER A SECOND TO FLIP OFFICER CAIN OVER AND KNOCK HIM OUT.");
			    c.println ();
			    c.println ("GAME MASTER: THANKS TO OFFICER CAIN, YOU ARE GIVEN ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
		    }
		}
		else if (saves == 1)
		{
		    if (lT == 1)
		    {
			HP += 4;
			lT = 0;
			finisher = 10;

			c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, A POWERFUL");
			c.println ("WIND BLOWS AND PUSHES HER AWAY. YOU FELT A BURNING SENSATION INSIDE YOUR POCKET.");
			c.println ();
			c.println ("GAME MASTER: THE LUCKY TOKEN THAT MARIUSZ KWASEK, THE IMMIGRANT WHO HAD TO GET");
			c.println ("A JOB INTERVIEW, GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		    else if (f == 1)
		    {
			HP += 4;
			f = 0;
			finisher = 10;

			c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN AND ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, A POWERFUL");
			c.println ("ENERGY COVERS MATILDA'S EYES AND GIVES YOU TIME TO STAND UP.");
			c.println ();
			c.println ("GAME MASTER: YOU REALISED THAT THE FLOWER THAT AERITH, THE IMMIGRANT WHO WAS");
			c.println ("RUNNING AWAY FROM \"SHINRA,\" GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		    else if (o == 1)
		    {
			HP += 4;
			o = 0;
			finisher = 10;

			c.println ("GAME MASTER: MATILDA STRIKES YOU DOWN AND ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE SHE KILLS YOU WITH HER FINISHING ATTACK, OFFICER CAIN");
			c.println ("JUMPS HER FROM BEHIND AND TRIES TO KEEP HER AT BAY. UNFORTUNATELY, IT ONLY TOOK");
			c.println ("HER A SECOND TO FLIP OFFICER CAIN OVER AND KNOCK HIM OUT.");
			c.println ();
			c.println ("GAME MASTER: THANKS TO OFFICER CAIN, YOU ARE GIVEN ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		}
		else
		{
		    HP = 1;
		    finisher = 10;
		    c.println ("GAME MASTER: MATILDA ACCIDENTALLY FELL.");

		    //continue button
		    p.println ();
		    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
		    user = p.getChar ();
		    do
		    {
			if (!(user == (int) 10))
			{
			    p.println ("<ERROR>");
			    user = p.getChar ();
			}
		    }
		    while (!(user == (int) 10));
		    p.clear ();
		}
	    }

	    q.clear ();
	    if (BossHp > 0 && HP > 0)
	    {
		p.println ("BATTLE");
		p.println ();
	    }

	    delay (1000);
	}
	while (BossHp > 0 && HP > 0);


	if (BossHp <= 0)
	{
	    p.setColor (Color.black);
	    p.fillRect (10, 50, 620, 400);
	    p.setColor (Color.white);
	    Font font5 = new Font ("Old English Text MT", Font.PLAIN, 50);
	    p.setFont (font5);
	    p.drawString ("VICTORY?", 170, 250);
	}


	delay (3000);

	return HP;
    }


    //battle General
    public static int BattleGeneral (int Creed, int Ac, int HP, int Dam1, int Dam2, int Dam3, int lT, int f, int o)
    {
	char user = ' ';
	int reload = 6;
	int Hit = 0;
	int taking = 0;
	int nextMove = 0;
	int BossAttack = 0;
	int BossAC = 20;
	int BossHp = 1;
	int finisher = 0;
	int saves = lT + f + o;

	p.println ("BATTLE");
	p.println ();
	p.println ("<GENERAL>");
	p.println ("AC: 20");
	p.println ("Hp: 1");
	p.println ("________________________________________________________________________________");
	p.println ("<INSPECTOR>");
	p.println ("AC: " + Ac);
	p.println ("Hp: " + HP);
	p.println ("PRESS KEY TO ACT");
	p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESCAPE");
	p.println ();
	p.println ("GENERAL: WHAT THE HECK IS WRONG WITH YOUR HEALTH AND ARMOUR CLASS?!");
	p.println ();
	p.println ("GENERAL: AN ESCAPE AND CHARGING OPTION AS WELL?! OHNONONO, NOT IF I HAVE");
	p.println ("ANYTHING TO SAY ABOUT IT!... AND I DO!");
	delay (10000);

	HP = 1;
	Ac = 16;

	for (int i = 0 ; i < 22 ; i++)
	{
	    p.clear ();
	    p.println ("BATTLE");
	    p.println ();
	    p.println ("<GENERAL>");
	    p.println ("AC: 20");
	    p.println ("Hp: 1");
	    p.println ("________________________________________________________________________________");
	    p.println ("<INSPECTOR>");
	    p.println ("AC: " + Ac);
	    p.println ("Hp: " + HP);
	    p.println ("PRESS KEY TO ACT");

	    if (i == 0)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESCAPE");
	    else if (i == 1)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESCAP");
	    else if (i == 2)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESCA");
	    else if (i == 3)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ESC");
	    else if (i == 4)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' ES");
	    else if (i == 5)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E' E");
	    else if (i == 6)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E'");
	    else if (i == 7)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. 'E");
	    else if (i == 8)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER. '");
	    else if (i == 9)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER.");
	    else if (i == 10)
		p.println ("'A': ATTACK. 'C': CHARGE. 'T': TAKE COVER");
	    else if (i == 11)
		p.println ("'A': ATTACK. 'C': CHARGE 'T': TAKE COVER");
	    else if (i == 12)
		p.println ("'A': ATTACK. 'C': CHARG 'T': TAKE COVER");
	    else if (i == 13)
		p.println ("'A': ATTACK. 'C': CHAR 'T': TAKE COVER");
	    else if (i == 14)
		p.println ("'A': ATTACK. 'C': CHA 'T': TAKE COVER");
	    else if (i == 15)
		p.println ("'A': ATTACK. 'C': CH 'T': TAKE COVER");
	    else if (i == 16)
		p.println ("'A': ATTACK. 'C': C 'T': TAKE COVER");
	    else if (i == 17)
		p.println ("'A': ATTACK. 'C': 'T': TAKE COVER");
	    else if (i == 18)
		p.println ("'A': ATTACK. 'C' 'T': TAKE COVER");
	    else if (i == 19)
		p.println ("'A': ATTACK. 'C 'T': TAKE COVER");
	    else if (i == 20)
		p.println ("'A': ATTACK. ' 'T': TAKE COVER");
	    else if (i == 21)
		p.println ("'A': ATTACK.  'T': TAKE COVER");
	    else
		p.println ("'A': ATTACK. 'T': TAKE COVER");

	    delay (900);
	}


	p.println ();
	p.println ("GENERAL: MUCH BETTER!... DON'T YA THINK?");

	//continue button
	p.println ();
	p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	user = p.getChar ();
	do
	{
	    if (!(user == (int) 10))
	    {
		p.println ("<ERROR>");
		user = p.getChar ();
	    }
	}


	while (!(user == (int) 10));

	p.clear ();

	p.println ("BATTLE");
	p.println ();
	do
	{
	    p.println ("<GENERAL>");
	    p.println ("AC: " + BossAC);
	    p.println ("Hp: " + BossHp);
	    p.println ("________________________________________________________________________________");
	    p.println ("<INSPECTOR>");
	    p.println ("AC: " + Ac);
	    p.println ("Hp: " + HP);
	    p.println ("PRESS KEY TO ACT");

	    if (reload == 6)
	    {
		p.println ("'A': ATTACK. 'T': TAKE COVER.");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 84 || user == (int) 116));
	    }
	    else if (reload < 6 && reload > 0)
	    {
		p.println ("'A': ATTACK. 'R': RELOAD. 'T': TAKE COVER.");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 65 || user == (int) 97 || user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116));
	    }
	    else
	    {
		p.println ("[OUT OF AMMO!]");
		p.println ("'R': RELOAD. 'T': TAKE COVER.");
		user = p.getChar ();
		do
		{
		    if (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116))
		    {
			p.println ("<ERROR>");
			user = p.getChar ();
		    }
		}
		while (!(user == (int) 82 || user == (int) 114 || user == (int) 84 || user == (int) 116));
	    }
	    p.println ("________________________________________________________________________________");

	    //Attack
	    if (user == (int) 65 || user == (int) 97)
	    {
		reload--;

		if (finisher == 10)
		    Hit = 20;
		else
		    Hit = (int) (Math.random () * 19) + 1;

		finisher++;

		q.println ("ROULETTE");
		delay (1000);
		q.println ("CHANCE: [" + Hit + "]");

		if (Hit >= BossAC)
		{
		    delay (1000);
		    q.println ("CONDITION: HIT!");

		    Dam1 = (int) (Math.random () * 2) + 1;
		    Dam2 = (int) (Math.random () * 2) + 1;
		    Dam3 = (int) (Math.random () * 2) + 1;

		    delay (1000);
		    q.println ("DAMAGE CHANCE: [" + Dam1 + "] " + " [" + Dam2 + "] " + " [" + Dam3 + "]");

		    if (Dam1 == Dam2 && Dam1 == Dam3)
		    {
			delay (1000);
			q.println ("HEADSHOT!");
			delay (500);
			q.println ("DAMMAGE: 2");
			BossHp -= 2;
		    }
		    else
		    {
			delay (1000);
			q.println ("DAMMAGE: 1");
			BossHp--;
		    }
		}
		else
		{
		    delay (1000);
		    q.println ("CONDITION: MISS!");
		}
	    }
	    //Reload
	    else if (user == (int) 82 || user == (int) 114)
	    {
		reload = 6;
		q.println ("[RELOAD]");
	    }
	    //Take cover
	    else
	    {
		taking = 1;
		q.println ("[TAKING FIRE!]");
	    }

	    if (BossHp > 0)
	    {
		p.println ("________________________________________________________________________________");
		p.println ("<GENERAL>");
		p.println ("AC: " + BossAC);
		p.println ("Hp: " + BossHp);


		BossAttack = (int) (Math.random () * 2);

		p.println ("ACTION: ATTACK");

		if (BossAttack == 0)
		{
		    Hit = (int) (Math.random () * 20) + 1;

		    p.println ("SKILL: JUSTICE FIST");

		    if (Hit >= Ac)
		    {
			int bossDamageSkill1 = 8;

			p.println ("CONDITION: HIT!");
			if (taking == 1)
			{
			    bossDamageSkill1 = (int) (bossDamageSkill1 / 2);
			    p.println ("[REDUCED BY TAKING COVER]");
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    taking = 0;
			    HP -= bossDamageSkill1;
			}
			else
			{
			    p.println ("DAMAGE: " + bossDamageSkill1);
			    HP -= bossDamageSkill1;
			}
		    }
		    else
		    {
			p.println ("CONDITION: MISS!");
		    }
		}
		else
		{
		    p.println ("SKILL: EXTREME KICK");
		    p.println ("CONDITION: HIT!");
		    p.println ("DAMAGE: 3");
		    HP -= 3;
		}
	    }

	    if (BossHp < 1)
	    {
		p.println ();
		p.println ("YOU SURVIVED!");
	    }

	    //continue button
	    p.println ();
	    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
	    user = p.getChar ();
	    do
	    {
		if (!(user == (int) 10))
		{
		    p.println ("<ERROR>");
		    user = p.getChar ();
		}
	    }
	    while (!(user == (int) 10));
	    p.clear ();

	    c.println ();
	    if (HP < 1)
	    {
		HP = 0;
		if (saves == 3)
		{
		    if (lT == 1)
		    {
			HP += 4;
			lT = 0;
			c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, A POWERFUL");
			c.println ("WIND BLOWS AND PUSHES HIM AWAY. YOU FELT A BURNING SENSATION INSIDE YOUR POCKET.");
			c.println ();
			c.println ("GAME MASTER: THE LUCKY TOKEN THAT MARIUSZ KWASEK, THE IMMIGRANT WHO HAD TO GET");
			c.println ("A JOB INTERVIEW, GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		    else if (f == 1)
		    {
			HP += 4;
			f = 0;
			c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN AND ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, A POWERFUL");
			c.println ("ENERGY COVERS GENERAL'S EYES AND GIVES YOU TIME TO STAND UP.");
			c.println ();
			c.println ("GAME MASTER: YOU REALISED THAT THE FLOWER THAT AERITH, THE IMMIGRANT WHO WAS");
			c.println ("RUNNING AWAY FROM \"SHINRA,\" GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		    else if (o == 1)
		    {
			HP += 4;
			o = 0;
			finisher = 10;

			c.println ();
			c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN AND ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, OFFICER CAIN");
			c.println ("JUMPS HIM FROM BEHIND AND TRIES TO KEEP HIM AT BAY. UNFORTUNATELY, IT ONLY TOOK");
			c.println ("HIM A SECOND TO FLIP OFFICER CAIN OVER AND KNOCK HIM OUT.");
			c.println ();
			c.println ("GAME MASTER: THANKS TO OFFICER CAIN, YOU ARE GIVEN ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		}
		else if (saves == 2)
		{
		    if (lT == 1 && f == 1)
		    {
			if (lT == 1)
			{
			    HP += 4;
			    lT = 0;
			    c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, A POWERFUL");
			    c.println ("WIND BLOWS AND PUSHES HIM AWAY. YOU FELT A BURNING SENSATION INSIDE YOUR POCKET.");
			    c.println ();
			    c.println ("GAME MASTER: THE LUCKY TOKEN THAT MARIUSZ KWASEK, THE IMMIGRANT WHO HAD TO GET");
			    c.println ("A JOB INTERVIEW, GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
			else if (f == 1)
			{
			    HP += 4;
			    f = 0;
			    finisher = 10;

			    c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN AND ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, A POWERFUL");
			    c.println ("ENERGY COVERS GENERAL'S EYES AND GIVES YOU TIME TO STAND UP.");
			    c.println ();
			    c.println ("GAME MASTER: YOU REALISED THAT THE FLOWER THAT AERITH, THE IMMIGRANT WHO WAS");
			    c.println ("RUNNING AWAY FROM \"SHINRA,\" GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
		    }
		    else if (lT == 1 && o == 1)
		    {
			if (lT == 1)
			{
			    HP += 4;
			    lT = 0;
			    c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, A POWERFUL");
			    c.println ("WIND BLOWS AND PUSHES HIM AWAY. YOU FELT A BURNING SENSATION INSIDE YOUR POCKET.");
			    c.println ();
			    c.println ("GAME MASTER: THE LUCKY TOKEN THAT MARIUSZ KWASEK, THE IMMIGRANT WHO HAD TO GET");
			    c.println ("A JOB INTERVIEW, GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
			else if (o == 1)
			{
			    HP += 4;
			    o = 0;
			    finisher = 10;

			    c.println ();
			    c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN AND ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, OFFICER CAIN");
			    c.println ("JUMPS HIM FROM BEHIND AND TRIES TO KEEP HIM AT BAY. UNFORTUNATELY, IT ONLY TOOK");
			    c.println ("HIM A SECOND TO FLIP OFFICER CAIN OVER AND KNOCK HIM OUT.");
			    c.println ();
			    c.println ("GAME MASTER: THANKS TO OFFICER CAIN, YOU ARE GIVEN ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
		    }
		    else if (f == 1 && o == 1)
		    {
			if (f == 1)
			{
			    HP += 4;
			    f = 0;
			    c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN AND ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, A POWERFUL");
			    c.println ("ENERGY COVERS GENERAL'S EYES AND GIVES YOU TIME TO STAND UP.");
			    c.println ();
			    c.println ("GAME MASTER: YOU REALISED THAT THE FLOWER THAT AERITH, THE IMMIGRANT WHO WAS");
			    c.println ("RUNNING AWAY FROM \"SHINRA,\" GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
			else if (o == 1)
			{
			    HP += 4;
			    o = 0;
			    finisher = 10;

			    c.println ();
			    c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN AND ONTO THE FLOOR.");
			    c.println ();
			    c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, OFFICER CAIN");
			    c.println ("JUMPS HIM FROM BEHIND AND TRIES TO KEEP HIM AT BAY. UNFORTUNATELY, IT ONLY TOOK");
			    c.println ("HIM A SECOND TO FLIP OFFICER CAIN OVER AND KNOCK HIM OUT.");
			    c.println ();
			    c.println ("GAME MASTER: THANKS TO OFFICER CAIN, YOU ARE GIVEN ANOTHER CHANCE.");

			    //continue button
			    p.println ();
			    p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			    user = p.getChar ();
			    do
			    {
				if (!(user == (int) 10))
				{
				    p.println ("<ERROR>");
				    user = p.getChar ();
				}
			    }
			    while (!(user == (int) 10));
			    p.clear ();
			}
		    }
		}
		else if (saves == 1)
		{
		    if (lT == 1)
		    {
			HP += 4;
			lT = 0;
			finisher = 10;

			c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, A POWERFUL");
			c.println ("WIND BLOWS AND PUSHES HIM AWAY. YOU FELT A BURNING SENSATION INSIDE YOUR POCKET.");
			c.println ();
			c.println ("GAME MASTER: THE LUCKY TOKEN THAT MARIUSZ KWASEK, THE IMMIGRANT WHO HAD TO GET");
			c.println ("A JOB INTERVIEW, GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		    else if (f == 1)
		    {
			HP += 4;
			f = 0;
			finisher = 10;

			c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN AND ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, A POWERFUL");
			c.println ("ENERGY COVERS GENERAL'S EYES AND GIVES YOU TIME TO STAND UP.");
			c.println ();
			c.println ("GAME MASTER: YOU REALISED THAT THE FLOWER THAT AERITH, THE IMMIGRANT WHO WAS");
			c.println ("RUNNING AWAY FROM \"SHINRA,\" GAVE YOU HAS GIVEN YOU ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		    else if (o == 1)
		    {
			HP += 4;
			o = 0;
			finisher = 10;

			c.println ();
			c.println ("GAME MASTER: GENERAL STRIKES YOU DOWN AND ONTO THE FLOOR.");
			c.println ();
			c.println ("GAME MASTER: BUT BEFORE HE KILLS YOU WITH HIS FINISHING ATTACK, OFFICER CAIN");
			c.println ("JUMPS HIM FROM BEHIND AND TRIES TO KEEP HIM AT BAY. UNFORTUNATELY, IT ONLY TOOK");
			c.println ("HIM A SECOND TO FLIP OFFICER CAIN OVER AND KNOCK HIM OUT.");
			c.println ();
			c.println ("GAME MASTER: THANKS TO OFFICER CAIN, YOU ARE GIVEN ANOTHER CHANCE.");

			//continue button
			p.println ();
			p.println ("PLEASE PRESS THE \"ENTER\" KEY TO CONTINUE");
			user = p.getChar ();
			do
			{
			    if (!(user == (int) 10))
			    {
				p.println ("<ERROR>");
				user = p.getChar ();
			    }
			}
			while (!(user == (int) 10));
			p.clear ();
		    }
		}
		else
		{
		}
	    }

	    q.clear ();
	    if (BossHp > 0 && HP > 0)
	    {
		p.println ("BATTLE");
		p.println ();
	    }

	    delay (1000);
	}


	while (BossHp > 0 && HP > 0);


	if (BossHp <= 0)
	{
	    p.setColor (Color.black);
	    p.fillRect (10, 50, 620, 400);
	    p.setColor (Color.white);
	    Font font5 = new Font ("Old English Text MT", Font.PLAIN, 50);
	    p.setFont (font5);
	    p.drawString ("VICTORY?", 170, 250);
	}


	delay (3000);

	return HP;
    }


    //ending
    public static void ending ()
    {
	c.clear ();
	d.clear ();
	e.clear ();
	f.clear ();
	g.clear ();
	h.clear ();
	j.clear ();
	k.clear ();
	l.clear ();
	m.clear ();
	n.clear ();
	o.clear ();
	p.clear ();
	q.clear ();
	r.clear ();

	c.setColor (Color.black);
	c.fillRect (10, 50, 620, 400);
	c.setColor (Color.white);
	Font fontEnding = new Font ("Old English Text MT", Font.PLAIN, 50);
	c.setFont (fontEnding);
	c.drawString ("THE END", 180, 250);
    }
} // MainCulminating class



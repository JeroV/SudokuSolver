Êþº¾   2   Sudoku  java/lang/Object tabel LTable1; blokken [[[Z <init> ()V Code
   	 
  Table1
   	  (III)V	     	     LineNumberTable LocalVariableTable this LSudoku; 
checkKolom (LPunt1;I)Z
  !   Punt1 " # GetX ()I
  % & ' get (II)I p LPunt1; w I k i StackMapTable checkRij
  1 2 # GetY r nummerVierkant (LPunt1;)LPunt1;
  7 	 8 (II)V xt yt xb yb 	checkBlok
  ? 4 5 blok vulIn C java/util/Scanner	 E G F java/lang/System H I in Ljava/io/InputStream;
 B K 	 L (Ljava/io/InputStream;)V	 E N O P out Ljava/io/PrintStream; R Voer je sudoku in:
 T V U java/io/PrintStream W X println (Ljava/lang/String;)V
 B Z [ # nextInt
  ] ^  set sc Ljava/util/Scanner; x y blokje vierkant 
maakSudoku &(Ljava/lang/String;)Ljava/lang/String;
  h i j LosOp 
(LPunt1;)V s Ljava/lang/String;
  n  
  p / 
  r =  coord coordi Test w java/lang/Error y WUnresolved compilation problem: 
	Type mismatch: cannot convert from int[][] to Table1

 v { 	 X Test2
  
   A 

     toString ()Ljava/lang/String;
 T   X print
 T  W  (Z)V
 T  W  (I)V t l Test3 haha main ([Ljava/lang/String;)V
    
 args [Ljava/lang/String; 
SourceFile Sudoku.java !      
     
       	 
     U     *· » Y		· ³ 	Å ³ ±                              	            #*¶ =>§ ² ¶ $  ¬	¡ÿì¬              
    !     *    # ( )     # * +    , +    - +  .   	 ý 
 	 /           #*¶ 0=>§ ² ¶ $  ¬	¡ÿì¬              
    !     *    # ( )     # * +    3 +    - +  .   	 ý 
 	 4 5          &*¶ <*¶ 0=pdl>pdl6» Y· 6°           "  # 
 $  %  &    4    & ( )    ! 9 +  
  : +    ; +    < +  	 =      q     *¸ >M² ,¶ 02,¶ 2d3 ¬¬           *  +  ,          ( )      * +    @ )  .    ü   	 A 
    K     }» BY² D· JK² MQ¶ S<=>» Y· 6:6§ N*¶ Y<² ¶ \ÿ '» Y· 6:¸ >:² ¶ 02¶ 2T	  =Q¡ÿ±±       R    0  1  2  3  4  5 $ 6 * 7 / 8 8 9 ; : @ ; K < R = d ? g @ m A p B r 6 | F    H   r _ `    h , +   f a +   d b +  $ Y c )  ' U - +  K  d )  .    ÿ *  B   9 	 e f     <     » Y· 6¸ g°       
    I  J         k l   	 i j    x     ¾*¶ 0	 ·² *¶ 0*¶ ¶ $ o<§ d² *¶ 0*¶ ¶ \*¸ m J*¸ o B*¸ q :*¶ `	  » Y*¶ 0`· 6M,¸ g§ » Y*¶ `*¶ 0· 6M,¸ g
¡ÿ*¶ `	  » Y*¶ 0`· 6L+¸ g§ » Y*¶ `*¶ 0· 6L+¸ g±       N    O 	 S  T  U . V F W Q X ` Y d Z g \ y ] } T  c  d   e ¤ f § h ¹ i ½ p    >    ¾ ( )    j - +  `  s )  y  t )     s )  ¹  t )  .    ü û Gú   	 u 
     *      
» vYx· z¿           t       	 | 
     à     » Y· }K¸ ~² M² ¶ ¶ ² M» Y· 6¸ q¶ ² M» Y· 6¸ o¶ » Y· 6¸ >L² M+¶ 0¶ ² M² 223¶ ² M² 223¶ ² M² ¶ $¶ ±       .           ,  ?  M  W  f  u          |     M 7  )  	  
     ±     g» Y· }K¸ ~² M² 223¶ ² M² 223¶ ² M² 223¶ ² M² 223¶ ² M² 223¶ ² M² ¶ ¶ S±       & 	          +  ;  J  Z  f        _     	       2      ¸ ±       
                        
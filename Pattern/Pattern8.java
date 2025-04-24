class Pattern8
{
	public static void main(String[] args) {
		for (int i=1; i<=7; i++){

for (int j=1;j<=7; j++){
	int E = 6;

if((j==1)||(i==1&&j<=6)||(i==4&&j<=6)||(i==7&&j<=E )||(j==7&&i>1&&i<4)||(j==7&&i>4&&i<7))

System.out.print("+");

else

System.out.print(" ");

}

System.out.println();
}
	}
}
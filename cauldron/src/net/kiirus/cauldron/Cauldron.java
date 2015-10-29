package net.kiirus.cauldron;

import java.util.Scanner;

public class Cauldron {
	
	/**
	 * This is the 4x4 grid that all encryption algorithms will
	 * calculate on.
	 */
	public static String[][] a = new String[][]{
		{"i", "k", "e", "k"},
		{"a", "t", "d", "a"},
		{"n", "k", "m", "e"},
		{"m", "e", "s", "."}
	};

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.close();
		
		System.out.println("Horizontal Swap Row test for rows 1 and 3.");
		
		System.out.println("Original Row 1: " + a[1][0] + ", " + a[1][1] + ", " + a[1][2] + ", " + a[1][3]);
		System.out.println("Original Row 3: " + a[3][0] + ", " + a[3][1] + ", " + a[3][2] + ", " + a[3][3]);
		
		swR(1, 1, 3);

		System.out.println("New Row 1: " + a[1][0] + ", " + a[1][1] + ", " + a[1][2] + ", " + a[1][3]);
		System.out.println("New Row 3: " + a[3][0] + ", " + a[3][1] + ", " + a[3][2] + ", " + a[3][3]);
		
	}	
	
	/**
	 * swapRow
	 * @calc the swapping of two rows 
	 * @param vh | whether or not to perform a horizontal or vertical swap | (0 = columns, 1 = rows)
	 * @param row1 | the first row | (0-3)
	 * @param row2 | the second row | (0-3)
	 */
	public static void swR(int vh, int line1, int line2){
		
		if(line1 != line2){
			if(vh == 0){
				
				String a1 = a[0][line1], a2 = a[1][line1], a3 = a[2][line1], a4 = a[3][line1], b1 = a[0][line2], b2 = a[1][line2], b3 = a[2][line2], b4 = a[3][line2];
				
				a[0][line1] = b1; a[0][line2] = a1;
				a[1][line1] = b2; a[1][line2] = a2;
				a[2][line1] = b3; a[2][line2] = a3;
				a[3][line1] = b4; a[3][line2] = a4;
				
				System.out.println("sr(" + vh + ", " + line1 + ", " + "line2" + ") completed successfuly.");
				
			}else if(vh == 1){
				
				String a1 = a[line1][0], a2 = a[line1][1], a3 = a[line1][2], a4 = a[line1][3], b1 = a[line2][0], b2 = a[line2][1], b3 = a[line2][2], b4 = a[line2][3];
				
				a[line1][0] = b1; a[line2][0] = a1;
				a[line1][1] = b2; a[line2][1] = a2;
				a[line1][2] = b3; a[line2][2] = a3;
				a[line1][3] = b4; a[line2][3] = a4;
				
				System.out.println("sr(" + vh + ", " + line1 + ", " + "line2" + ") completed successfuly.");
				
			}else{
				System.out.println("swapRow cannot operate with a vh value other than 0 or 1.");
			}
		}else{
			System.out.println("swapRow cannot operate on a simgle row. Make sure line1 and line2 have different values.");
		}
		
	}
	
	/**
	 * shiftRow 
	 * @calc the vertical or horizontal shifting of one row or the entire matrix
	 * @param total | whether or not to perform a total shift | (0 = yes, 1 = no)
	 * @param vh | whether or not to perform a vertical or horizontal shift | (0 = vertical, 1 = horizontal)
	 * @param row | the row to shift if not performing a total shift | (0-3)
	 */
	public static void shR(int total, int vh, int row){
		//TODO: Work on shR method.
	}

}

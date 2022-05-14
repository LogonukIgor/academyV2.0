package by.academy.tasks.gener;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Print {

	Printable a = new Printable() {
		
		@Override
		public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
			// TODO Auto-generated method stub
			return 0;
		}
	};
}

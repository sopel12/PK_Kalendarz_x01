package controller;

import java.awt.EventQueue;

import model.CalendarDate;
import view.Window;

public class MainController {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					ComboBoxController myController = new ComboBoxController(frame);
					frame.setYearComboBox(CalendarDate.getYears());
					frame.setMonthComboBox(CalendarDate.getMonths());
					frame.setGrid(CalendarDate.getDayNames());
					frame.updateDayButtons(CalendarDate.getFirstDayOfWeek(frame.getD_year(), frame.getD_month()),
							CalendarDate.getDaysInMonth(frame.getD_year(), frame.getD_month()));
					
					frame.addMonthComboBoxController(myController);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalendarDate;
import view.Window;

public class ComboBoxController implements ActionListener {
	Window frame;
	ComboBoxController(Window frame){
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
//		 int year = Integer.parseInt(yearSelectComboBox.getSelectedItem().toString());
         int month = frame.getMonthSelectComboBox().getSelectedIndex();
         frame.updateDayButtons(CalendarDate.getFirstDayOfWeek(frame.getD_year(), month),
					CalendarDate.getDaysInMonth(frame.getD_year(), month));

	}

}

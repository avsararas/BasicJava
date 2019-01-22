package day17_Review1;

// Cybertek Custom Timer V1

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class backTimer extends JFrame implements ItemListener {

	
	private static final long serialVersionUID = 1L;
	
	JLabel jltime;
	JLabel jl;
	JComboBox<Integer> jcb;
	JButton jbt;
	JButton jbt2;
	NumberFormat format;

	public Timer timer;
	public long initial;
	public long ttime2;
	public String ttime;
	public long remaining;

	public backTimer() {

		JPanel timePanel = new JPanel();
		timePanel.setForeground(Color.white);

		jltime = new JLabel(" ");
		jltime.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jltime.setForeground(Color.orange);
		jltime.setBackground(Color.blue);
		jltime.setOpaque(true);
		jltime.setFont(new Font("Arial", Font.BOLD, 130));

		timePanel.add(jltime);

		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());

		jl = new JLabel("Set Break Time in Mins :");
		jp1.add(jl);

		jcb = new JComboBox<Integer>();
		for (int i = 60; i > 0; i--) {
			jcb.addItem(Integer.valueOf(i));
		}
		jcb.setSelectedIndex(0);
		ttime = "60";
		jp1.add(jcb);

		jbt = new JButton("Hooray!");
		jp1.add(jbt);

		jbt2 = new JButton("Reset!");
		jp1.add(jbt2);

		getContentPane().add(jp1, BorderLayout.NORTH);
		getContentPane().add(timePanel, BorderLayout.CENTER);

		Event e = new Event();
		jbt.addActionListener(e);
		jbt2.addActionListener(e);

		jcb.addItemListener(this);

		setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cybertek Relief Timer V 0.1");
		pack();
		setLocationByPlatform(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new backTimer();
			}

		});
	}

	void updateDisplay() {

		Timeclass tc = new Timeclass();
		timer = new Timer(1000, tc);
		initial = System.currentTimeMillis();
		timer.start();
	}

	public class Event implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String bname = e.getActionCommand();
			if (bname.equals("Hooray!")) {
				updateDisplay();
			} else {
				jltime.setText(" ");
				timer.stop();
				remaining = convertTime();
			}
		}
	}

	public class Timeclass implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			remaining = convertTime();
			long current = System.currentTimeMillis();
			long elapsed = current - initial;
			remaining -= elapsed;

			format = NumberFormat.getNumberInstance();
			format.setMinimumIntegerDigits(2);

			if (remaining < 0)
				remaining = (long) 0;
			int minutes = (int) (remaining / 60000);
			int seconds = (int) ((remaining % 60000) / 1000);
			jltime.setText(format.format(minutes) + ":" + format.format(seconds));

			if (remaining == 0) {
				jltime.setText("Reset!");
				timer.stop();
			}
		}
	}

	public void itemStateChanged(ItemEvent ie) {

		ttime = (String) jcb.getSelectedItem().toString();
		convertTime();
	}

	public long convertTime() {

		ttime2 = Long.parseLong(ttime);
		long converted = (ttime2 * 60000) + 1000;
		return converted;
	}
}
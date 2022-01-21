package lab;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	private static ArrayList<House> houses;

	public static void main(String[] args) throws Exception {

		Scanner inFile = new Scanner(new File("src/lab/info.txt"));
		houses = new ArrayList<House>();

		while (inFile.hasNext()) {
			int sqrft = inFile.nextInt();
			double baths = inFile.nextDouble();
			int bedrooms = inFile.nextInt();
			int price = inFile.nextInt();
			inFile.nextLine();
			String address = inFile.nextLine();
			double lotSize = inFile.nextDouble();
			boolean hasPool = inFile.nextBoolean();
			String image = inFile.next();
			houses.add(new House(sqrft, baths, bedrooms, price, address, lotSize, hasPool, image));
		}
		for(int i=0;i<houses.size();i++) {
			System.out.println(houses.get(i));
		}
		HomePage();
	}

	public static void HomePage() {

		// Create overall frame

		JFrame frame = new JFrame("Homes For Sale");
		// End program when red x is hit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// give it size
		frame.setSize(750, 650);

		// everything else goes here

		// create pic object
		ImageIcon pic1 = new ImageIcon(houses.get(0).image());
		// scale pic object
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		// create button
		JButton house1 = new JButton(scaledPic1);
		house1.setBounds(20, 30, scaledPic1.getIconWidth(), scaledPic1.getIconHeight());
		frame.add(house1);
		JLabel labelHouse1 = new JLabel(houses.get(0).address());
		labelHouse1.setBounds(20, 180, 240, 30);
		frame.add(labelHouse1);

		house1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(0));
			}
		});

		// create pic object 2
		ImageIcon pic2 = new ImageIcon(houses.get(1).image());
		// scale pic object 2
		ImageIcon scaledPic2 = new ImageIcon(pic2.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house2 = new JButton(scaledPic2);
		house2.setBounds(20, 220, scaledPic2.getIconWidth(), scaledPic2.getIconHeight());
		frame.add(house2);
		JLabel labelHouse2 = new JLabel(houses.get(1).address());
		labelHouse2.setBounds(20, 370, 240, 30);
		frame.add(labelHouse2);

		house2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(1));
			}
		});

		// create pic object 3
		ImageIcon pic3 = new ImageIcon(houses.get(2).image());
		// scale pic object 3
		ImageIcon scaledPic3 = new ImageIcon(pic3.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house3 = new JButton(scaledPic3);
		house3.setBounds(20, 410, scaledPic3.getIconWidth(), scaledPic3.getIconHeight());
		frame.add(house3);
		JLabel labelHouse3 = new JLabel(houses.get(2).address());
		labelHouse3.setBounds(20, 560, 350, 30);
		frame.add(labelHouse3);

		house3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(2));
			}
		});
		
		// create pic object 4
				ImageIcon pic4 = new ImageIcon(houses.get(3).image());
				// scale pic object 4
				ImageIcon scaledPic4 = new ImageIcon(pic4.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

				JButton house4 = new JButton(scaledPic4);
				house4.setBounds(400, 30, scaledPic4.getIconWidth(), scaledPic4.getIconHeight());
				frame.add(house4);
				JLabel labelHouse4 = new JLabel(houses.get(3).address());
				labelHouse4.setBounds(400, 180, 240, 30);
				frame.add(labelHouse4);

				house4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);

						houseGUI(houses.get(3));
					}
				});
				
				// create pic object 5
				ImageIcon pic5 = new ImageIcon(houses.get(4).image());
				// scale pic object 4
				ImageIcon scaledPic5 = new ImageIcon(pic5.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

				JButton house5 = new JButton(scaledPic5);
				house5.setBounds(400, 220, scaledPic5.getIconWidth(), scaledPic5.getIconHeight());
				frame.add(house5);
				JLabel labelHouse5 = new JLabel(houses.get(4).address());
				labelHouse5.setBounds(400, 370, 400, 30);
				frame.add(labelHouse5);

				house5.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);

						houseGUI(houses.get(4));
					}
				});
				
				// create pic object 6
				ImageIcon pic6 = new ImageIcon(houses.get(5).image());
				// scale pic object 4
				ImageIcon scaledPic6 = new ImageIcon(pic6.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

				JButton house6 = new JButton(scaledPic6);
				house6.setBounds(400, 410, scaledPic6.getIconWidth(), scaledPic6.getIconHeight());
				frame.add(house6);
				JLabel labelHouse6 = new JLabel(houses.get(5).address());
				labelHouse6.setBounds(400, 560, 240, 30);
				frame.add(labelHouse6);

				house6.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);

						houseGUI(houses.get(5));
					}
				});

		// don't use a layout
		frame.setLayout(null);
		// Build the Frame (make it visible)
		frame.setVisible(true);
	}

	public static void houseGUI(House house) {

		JFrame frame = new JFrame("House 1");
		// End program when red x is hit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Opens new GUI with house info when house picture is clicked
		frame.setSize(700, 400);
		JButton goBack = new JButton("Go back to home page");
		goBack.setBounds(10, 10, 200, 30);
		frame.add(goBack);
		goBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				HomePage();
			}
		});

		ImageIcon pic1 = new ImageIcon(house.image());
		// scale pic object
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house1 = new JButton(scaledPic1);
		house1.setBounds(20, 50, scaledPic1.getIconWidth(), scaledPic1.getIconHeight());
		frame.add(house1);

		JLabel info = new JLabel("Information about this house:");
		info.setBounds(250, 20, 300, 30);
		frame.add(info);

		JLabel price = new JLabel("Price:       $" + house.price());
		price.setBounds(250, 50, 300, 30);
		frame.add(price);

		JLabel address = new JLabel("Address:       " + house.address());
		address.setBounds(250, 80, 400, 30);
		frame.add(address);

		JLabel sqrft = new JLabel("Square Feet:       " + house.sqrft());
		sqrft.setBounds(250, 110, 300, 30);
		frame.add(sqrft);

		JLabel beds = new JLabel("Number of Bedrooms:       " + house.bedrooms());
		beds.setBounds(250, 140, 300, 30);
		frame.add(beds);

		JLabel baths = new JLabel("Number of Bathrooms:       " + house.baths());
		baths.setBounds(250, 170, 300, 30);
		frame.add(baths);

		JLabel lotSize = new JLabel("Lot Size:       " + house.lotSize());
		lotSize.setBounds(250, 200, 300, 30);
		frame.add(lotSize);

		if (house.hasPool() == true) {
			JLabel pool = new JLabel("Has Pool:       Yes");
			pool.setBounds(250, 230, 300, 30);
			frame.add(pool);
		}

		else {
			JLabel pool = new JLabel("Has Pool:       No");
			pool.setBounds(250, 230, 300, 30);
			frame.add(pool);
		}

		// don't use a layout
		frame.setLayout(null);
		// Build the Frame (make it visible)
		frame.setVisible(true);
	}

}

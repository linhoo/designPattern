/*
 * Copyright (C) 2015 YUNDA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tobby.designpattern.iterator.pattern;

import java.util.Iterator;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年11月10日 上午10:51:18
 */
public class Waitress {

	Menu pancakeHouseMenu;

	Menu dinnerMenu;

	Menu cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
		Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinnerIterator);
		System.out.println("\nDINNER");
		printMenu(cafeMenuIterator);
	}

	public void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + ", ");
			System.out.println(menuItem.getDescription());
		}
	}

}

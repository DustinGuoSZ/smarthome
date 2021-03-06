/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.library;

import org.eclipse.smarthome.core.items.GenericItem;
import org.eclipse.smarthome.core.items.ItemFactory;
import org.eclipse.smarthome.core.library.items.ColorItem;
import org.eclipse.smarthome.core.library.items.ContactItem;
import org.eclipse.smarthome.core.library.items.DateTimeItem;
import org.eclipse.smarthome.core.library.items.DimmerItem;
import org.eclipse.smarthome.core.library.items.ImageItem;
import org.eclipse.smarthome.core.library.items.NumberItem;
import org.eclipse.smarthome.core.library.items.RollershutterItem;
import org.eclipse.smarthome.core.library.items.StringItem;
import org.eclipse.smarthome.core.library.items.SwitchItem;


/**
 * {@link CoreItemFactory}-Implementation for the core ItemTypes 
 * 
 * @author Thomas.Eichstaedt-Engelen
 * @author Kai Kreuzer
 */
public class CoreItemFactory implements ItemFactory {
	
	public static final String SWITCH        = "Switch";
	public static final String ROLLERSHUTTER = "Rollershutter";
	public static final String CONTACT       = "Contact";
	public static final String STRING        = "String";
	public static final String NUMBER        = "Number";
	public static final String DIMMER        = "Dimmer";
	public static final String DATETIME      = "DateTime";
	public static final String COLOR         = "Color";
	public static final String IMAGE         = "Image";
	
	/**
	 * @{inheritDoc}
	 */
	public GenericItem createItem(String itemTypeName, String itemName) {
		if (itemTypeName.equals(SWITCH)) return new SwitchItem(itemName);
		if (itemTypeName.equals(ROLLERSHUTTER)) return new RollershutterItem(itemName);
		if (itemTypeName.equals(CONTACT)) return new ContactItem(itemName);
		if (itemTypeName.equals(STRING)) return new StringItem(itemName);
		if (itemTypeName.equals(NUMBER)) return new NumberItem(itemName);
		if (itemTypeName.equals(DIMMER)) return new DimmerItem(itemName);
		if (itemTypeName.equals(DATETIME)) return new DateTimeItem(itemName);
		if (itemTypeName.equals(COLOR)) return new ColorItem(itemName);
		if (itemTypeName.equals(IMAGE)) return new ImageItem(itemName);
		else return null;
	}
	
	/**
	 * @{inheritDoc}
	 */
	public String[] getSupportedItemTypes() {
		return new String[] {
				SWITCH, ROLLERSHUTTER, CONTACT, STRING, NUMBER, DIMMER, DATETIME, COLOR, IMAGE
		};
	}

}

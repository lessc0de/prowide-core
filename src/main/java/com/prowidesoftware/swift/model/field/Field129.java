/*******************************************************************************
 * Copyright (c) 2016 Prowide Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as 
 *     published by the Free Software Foundation, either version 3 of the 
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 *     
 *     Check the LGPL at <http://www.gnu.org/licenses/> for more details.
 *******************************************************************************/
 package com.prowidesoftware.swift.model.field;

import com.prowidesoftware.swift.model.Tag;
import com.prowidesoftware.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.field.SwiftParseUtils;
import com.prowidesoftware.swift.model.field.CurrencyResolver;
import com.prowidesoftware.swift.model.field.AmountResolver;
import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 129<br /><br />
 *
 * validation pattern: 2n/2n<br />
 * parser pattern: S/S<br />
 * components pattern: NN<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>Number</code></li> 
 * 		<li>component2: <code>Number</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * <em>This class complies with standard release SRU2016</em>
 *
 */
@SuppressWarnings("unused") 
@Generated
public class Field129 extends Field implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2016;

	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 129
	 */
    public static final String NAME = "129";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_129 = "129";
	public static final String PARSER_PATTERN ="S/S";
	public static final String COMPONENTS_PATTERN = "NN";

	/**
	 * Component number for the Section subfield
	 */
	public static final Integer SECTION = 1;

	/**
	 * Component number for the Total subfield
	 */
	public static final Integer TOTAL = 2;

	/**
	 * Default constructor. Creates a new field setting all components to null.
	 */
	public Field129() {
		super(2);
	}
	    					
	/**
	 * Creates a new field and initializes its components with content from the parameter value.
	 * @param value complete field value including separators and CRLF
	 */
	public Field129(final String value) {
		super(value);
	}
	
	/**
	 * Creates a new field and initializes its components with content from the parameter tag.
	 * The value is parsed with {@link #parse(String)} 	 
	 * @throws IllegalArgumentException if the parameter tag is null or its tagname does not match the field name
	 * @since 7.8
	 */
	public Field129(final Tag tag) {
		this();
		if (tag == null) {
			throw new IllegalArgumentException("tag cannot be null.");
		}
		if (!StringUtils.equals(tag.getName(), "129")) {
			throw new IllegalArgumentException("cannot create field 129 from tag "+tag.getName()+", tagname must match the name of the field.");
		}
		parse(tag.getValue());
	}
	
	/**
	 * Parses the parameter value into the internal components structure.
	 * Used to update all components from a full new value, as an alternative
	 * to setting individual components. Previous components value is overwritten.
	 * @param value complete field value including separators and CRLF
	 * @since 7.8
	 */
	@Override
	public void parse(final String value) {
		init(2);
		setComponent1(SwiftParseUtils.getTokenFirst(value, "/"));
		setComponent2(SwiftParseUtils.getTokenSecond(value, "/"));
	}
	
	/**
	 * Copy constructor.<br>
	 * Initializes the components list with a deep copy of the source components list.
	 * @param source a field instance to copy
	 * @since 7.7
	 */
	public static Field129 newInstance(Field129 source) {
		Field129 cp = new Field129();
		cp.setComponents(new ArrayList<String>(source.getComponents()));
		return cp;
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(StringUtils.trimToEmpty(getComponent1()));
        result.append("/");
        result.append(StringUtils.trimToEmpty(getComponent2()));
		return result.toString();
	}

	/**
	* Create a Tag with this field name and the given value.
	* Shorthand for <code>new Tag(NAME, value)</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag tag(final String value) {
		return new Tag(NAME, value);
	}

	/**
	* Create a Tag with this field name and an empty string as value
	* Shorthand for <code>new Tag(NAME, "")</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag emptyTag() {
		return new Tag(NAME, "");
	}
	
	/**
	 * Get the component1
	 * @return the component1
	 */
	public String getComponent1() {
		return getComponent(1);
	}

	/**
	 * Get the component1 as Number
	 * @return the component1 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent1AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(1));
	}

	/**
	 * Get the Section (component1).
	 * @return the Section from component1
	 */
	public String getSection() {
		return getComponent(1);
	}
	
	/**
	 * Get the Section (component1) as Number
	 * @return the Section from component1 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getSectionAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field129 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1 from a Number object.
	 * <br />
	 * <em>If the component being set is a fixed length number, the argument will not be 
	 * padded.</em> It is recommended for these cases to use the setComponent1(String) 
	 * method.
	 * 
	 * @see #setComponent1(String)
	 *
	 * @param component1 the Number with the component1 content to set
	 */
	public Field129 setComponent1(java.lang.Number component1) {
		if (component1 != null) {
			setComponent(1, Integer.toString(component1.intValue()));
		}
		return this;
	}
	
	/**
	 * Set the Section (component1).
	 * @param component1 the Section to set
	 */
	public Field129 setSection(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Section (component1) from a Number object.
	 * @see #setComponent1(java.lang.Number)
	 * @param component1 Number with the Section content to set
	 */
	public Field129 setSection(java.lang.Number component1) {
		setComponent1(component1);
		return this;
	}
	/**
	 * Get the component2
	 * @return the component2
	 */
	public String getComponent2() {
		return getComponent(2);
	}

	/**
	 * Get the component2 as Number
	 * @return the component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent2AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Get the Total (component2).
	 * @return the Total from component2
	 */
	public String getTotal() {
		return getComponent(2);
	}
	
	/**
	 * Get the Total (component2) as Number
	 * @return the Total from component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getTotalAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field129 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2 from a Number object.
	 * <br />
	 * <em>If the component being set is a fixed length number, the argument will not be 
	 * padded.</em> It is recommended for these cases to use the setComponent2(String) 
	 * method.
	 * 
	 * @see #setComponent2(String)
	 *
	 * @param component2 the Number with the component2 content to set
	 */
	public Field129 setComponent2(java.lang.Number component2) {
		if (component2 != null) {
			setComponent(2, Integer.toString(component2.intValue()));
		}
		return this;
	}
	
	/**
	 * Set the Total (component2).
	 * @param component2 the Total to set
	 */
	public Field129 setTotal(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Total (component2) from a Number object.
	 * @see #setComponent2(java.lang.Number)
	 * @param component2 Number with the Total content to set
	 */
	public Field129 setTotal(java.lang.Number component2) {
		setComponent2(component2);
		return this;
	}

   /**
    * Given a component number it returns true if the component is optional,
    * regardless of the field being mandatory in a particular message.<br />
    * Being the field's value conformed by a composition of one or several 
    * internal component values, the field may be present in a message with
    * a proper value but with some of its internal components not set.
    *
    * @param component component number, first component of a field is referenced as 1
    * @return true if the component is optional for this field, false otherwise
    */
   @Override
   public boolean isOptional(int component) {   
       return false;
   }

   /**
    * Returns true if the field is a GENERIC FIELD as specified by the standard.
    *
    * @return true if the field is generic, false otherwise
    */
   @Override
   public boolean isGeneric() {   
       return false;
   }
   
   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	 * Returns the field's name composed by the field number and the letter option (if any)
	 * @return the static value of Field129.NAME
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	 * Returns the field's components pattern
	 * @return the static value of Field129.COMPONENTS_PATTERN
	 */
	@Override
	public final String componentsPattern() {
		return COMPONENTS_PATTERN;
	}

	/**
	 * Returns the field's validators pattern
	 */
	@Override
	public final String validatorPattern() {
		return "2n/2n";
	}

	/**
	 * Get the first occurrence form the tag list or null if not found.
	 * @return null if not found o block is null or empty
	 * @param block may be null or empty 
	 */
	public static Field129 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Tag t = block.getTagByName(NAME);
		if (t == null) {
			return null;
		}
		return new Field129(t) ;
	}
	
	/**
	 * Get the first instance of Field129 in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field129 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field129 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static java.util.List<Field129> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return java.util.Collections.emptyList();
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field129 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field129> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final Tag[] arr = block.getTagsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field129> result = new java.util.ArrayList<Field129>(arr.length);
			for (final Tag f : arr) {
				result.add( new Field129(f));
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	/**
	 * Returns the defined amount of components.<br>
	 * This is not the amount of components present in the field instance, but the total amount of components 
	 * that this field accepts as defined. 
	 * @since 7.7
	 */
	@Override
	public int componentsSize() {
		return 2;
	}

	/**
	 * Returns a localized suitable for showing to humans string of a field component.<br>
	 *
	 * @param component number of the component to display
	 * @param locale optional locale to format date and amounts, if null, the default locale is used
	 * @return formatted component value or null if component number is invalid or not present
	 * @throws IllegalArgumentException if component number is invalid for the field
	 * @since 7.8
	 */
	@Override
	public String getValueDisplay(int component, Locale locale) {
		if (component < 1 || component > 2) {
			throw new IllegalArgumentException("invalid component number "+component+" for field 129");
		}
		if (component == 1) {
			//number or amount
			java.text.NumberFormat f = java.text.NumberFormat.getNumberInstance(notNull(locale));
    		Number n = getComponent1AsNumber();
			if (n != null) {
				return f.format(n);
			}
		}
		if (component == 2) {
			//number or amount
			java.text.NumberFormat f = java.text.NumberFormat.getNumberInstance(notNull(locale));
    		Number n = getComponent2AsNumber();
			if (n != null) {
				return f.format(n);
			}
		}
		return null;	
	}
	
	/**
	 * Returns english label for components.
	 * <br />
	 * The index in the list is in sync with specific field component structure.
	 * @see #getComponentLabel(int)
	 * @since 7.8.4
	 */
	@Override
	protected List<String> getComponentLabels() {
		List<String> result = new ArrayList<String>();
		result.add("Section");
		result.add("Total");
		return result;
	}
	

}

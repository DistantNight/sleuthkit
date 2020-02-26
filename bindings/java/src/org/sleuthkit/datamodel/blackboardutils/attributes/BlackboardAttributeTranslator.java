/*
 * Sleuth Kit Data Model
 *
 * Copyright 2020 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	 http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.datamodel.blackboardutils.attributes;

import org.sleuthkit.datamodel.BlackboardAttribute;

/**
 * An interface for Utility classes to implement for translating BlackboardAttributes
 * to and from a particular format.  Initial use case is for BlackboardAttributes of
 * type SK_BLACKBOARD_ATTRIBUTE_VALUE_TYPE.JSON.
 */
public interface BlackboardAttributeTranslator<T> {

	/**
	 * Translates the value of type T to a BlackboardAttribute.
	 * 
	 * @param value Object to Translate to BlackboardAttribute.
	 * 
	 * @return BlackboardAttribute created from value
	 */
	BlackboardAttribute toAttribute(T value);
	
	/**
	 * Translates an BlackboardAttribute to an object of type T.
	 * 
	 * @param attribute The Attribute to be translated to T
	 * 
	 * @return A new instance of T created from the BlackboardAttribute
	 */
	T fromAttribute(BlackboardAttribute attribute);
}



/*
 * SleuthKit Java Bindings
 *
 * Copyright 2011-2017 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.datamodel;

/**
 * Subtype of TskCoreException that is thrown when attempting to open a database
 * with an unsupported schema version.
 */
public class TskUnsupportedSchemaVersionException extends TskCoreException {

	private static final long serialVersionUID = 1L;

	public TskUnsupportedSchemaVersionException() {
	}

	public TskUnsupportedSchemaVersionException(String msg) {
		super(msg);
	}

	public TskUnsupportedSchemaVersionException(String msg, Exception ex) {
		super(msg, ex);
	}
	

}

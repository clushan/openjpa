/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */
package org.apache.openjpa.persistence.relations;

import java.io.*;

/**
 * Application identity class for: org.apache.openjpa.persistence.relations.ManyOneCompoundIdOwner
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ManyOneCompoundIdOwnerId implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.apache.openjpa.persistence.relations.ManyOneCompoundIdOwner"); }
		catch (Exception e) {}
	}

	public long entityId;
	public long longId;

	public ManyOneCompoundIdOwnerId() {
	}

	public ManyOneCompoundIdOwnerId(String str) {
		fromString(str);
	}

	public String toString() {
		return String.valueOf(entityId)
			+ "::" + String.valueOf(longId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + (int) (entityId ^ (entityId >>> 32));
		rs = rs * 37 + (int) (longId ^ (longId >>> 32));
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ManyOneCompoundIdOwnerId other = (ManyOneCompoundIdOwnerId) obj;
		return (entityId == other.entityId)
			&& (longId == other.longId);
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		entityId = Long.parseLong(str);
		str = toke.nextToken();
		longId = Long.parseLong(str);
	}

	protected static class Tokenizer {
		private final String str;
		private int last;

		public Tokenizer (String str) {
			this.str = str;
		}

		public String nextToken () {
			int next = str.indexOf("::", last);
			String part;
			if(next == -1) {
				part = str.substring(last);
				last = str.length();
			} else {
				part = str.substring(last, next);
				last = next + 2;
			}
			return part;
		}
	}
}

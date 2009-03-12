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
package org.apache.openjpa.persistence.jdbc.common.apps;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.annotation.Annotation;


/**
 * <p>Persistent type used in testing paging + eager fetching.</p>
 *
 */
@Entity
public class PagingPC {
	
    private int intField;
    private PagingHelperPC rel;
    private List rels = new ArrayList();

	public PagingPC() { }

    public int getIntField() {
        return this.intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public PagingHelperPC getRel() {
        return this.rel;
    }

    public void setRel(PagingHelperPC rel) {
        this.rel = rel;
    }

    public List getRels() {
        return this.rels;
    }

    public void setRels(List rels) {
        this.rels = rels;
    }

    public String toString() {
        return "PagingPC: " + intField;
    }
}

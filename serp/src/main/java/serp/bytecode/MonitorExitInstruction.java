/*
 * Copyright 2006 The Apache Software Foundation.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package serp.bytecode;

import serp.bytecode.visitor.BCVisitor;

/**
 * The <code>monitorexit</code> instruction.
 *
 * @author Abe White
 */
public class MonitorExitInstruction extends MonitorInstruction {

    MonitorExitInstruction(Code owner) {
        super(owner, Constants.MONITOREXIT);
    }

    public void acceptVisit(BCVisitor visit) {
        visit.enterMonitorExitInstruction(this);
        visit.exitMonitorExitInstruction(this);
    }
}

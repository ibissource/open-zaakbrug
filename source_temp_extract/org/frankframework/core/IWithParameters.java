/*
   Copyright 2013 Nationale-Nederlanden

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package org.frankframework.core;

import org.frankframework.parameters.Parameter;
import org.frankframework.parameters.ParameterList;


/**
 * Base interface to allow objects to declare that they accept parameters.
 *
 * @author Gerrit van Brakel
 */
public interface IWithParameters {

	void addParameter(Parameter p);
	ParameterList getParameterList(); // used by debugger, to show resolved values of parameters

}

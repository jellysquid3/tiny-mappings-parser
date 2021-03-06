/*
 * Copyright 2019 FabricMC
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

package net.fabricmc.mapping.tree;

import java.util.Collection;

/**
 * Represents a method element in a class.
 */
public interface MethodDef extends Descriptored {

	/**
	 * Gets all parameter elements belonging to this method element.
	 *
	 * @return all parameters
	 */
	Collection<ParameterDef> getParameters();

	/**
	 * Gets all local variable elements belonging to this method element.
	 *
	 * @return all local variables
	 */
	Collection<LocalVariableDef> getLocalVariables();
}

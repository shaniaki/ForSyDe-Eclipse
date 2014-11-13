/**
 *
 * $Id$
 */
package forsyde.validation;

import forsyde.MoC;

/**
 * A sample validator interface for {@link forsyde.Port}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PortValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateMoc(MoC value);
	boolean validateDataType(String value);
}

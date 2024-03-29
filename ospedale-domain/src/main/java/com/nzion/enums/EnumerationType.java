package com.nzion.enums;

import java.util.ArrayList;
import java.util.List;

public enum EnumerationType {
	HCFA_PLACE_OF_SERVICE, HCFA_PAYER_TYPE, RELATIONSHIP_TYPE, POLICY_RELATIONSIP, ETHNICITY, 
	SOAP, AGEING_BASED_ON, BILLING_METHOD, BILL_TYPE, HPI, PROVIDER_CHART_FOLDER, 
	INSURANCE_PROVIDER_PAYMENT, PRIMARY_BILLING_METHOD, FIXED_ASSEST_STATUS, MARITAL_STATUS, 
	SOCIO_ECONOMIC, CONTACT_MECH_TYPE, LANGUAGE, GENDER, NAME_COMPONENTS, INS_TYPE, LOCATION_TYPE, 
	INSURANCE_PROVIDER_ADJUSTMENT, INSURANCE_FEE_TABLE, DIAGNOSIS_ID, AGEING_FORMAT, YES_NO, 
	DEFAULT_SOAP_NOTE_FORMAT, INSURANCE_PROVIDER_ELIGIBILITY_METHOD, PATIENT_CHART_FOLDER, 
	PATIENT_RECALL_METHOD, CONTACT_MECHANISM, RESOURCE_TYPE, SOAPTYPE, PATIENT_RESPONSIBLE_FEE_TABLE, 
	NOTE_TYPE, FORM_NAME, RACE, OCCUPATION, STATUS, RELEASE_INFO, INSURANCE_PROVIDER_GROUP_DESC, 
	INSURANCE_PHYSICIAN_ID;

	private static List<EnumerationType> practiceSpecificEnumTypes = new ArrayList<EnumerationType>();
	public static List<EnumerationType> getPracticeSpecificEnumTypes() {
	if (practiceSpecificEnumTypes.size() == 0) {
		practiceSpecificEnumTypes.add(OCCUPATION);
		practiceSpecificEnumTypes.add(LANGUAGE);
		practiceSpecificEnumTypes.add(ETHNICITY);
	}
	return practiceSpecificEnumTypes;
	}
}

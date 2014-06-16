package com.esofthead.mycollab.module.crm.i18n;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

@BaseName("localization/crm/opportunity")
@LocaleData({ @Locale("en_US"), @Locale("ja_JP") })
public enum OpportunityI18nEnum {
	NO_ITEM_VIEW_TITLE,
	NO_ITEM_VIEW_HINT,
	
	LIST_VIEW_TITLE,
	
	SECTION_OPPORTUNITY_INFORMATION,
	SECTION_DESCRIPTION,
	
	FORM_AMOUNT,
	FORM_SALE_STAGE,
	FORM_EXPECTED_CLOSE_DATE,
	FORM_NAME,
	FORM_CURRENCY,
	FORM_PROBABILITY,
	FORM_ACCOUNT_NAME,
	FORM_SOURCE,
	FORM_TYPE,
	FORM_LEAD_SOURCE,
	FORM_CAMPAIGN_NAME,
	FORM_ASSIGN_USER,
	FORM_NEXT_STEP,
}

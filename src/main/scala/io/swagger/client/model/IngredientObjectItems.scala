/**
 * Chomp Food Database API Documentation
 * ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ### Helpful Links   * **Help & Support**     * [Knowledge Base &raquo;](https://desk.zoho.com/portal/chompthis/kb/chomp)     * [Support &raquo;](https://chompthis.com/api/ticket-new.php)     * [Client Center &raquo;](https://chompthis.com/api/manage.php)   * **Pricing**     * [Subscription Options &raquo;](https://chompthis.com/api/)     * [Cost Calculator &raquo;](https://chompthis.com/api/cost-calculator.php)   * **Guidelines**     * [Terms & License &raquo;](https://chompthis.com/api/terms.php)     * [Attribution &raquo;](https://chompthis.com/api/docs/attribution.php) 
 *
 * OpenAPI spec version: 1.0.0-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model

import java.math.BigDecimal

/**
 * An object containing information for this specific item.
 *
 * @param name Item name as provided by brand owner or as shown on packaging
 * @param categories 
 * @param nutrients An array containing nutrient informatio objects for this food item
 * @param calorieConversionFactor 
 * @param proteinConversionFactor The multiplication factor used to calculate protein from nitrogen
 * @param dietLabels 
 * @param components An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
 * @param portions An array of objects containing information on discrete amounts of a food found in this item
 * @param commonName Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")
 * @param description A description of this item
 * @param footnote Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
 */
case class IngredientObjectItems (
  name: Option[String],
  categories: Option[List[String]],
  nutrients: Option[List[IngredientObject_nutrients]],
  calorieConversionFactor: Option[IngredientObject_calorie_conversion_factor],
  proteinConversionFactor: Option[BigDecimal],
  dietLabels: Option[BrandedFoodObject_diet_labels],
  components: Option[List[IngredientObject_components]],
  portions: Option[List[IngredientObject_portions]],
  commonName: Option[String],
  description: Option[String],
  footnote: Option[String]
)


/**
 * Chomp Food Database API Documentation
 * __Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API.   - Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
 *
 * OpenAPI spec version: 1.0.0-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.BrandedFoodObject
import io.swagger.client.model.IngredientObject
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class DefaultApi(
  val defBasePath: String = "https://chompthis.com/api/v2",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new DefaultApiAsyncHelper(client, config)

  /**
   * Get a branded food item using a barcode
   * # Get data for a branded food using the food&#39;s UPC/EAN barcode.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/barcode.php?api_key&#x3D;API_KEY&amp;code&#x3D;CODE&#x60;&#x60;&#x60; 
   *
   * @param code UPC/EAN barcode  __Example:__ 0842234000988  __Resources:__ [Database search](https://chompthis.com/api/lookup.php)  _Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for tips and tricks._  
   * @return BrandedFoodObject
   */
  def foodBrandedBarcodePhpGet(code: String): Option[BrandedFoodObject] = {
    val await = Try(Await.result(foodBrandedBarcodePhpGetAsync(code), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a branded food item using a barcode asynchronously
   * # Get data for a branded food using the food&#39;s UPC/EAN barcode.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/barcode.php?api_key&#x3D;API_KEY&amp;code&#x3D;CODE&#x60;&#x60;&#x60; 
   *
   * @param code UPC/EAN barcode  __Example:__ 0842234000988  __Resources:__ [Database search](https://chompthis.com/api/lookup.php)  _Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for tips and tricks._  
   * @return Future(BrandedFoodObject)
   */
  def foodBrandedBarcodePhpGetAsync(code: String): Future[BrandedFoodObject] = {
      helper.foodBrandedBarcodePhpGet(code)
  }

  /**
   * Get a branded food item using an ID number
   * # Get data for a branded food using Chomp&#39;s internal ID number.  _Alternatively, set the \&quot;source\&quot; parameter to \&quot;USDA\&quot; and use the food&#39;s FDC ID._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/id.php?api_key&#x3D;API_KEY&amp;id&#x3D;ID&#x60;&#x60;&#x60; 
   *
   * @param id Chomp branded food ID.  _Set \&quot;source&#x3D;USDA\&quot; if you wish to pass in the food&#39;s FoodData Central ID (fdc_id)._  __Example #1:__ 15  __Resources:__ [Find branded food IDs](https://chompthis.com/api/lookup.php)  
   * @param source Specify the data source (optional).  You must pass in \&quot;USDA\&quot; if you want to look up a food item using a USDA FDC ID.  __Example:__ USDA _(defaults to \&quot;Chomp\&quot;)_  (optional)
   * @return BrandedFoodObject
   */
  def foodBrandedIdPhpGet(id: Integer, source: Option[String] = None): Option[BrandedFoodObject] = {
    val await = Try(Await.result(foodBrandedIdPhpGetAsync(id, source), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a branded food item using an ID number asynchronously
   * # Get data for a branded food using Chomp&#39;s internal ID number.  _Alternatively, set the \&quot;source\&quot; parameter to \&quot;USDA\&quot; and use the food&#39;s FDC ID._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/id.php?api_key&#x3D;API_KEY&amp;id&#x3D;ID&#x60;&#x60;&#x60; 
   *
   * @param id Chomp branded food ID.  _Set \&quot;source&#x3D;USDA\&quot; if you wish to pass in the food&#39;s FoodData Central ID (fdc_id)._  __Example #1:__ 15  __Resources:__ [Find branded food IDs](https://chompthis.com/api/lookup.php)  
   * @param source Specify the data source (optional).  You must pass in \&quot;USDA\&quot; if you want to look up a food item using a USDA FDC ID.  __Example:__ USDA _(defaults to \&quot;Chomp\&quot;)_  (optional)
   * @return Future(BrandedFoodObject)
   */
  def foodBrandedIdPhpGetAsync(id: Integer, source: Option[String] = None): Future[BrandedFoodObject] = {
      helper.foodBrandedIdPhpGet(id, source)
  }

  /**
   * Get a branded food item by name
   * # Search for branded food items by name.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/name.php?api_key&#x3D;API_KEY&amp;name&#x3D;NAME&#x60;&#x60;&#x60; 
   *
   * @param name Branded food name  __Example:__ Starburst  __Resources:__ [Find branded food names](https://chompthis.com/api/lookup.php)  
   * @param limit Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_  (optional)
   * @return BrandedFoodObject
   */
  def foodBrandedNamePhpGet(name: String, limit: Option[Integer] = None): Option[BrandedFoodObject] = {
    val await = Try(Await.result(foodBrandedNamePhpGetAsync(name, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a branded food item by name asynchronously
   * # Search for branded food items by name.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/name.php?api_key&#x3D;API_KEY&amp;name&#x3D;NAME&#x60;&#x60;&#x60; 
   *
   * @param name Branded food name  __Example:__ Starburst  __Resources:__ [Find branded food names](https://chompthis.com/api/lookup.php)  
   * @param limit Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_  (optional)
   * @return Future(BrandedFoodObject)
   */
  def foodBrandedNamePhpGetAsync(name: String, limit: Option[Integer] = None): Future[BrandedFoodObject] = {
      helper.foodBrandedNamePhpGet(name, limit)
  }

  /**
   * Get data for branded food items using various search parameters
   * # Search for branded food items using various parameters.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/search.php?api_key&#x3D;API_KEY&amp;brand&#x3D;BRAND&amp;country&#x3D;COUNTRY&amp;page&#x3D;1&#x60;&#x60;&#x60;  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ 
   *
   * @param allergen Specify a required allergen ingredient (optional)  __Example__: Peanuts  __Resources__: [List of allergens](https://chompthis.com/api/data/allergen.php)  (optional)
   * @param brand Specify a required brand (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php)  (optional)
   * @param category Specify a required category (optional)  __Example__: Pasta Dishes  __Resources__: [List of categories](https://chompthis.com/api/data/category.php)  (optional)
   * @param country Specify a required country (optional)  __Example__: United States  __Resources__: [List of countries](https://chompthis.com/api/data/country.php)  (optional)
   * @param diet Specify a required diet (optional)  _Filters the search to only include food items that are considered compatible with the following diets: Vegan, Vegetarian, Gluten Free_  __Example__: Gluten Free  __Resources__: [List of diets](https://chompthis.com/api/data/lifestyle.php)  (optional)
   * @param ingredient Specify a required ingredient (optional)  __Example__: Salt  __Resources__: [List of ingredients](https://chompthis.com/api/data/ingredient.php)  (optional)
   * @param keyword Specify a required keyword (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php)  (optional)
   * @param mineral Specify a required mineral (optional)  __Example__: Potassium  __Resources__: [List of minerals](https://chompthis.com/api/data/mineral.php)  (optional)
   * @param nutrient Specify a required nutrition label item (optional)  __Example__: Caffeine  __Resources__: [List of nutrition label items](https://chompthis.com/api/data/nutrition.php)  (optional)
   * @param palmOil Specify a required palm oil ingredient (optional)  __Example__: E160a Beta Carotene  __Resources__: [List of palm oil ingredients](https://chompthis.com/api/data/palm-oil.php)  (optional)
   * @param trace Specify a required trace ingredient (optional)  __Example__: Tree Nuts  __Resources__: [List of trace ingredients](https://chompthis.com/api/data/trace.php)  (optional)
   * @param vitamin Specify a required vitamin (optional)  __Example__: Biotin  __Resources__: [List of vitamins](https://chompthis.com/api/data/vitamin.php)  (optional)
   * @param limit Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_  (optional)
   * @param page Specify the search response page number.  _Each page will contain up to 10 items._  __Example__: 1 _(default)_  (optional)
   * @return BrandedFoodObject
   */
  def foodBrandedSearchPhpGet(allergen: Option[String] = None, brand: Option[String] = None, category: Option[String] = None, country: Option[String] = None, diet: Option[String] = None, ingredient: Option[String] = None, keyword: Option[String] = None, mineral: Option[String] = None, nutrient: Option[String] = None, palmOil: Option[String] = None, trace: Option[String] = None, vitamin: Option[String] = None, limit: Option[Integer] = None, page: Option[Integer] = None): Option[BrandedFoodObject] = {
    val await = Try(Await.result(foodBrandedSearchPhpGetAsync(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get data for branded food items using various search parameters asynchronously
   * # Search for branded food items using various parameters.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/search.php?api_key&#x3D;API_KEY&amp;brand&#x3D;BRAND&amp;country&#x3D;COUNTRY&amp;page&#x3D;1&#x60;&#x60;&#x60;  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ 
   *
   * @param allergen Specify a required allergen ingredient (optional)  __Example__: Peanuts  __Resources__: [List of allergens](https://chompthis.com/api/data/allergen.php)  (optional)
   * @param brand Specify a required brand (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php)  (optional)
   * @param category Specify a required category (optional)  __Example__: Pasta Dishes  __Resources__: [List of categories](https://chompthis.com/api/data/category.php)  (optional)
   * @param country Specify a required country (optional)  __Example__: United States  __Resources__: [List of countries](https://chompthis.com/api/data/country.php)  (optional)
   * @param diet Specify a required diet (optional)  _Filters the search to only include food items that are considered compatible with the following diets: Vegan, Vegetarian, Gluten Free_  __Example__: Gluten Free  __Resources__: [List of diets](https://chompthis.com/api/data/lifestyle.php)  (optional)
   * @param ingredient Specify a required ingredient (optional)  __Example__: Salt  __Resources__: [List of ingredients](https://chompthis.com/api/data/ingredient.php)  (optional)
   * @param keyword Specify a required keyword (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php)  (optional)
   * @param mineral Specify a required mineral (optional)  __Example__: Potassium  __Resources__: [List of minerals](https://chompthis.com/api/data/mineral.php)  (optional)
   * @param nutrient Specify a required nutrition label item (optional)  __Example__: Caffeine  __Resources__: [List of nutrition label items](https://chompthis.com/api/data/nutrition.php)  (optional)
   * @param palmOil Specify a required palm oil ingredient (optional)  __Example__: E160a Beta Carotene  __Resources__: [List of palm oil ingredients](https://chompthis.com/api/data/palm-oil.php)  (optional)
   * @param trace Specify a required trace ingredient (optional)  __Example__: Tree Nuts  __Resources__: [List of trace ingredients](https://chompthis.com/api/data/trace.php)  (optional)
   * @param vitamin Specify a required vitamin (optional)  __Example__: Biotin  __Resources__: [List of vitamins](https://chompthis.com/api/data/vitamin.php)  (optional)
   * @param limit Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_  (optional)
   * @param page Specify the search response page number.  _Each page will contain up to 10 items._  __Example__: 1 _(default)_  (optional)
   * @return Future(BrandedFoodObject)
   */
  def foodBrandedSearchPhpGetAsync(allergen: Option[String] = None, brand: Option[String] = None, category: Option[String] = None, country: Option[String] = None, diet: Option[String] = None, ingredient: Option[String] = None, keyword: Option[String] = None, mineral: Option[String] = None, nutrient: Option[String] = None, palmOil: Option[String] = None, trace: Option[String] = None, vitamin: Option[String] = None, limit: Option[Integer] = None, page: Option[Integer] = None): Future[BrandedFoodObject] = {
      helper.foodBrandedSearchPhpGet(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page)
  }

  /**
   * Get raw/generic food ingredient item(s)
   * # Get data for a specific ingredient or a specific set of ingredients.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;STRING/LIST&amp;list&#x3D;BOOLEAN&amp;raw&#x3D;BOOLEAN&#x60;&#x60;&#x60; 
   *
   * @param find Specify the ingredient name(s).  __Example #1:__ broccoli  __Example #2:__ broccoli,cauliflower,spinach  ___Important Note:__ Set the \&quot;is_list\&quot; parameter to true before passing in a comma-separated list of ingredients._  
   * @param list Specify if you are searching for multiple ingredients.  _Setting this to true will configure this endpoint so that it accepts a comma-separated list of ingredients._  _By default, this endpoint expects a single ingredient._  __Example:__ true _(defaults to false)_  
   * @param raw Specify if you only want data for raw ingredients.  __Example:__ true _(defaults to true)_  (optional)
   * @param limit Set maximum number of records you want the API to return.  ___Important Note:__ Setting this to \&quot;1\&quot; will return 1 record per search term._  __Example:__ 1 _(defaults to 1, max is 3)_  (optional)
   * @return IngredientObject
   */
  def ingredientSearchPhpGet(find: Integer, list: Boolean, raw: Option[Boolean] = None, limit: Option[Integer] = None): Option[IngredientObject] = {
    val await = Try(Await.result(ingredientSearchPhpGetAsync(find, list, raw, limit), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get raw/generic food ingredient item(s) asynchronously
   * # Get data for a specific ingredient or a specific set of ingredients.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;STRING/LIST&amp;list&#x3D;BOOLEAN&amp;raw&#x3D;BOOLEAN&#x60;&#x60;&#x60; 
   *
   * @param find Specify the ingredient name(s).  __Example #1:__ broccoli  __Example #2:__ broccoli,cauliflower,spinach  ___Important Note:__ Set the \&quot;is_list\&quot; parameter to true before passing in a comma-separated list of ingredients._  
   * @param list Specify if you are searching for multiple ingredients.  _Setting this to true will configure this endpoint so that it accepts a comma-separated list of ingredients._  _By default, this endpoint expects a single ingredient._  __Example:__ true _(defaults to false)_  
   * @param raw Specify if you only want data for raw ingredients.  __Example:__ true _(defaults to true)_  (optional)
   * @param limit Set maximum number of records you want the API to return.  ___Important Note:__ Setting this to \&quot;1\&quot; will return 1 record per search term._  __Example:__ 1 _(defaults to 1, max is 3)_  (optional)
   * @return Future(IngredientObject)
   */
  def ingredientSearchPhpGetAsync(find: Integer, list: Boolean, raw: Option[Boolean] = None, limit: Option[Integer] = None): Future[IngredientObject] = {
      helper.ingredientSearchPhpGet(find, list, raw, limit)
  }

}

class DefaultApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def foodBrandedBarcodePhpGet(code: String)(implicit reader: ClientResponseReader[BrandedFoodObject]): Future[BrandedFoodObject] = {
    // create path and map variables
    val path = (addFmt("/food/branded/barcode.php"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling DefaultApi->foodBrandedBarcodePhpGet")

    queryParams += "code" -> code.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def foodBrandedIdPhpGet(id: Integer,
    source: Option[String] = None
    )(implicit reader: ClientResponseReader[BrandedFoodObject]): Future[BrandedFoodObject] = {
    // create path and map variables
    val path = (addFmt("/food/branded/id.php"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    queryParams += "id" -> id.toString
    source match {
      case Some(param) => queryParams += "source" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def foodBrandedNamePhpGet(name: String,
    limit: Option[Integer] = None
    )(implicit reader: ClientResponseReader[BrandedFoodObject]): Future[BrandedFoodObject] = {
    // create path and map variables
    val path = (addFmt("/food/branded/name.php"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (name == null) throw new Exception("Missing required parameter 'name' when calling DefaultApi->foodBrandedNamePhpGet")

    queryParams += "name" -> name.toString
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def foodBrandedSearchPhpGet(allergen: Option[String] = None,
    brand: Option[String] = None,
    category: Option[String] = None,
    country: Option[String] = None,
    diet: Option[String] = None,
    ingredient: Option[String] = None,
    keyword: Option[String] = None,
    mineral: Option[String] = None,
    nutrient: Option[String] = None,
    palmOil: Option[String] = None,
    trace: Option[String] = None,
    vitamin: Option[String] = None,
    limit: Option[Integer] = None,
    page: Option[Integer] = None
    )(implicit reader: ClientResponseReader[BrandedFoodObject]): Future[BrandedFoodObject] = {
    // create path and map variables
    val path = (addFmt("/food/branded/search.php"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    allergen match {
      case Some(param) => queryParams += "allergen" -> param.toString
      case _ => queryParams
    }
    brand match {
      case Some(param) => queryParams += "brand" -> param.toString
      case _ => queryParams
    }
    category match {
      case Some(param) => queryParams += "category" -> param.toString
      case _ => queryParams
    }
    country match {
      case Some(param) => queryParams += "country" -> param.toString
      case _ => queryParams
    }
    diet match {
      case Some(param) => queryParams += "diet" -> param.toString
      case _ => queryParams
    }
    ingredient match {
      case Some(param) => queryParams += "ingredient" -> param.toString
      case _ => queryParams
    }
    keyword match {
      case Some(param) => queryParams += "keyword" -> param.toString
      case _ => queryParams
    }
    mineral match {
      case Some(param) => queryParams += "mineral" -> param.toString
      case _ => queryParams
    }
    nutrient match {
      case Some(param) => queryParams += "nutrient" -> param.toString
      case _ => queryParams
    }
    palmOil match {
      case Some(param) => queryParams += "palm_oil" -> param.toString
      case _ => queryParams
    }
    trace match {
      case Some(param) => queryParams += "trace" -> param.toString
      case _ => queryParams
    }
    vitamin match {
      case Some(param) => queryParams += "vitamin" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def ingredientSearchPhpGet(find: Integer,
    list: Boolean,
    raw: Option[Boolean] = None,
    limit: Option[Integer] = None
    )(implicit reader: ClientResponseReader[IngredientObject]): Future[IngredientObject] = {
    // create path and map variables
    val path = (addFmt("/ingredient/search.php"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    queryParams += "find" -> find.toString
    queryParams += "list" -> list.toString
    raw match {
      case Some(param) => queryParams += "raw" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}

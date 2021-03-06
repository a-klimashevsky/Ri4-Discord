/**
* EVE Swagger Interface
* An OpenAPI for EVE Online
*
* The version of the OpenAPI document: 1.7.2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package tv.z85.esi.models


import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param duration duration integer
 * @param isBuyOrder is_buy_order boolean
 * @param issued issued string
 * @param locationId location_id integer
 * @param minVolume min_volume integer
 * @param orderId order_id integer
 * @param price price number
 * @param range range string
 * @param typeId type_id integer
 * @param volumeRemain volume_remain integer
 * @param volumeTotal volume_total integer
 */

data class GetMarketsStructuresStructureId200Ok (
    /* duration integer */
    @Json(name = "duration")
    var duration: kotlin.Int,
    /* is_buy_order boolean */
    @Json(name = "is_buy_order")
    var isBuyOrder: kotlin.Boolean,
    /* issued string */
    @Json(name = "issued")
    var issued: java.time.OffsetDateTime,
    /* location_id integer */
    @Json(name = "location_id")
    var locationId: kotlin.Long,
    /* min_volume integer */
    @Json(name = "min_volume")
    var minVolume: kotlin.Int,
    /* order_id integer */
    @Json(name = "order_id")
    var orderId: kotlin.Long,
    /* price number */
    @Json(name = "price")
    var price: kotlin.Double,
    /* range string */
    @Json(name = "range")
    var range: GetMarketsStructuresStructureId200Ok.Range,
    /* type_id integer */
    @Json(name = "type_id")
    var typeId: kotlin.Int,
    /* volume_remain integer */
    @Json(name = "volume_remain")
    var volumeRemain: kotlin.Int,
    /* volume_total integer */
    @Json(name = "volume_total")
    var volumeTotal: kotlin.Int
) {

    /**
    * range string
    * Values: station,region,solarsystem,_1,_2,_3,_4,_5,_10,_20,_30,_40
    */
    
    enum class Range(val value: kotlin.String){
        @Json(name = "station") station("station"),
        @Json(name = "region") region("region"),
        @Json(name = "solarsystem") solarsystem("solarsystem"),
        @Json(name = "1") _1("1"),
        @Json(name = "2") _2("2"),
        @Json(name = "3") _3("3"),
        @Json(name = "4") _4("4"),
        @Json(name = "5") _5("5"),
        @Json(name = "10") _10("10"),
        @Json(name = "20") _20("20"),
        @Json(name = "30") _30("30"),
        @Json(name = "40") _40("40");
    }
}


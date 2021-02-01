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

import tv.z85.esi.models.GetUniverseStationsStationIdPosition

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param maxDockableShipVolume max_dockable_ship_volume number
 * @param name name string
 * @param officeRentalCost office_rental_cost number
 * @param owner ID of the corporation that controls this station
 * @param position 
 * @param raceId race_id integer
 * @param reprocessingEfficiency reprocessing_efficiency number
 * @param reprocessingStationsTake reprocessing_stations_take number
 * @param services services array
 * @param stationId station_id integer
 * @param systemId The solar system this station is in
 * @param typeId type_id integer
 */

data class GetUniverseStationsStationIdOk (
    /* max_dockable_ship_volume number */
    @Json(name = "max_dockable_ship_volume")
    var maxDockableShipVolume: kotlin.Float,
    /* name string */
    @Json(name = "name")
    var name: kotlin.String,
    /* office_rental_cost number */
    @Json(name = "office_rental_cost")
    var officeRentalCost: kotlin.Float,
    /* ID of the corporation that controls this station */
    @Json(name = "owner")
    var owner: kotlin.Int? = null,
    @Json(name = "position")
    var position: GetUniverseStationsStationIdPosition,
    /* race_id integer */
    @Json(name = "race_id")
    var raceId: kotlin.Int? = null,
    /* reprocessing_efficiency number */
    @Json(name = "reprocessing_efficiency")
    var reprocessingEfficiency: kotlin.Float,
    /* reprocessing_stations_take number */
    @Json(name = "reprocessing_stations_take")
    var reprocessingStationsTake: kotlin.Float,
    /* services array */
    @Json(name = "services")
    var services: kotlin.Array<GetUniverseStationsStationIdOk.Services>,
    /* station_id integer */
    @Json(name = "station_id")
    var stationId: kotlin.Int,
    /* The solar system this station is in */
    @Json(name = "system_id")
    var systemId: kotlin.Int,
    /* type_id integer */
    @Json(name = "type_id")
    var typeId: kotlin.Int
) {

    /**
    * services array
    * Values: bountyMinusMissions,assasinationMinusMissions,courierMinusMissions,interbus,reprocessingMinusPlant,refinery,market,blackMinusMarket,stockMinusExchange,cloning,surgery,dnaMinusTherapy,repairMinusFacilities,factory,labratory,gambling,fitting,paintshop,news,storage,insurance,docking,officeMinusRental,jumpMinusCloneMinusFacility,loyaltyMinusPointMinusStore,navyMinusOffices,securityMinusOffices
    */
    
    enum class Services(val value: kotlin.String){
        @Json(name = "bounty-missions") bountyMinusMissions("bounty-missions"),
        @Json(name = "assasination-missions") assasinationMinusMissions("assasination-missions"),
        @Json(name = "courier-missions") courierMinusMissions("courier-missions"),
        @Json(name = "interbus") interbus("interbus"),
        @Json(name = "reprocessing-plant") reprocessingMinusPlant("reprocessing-plant"),
        @Json(name = "refinery") refinery("refinery"),
        @Json(name = "market") market("market"),
        @Json(name = "black-market") blackMinusMarket("black-market"),
        @Json(name = "stock-exchange") stockMinusExchange("stock-exchange"),
        @Json(name = "cloning") cloning("cloning"),
        @Json(name = "surgery") surgery("surgery"),
        @Json(name = "dna-therapy") dnaMinusTherapy("dna-therapy"),
        @Json(name = "repair-facilities") repairMinusFacilities("repair-facilities"),
        @Json(name = "factory") factory("factory"),
        @Json(name = "labratory") labratory("labratory"),
        @Json(name = "gambling") gambling("gambling"),
        @Json(name = "fitting") fitting("fitting"),
        @Json(name = "paintshop") paintshop("paintshop"),
        @Json(name = "news") news("news"),
        @Json(name = "storage") storage("storage"),
        @Json(name = "insurance") insurance("insurance"),
        @Json(name = "docking") docking("docking"),
        @Json(name = "office-rental") officeMinusRental("office-rental"),
        @Json(name = "jump-clone-facility") jumpMinusCloneMinusFacility("jump-clone-facility"),
        @Json(name = "loyalty-point-store") loyaltyMinusPointMinusStore("loyalty-point-store"),
        @Json(name = "navy-offices") navyMinusOffices("navy-offices"),
        @Json(name = "security-offices") securityMinusOffices("security-offices");
    }
}

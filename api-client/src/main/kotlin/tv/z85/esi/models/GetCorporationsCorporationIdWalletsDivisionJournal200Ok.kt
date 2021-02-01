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
 * @param amount The amount of ISK given or taken from the wallet as a result of the given transaction. Positive when ISK is deposited into the wallet and negative when ISK is withdrawn
 * @param balance Wallet balance after transaction occurred
 * @param contextId An ID that gives extra context to the particular transaction. Because of legacy reasons the context is completely different per ref_type and means different things. It is also possible to not have a context_id
 * @param contextIdType The type of the given context_id if present
 * @param date Date and time of transaction
 * @param description The reason for the transaction, mirrors what is seen in the client
 * @param firstPartyId The id of the first party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name
 * @param id Unique journal reference ID
 * @param reason The user stated reason for the transaction. Only applies to some ref_types
 * @param refType \"The transaction type for the given. transaction. Different transaction types will populate different attributes. Note: If you have an existing XML API application that is using ref_types, you will need to know which string ESI ref_type maps to which integer. You can look at the following file to see string->int mappings: https://github.com/ccpgames/eve-glue/blob/master/eve_glue/wallet_journal_ref.py\"
 * @param secondPartyId The id of the second party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name
 * @param tax Tax amount received. Only applies to tax related transactions
 * @param taxReceiverId The corporation ID receiving any tax paid. Only applies to tax related transactions
 */

data class GetCorporationsCorporationIdWalletsDivisionJournal200Ok (
    /* The amount of ISK given or taken from the wallet as a result of the given transaction. Positive when ISK is deposited into the wallet and negative when ISK is withdrawn */
    @Json(name = "amount")
    var amount: kotlin.Double? = null,
    /* Wallet balance after transaction occurred */
    @Json(name = "balance")
    var balance: kotlin.Double? = null,
    /* An ID that gives extra context to the particular transaction. Because of legacy reasons the context is completely different per ref_type and means different things. It is also possible to not have a context_id */
    @Json(name = "context_id")
    var contextId: kotlin.Long? = null,
    /* The type of the given context_id if present */
    @Json(name = "context_id_type")
    var contextIdType: GetCorporationsCorporationIdWalletsDivisionJournal200Ok.ContextIdType? = null,
    /* Date and time of transaction */
    @Json(name = "date")
    var date: java.time.OffsetDateTime,
    /* The reason for the transaction, mirrors what is seen in the client */
    @Json(name = "description")
    var description: kotlin.String,
    /* The id of the first party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name */
    @Json(name = "first_party_id")
    var firstPartyId: kotlin.Int? = null,
    /* Unique journal reference ID */
    @Json(name = "id")
    var id: kotlin.Long,
    /* The user stated reason for the transaction. Only applies to some ref_types */
    @Json(name = "reason")
    var reason: kotlin.String? = null,
    /* \"The transaction type for the given. transaction. Different transaction types will populate different attributes. Note: If you have an existing XML API application that is using ref_types, you will need to know which string ESI ref_type maps to which integer. You can look at the following file to see string->int mappings: https://github.com/ccpgames/eve-glue/blob/master/eve_glue/wallet_journal_ref.py\" */
    @Json(name = "ref_type")
    var refType: GetCorporationsCorporationIdWalletsDivisionJournal200Ok.RefType,
    /* The id of the second party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name */
    @Json(name = "second_party_id")
    var secondPartyId: kotlin.Int? = null,
    /* Tax amount received. Only applies to tax related transactions */
    @Json(name = "tax")
    var tax: kotlin.Double? = null,
    /* The corporation ID receiving any tax paid. Only applies to tax related transactions */
    @Json(name = "tax_receiver_id")
    var taxReceiverId: kotlin.Int? = null
) {

    /**
    * The type of the given context_id if present
    * Values: structureId,stationId,marketTransactionId,characterId,corporationId,allianceId,eveSystem,industryJobId,contractId,planetId,systemId,typeId
    */
    
    enum class ContextIdType(val value: kotlin.String){
        @Json(name = "structure_id") structureId("structure_id"),
        @Json(name = "station_id") stationId("station_id"),
        @Json(name = "market_transaction_id") marketTransactionId("market_transaction_id"),
        @Json(name = "character_id") characterId("character_id"),
        @Json(name = "corporation_id") corporationId("corporation_id"),
        @Json(name = "alliance_id") allianceId("alliance_id"),
        @Json(name = "eve_system") eveSystem("eve_system"),
        @Json(name = "industry_job_id") industryJobId("industry_job_id"),
        @Json(name = "contract_id") contractId("contract_id"),
        @Json(name = "planet_id") planetId("planet_id"),
        @Json(name = "system_id") systemId("system_id"),
        @Json(name = "type_id") typeId("type_id");
    }
    /**
    * \"The transaction type for the given. transaction. Different transaction types will populate different attributes. Note: If you have an existing XML API application that is using ref_types, you will need to know which string ESI ref_type maps to which integer. You can look at the following file to see string->int mappings: https://github.com/ccpgames/eve-glue/blob/master/eve_glue/wallet_journal_ref.py\"
    * Values: accelerationGateFee,advertisementListingFee,agentDonation,agentLocationServices,agentMiscellaneous,agentMissionCollateralPaid,agentMissionCollateralRefunded,agentMissionReward,agentMissionRewardCorporationTax,agentMissionTimeBonusReward,agentMissionTimeBonusRewardCorporationTax,agentSecurityServices,agentServicesRendered,agentsPreward,allianceMaintainanceFee,allianceRegistrationFee,assetSafetyRecoveryTax,bounty,bountyPrize,bountyPrizeCorporationTax,bountyPrizes,bountyReimbursement,bountySurcharge,brokersFee,cloneActivation,cloneTransfer,contrabandFine,contractAuctionBid,contractAuctionBidCorp,contractAuctionBidRefund,contractAuctionSold,contractBrokersFee,contractBrokersFeeCorp,contractCollateral,contractCollateralDepositedCorp,contractCollateralPayout,contractCollateralRefund,contractDeposit,contractDepositCorp,contractDepositRefund,contractDepositSalesTax,contractPrice,contractPricePaymentCorp,contractReversal,contractReward,contractRewardDeposited,contractRewardDepositedCorp,contractRewardRefund,contractSalesTax,copying,corporateRewardPayout,corporateRewardTax,corporationAccountWithdrawal,corporationBulkPayment,corporationDividendPayment,corporationLiquidation,corporationLogoChangeCost,corporationPayment,corporationRegistrationFee,courierMissionEscrow,cspa,cspaofflinerefund,datacoreFee,dnaModificationFee,dockingFee,duelWagerEscrow,duelWagerPayment,duelWagerRefund,essEscrowTransfer,factorySlotRentalFee,gmCashTransfer,industryJobTax,infrastructureHubMaintenance,inheritance,insurance,itemTraderPayment,jumpCloneActivationFee,jumpCloneInstallationFee,killRightFee,lpStore,manufacturing,marketEscrow,marketFinePaid,marketTransaction,medalCreation,medalIssued,missionCompletion,missionCost,missionExpiration,missionReward,officeRentalFee,operationBonus,opportunityReward,planetaryConstruction,planetaryExportTax,planetaryImportTax,playerDonation,playerTrading,projectDiscoveryReward,projectDiscoveryTax,reaction,releaseOfImpoundedProperty,repairBill,reprocessingTax,researchingMaterialProductivity,researchingTechnology,researchingTimeProductivity,resourceWarsReward,reverseEngineering,securityProcessingFee,shares,skillPurchase,sovereignityBill,storePurchase,storePurchaseRefund,structureGateJump,transactionTax,upkeepAdjustmentFee,warAllyContract,warFee,warFeeSurrender
    */
    
    enum class RefType(val value: kotlin.String){
        @Json(name = "acceleration_gate_fee") accelerationGateFee("acceleration_gate_fee"),
        @Json(name = "advertisement_listing_fee") advertisementListingFee("advertisement_listing_fee"),
        @Json(name = "agent_donation") agentDonation("agent_donation"),
        @Json(name = "agent_location_services") agentLocationServices("agent_location_services"),
        @Json(name = "agent_miscellaneous") agentMiscellaneous("agent_miscellaneous"),
        @Json(name = "agent_mission_collateral_paid") agentMissionCollateralPaid("agent_mission_collateral_paid"),
        @Json(name = "agent_mission_collateral_refunded") agentMissionCollateralRefunded("agent_mission_collateral_refunded"),
        @Json(name = "agent_mission_reward") agentMissionReward("agent_mission_reward"),
        @Json(name = "agent_mission_reward_corporation_tax") agentMissionRewardCorporationTax("agent_mission_reward_corporation_tax"),
        @Json(name = "agent_mission_time_bonus_reward") agentMissionTimeBonusReward("agent_mission_time_bonus_reward"),
        @Json(name = "agent_mission_time_bonus_reward_corporation_tax") agentMissionTimeBonusRewardCorporationTax("agent_mission_time_bonus_reward_corporation_tax"),
        @Json(name = "agent_security_services") agentSecurityServices("agent_security_services"),
        @Json(name = "agent_services_rendered") agentServicesRendered("agent_services_rendered"),
        @Json(name = "agents_preward") agentsPreward("agents_preward"),
        @Json(name = "alliance_maintainance_fee") allianceMaintainanceFee("alliance_maintainance_fee"),
        @Json(name = "alliance_registration_fee") allianceRegistrationFee("alliance_registration_fee"),
        @Json(name = "asset_safety_recovery_tax") assetSafetyRecoveryTax("asset_safety_recovery_tax"),
        @Json(name = "bounty") bounty("bounty"),
        @Json(name = "bounty_prize") bountyPrize("bounty_prize"),
        @Json(name = "bounty_prize_corporation_tax") bountyPrizeCorporationTax("bounty_prize_corporation_tax"),
        @Json(name = "bounty_prizes") bountyPrizes("bounty_prizes"),
        @Json(name = "bounty_reimbursement") bountyReimbursement("bounty_reimbursement"),
        @Json(name = "bounty_surcharge") bountySurcharge("bounty_surcharge"),
        @Json(name = "brokers_fee") brokersFee("brokers_fee"),
        @Json(name = "clone_activation") cloneActivation("clone_activation"),
        @Json(name = "clone_transfer") cloneTransfer("clone_transfer"),
        @Json(name = "contraband_fine") contrabandFine("contraband_fine"),
        @Json(name = "contract_auction_bid") contractAuctionBid("contract_auction_bid"),
        @Json(name = "contract_auction_bid_corp") contractAuctionBidCorp("contract_auction_bid_corp"),
        @Json(name = "contract_auction_bid_refund") contractAuctionBidRefund("contract_auction_bid_refund"),
        @Json(name = "contract_auction_sold") contractAuctionSold("contract_auction_sold"),
        @Json(name = "contract_brokers_fee") contractBrokersFee("contract_brokers_fee"),
        @Json(name = "contract_brokers_fee_corp") contractBrokersFeeCorp("contract_brokers_fee_corp"),
        @Json(name = "contract_collateral") contractCollateral("contract_collateral"),
        @Json(name = "contract_collateral_deposited_corp") contractCollateralDepositedCorp("contract_collateral_deposited_corp"),
        @Json(name = "contract_collateral_payout") contractCollateralPayout("contract_collateral_payout"),
        @Json(name = "contract_collateral_refund") contractCollateralRefund("contract_collateral_refund"),
        @Json(name = "contract_deposit") contractDeposit("contract_deposit"),
        @Json(name = "contract_deposit_corp") contractDepositCorp("contract_deposit_corp"),
        @Json(name = "contract_deposit_refund") contractDepositRefund("contract_deposit_refund"),
        @Json(name = "contract_deposit_sales_tax") contractDepositSalesTax("contract_deposit_sales_tax"),
        @Json(name = "contract_price") contractPrice("contract_price"),
        @Json(name = "contract_price_payment_corp") contractPricePaymentCorp("contract_price_payment_corp"),
        @Json(name = "contract_reversal") contractReversal("contract_reversal"),
        @Json(name = "contract_reward") contractReward("contract_reward"),
        @Json(name = "contract_reward_deposited") contractRewardDeposited("contract_reward_deposited"),
        @Json(name = "contract_reward_deposited_corp") contractRewardDepositedCorp("contract_reward_deposited_corp"),
        @Json(name = "contract_reward_refund") contractRewardRefund("contract_reward_refund"),
        @Json(name = "contract_sales_tax") contractSalesTax("contract_sales_tax"),
        @Json(name = "copying") copying("copying"),
        @Json(name = "corporate_reward_payout") corporateRewardPayout("corporate_reward_payout"),
        @Json(name = "corporate_reward_tax") corporateRewardTax("corporate_reward_tax"),
        @Json(name = "corporation_account_withdrawal") corporationAccountWithdrawal("corporation_account_withdrawal"),
        @Json(name = "corporation_bulk_payment") corporationBulkPayment("corporation_bulk_payment"),
        @Json(name = "corporation_dividend_payment") corporationDividendPayment("corporation_dividend_payment"),
        @Json(name = "corporation_liquidation") corporationLiquidation("corporation_liquidation"),
        @Json(name = "corporation_logo_change_cost") corporationLogoChangeCost("corporation_logo_change_cost"),
        @Json(name = "corporation_payment") corporationPayment("corporation_payment"),
        @Json(name = "corporation_registration_fee") corporationRegistrationFee("corporation_registration_fee"),
        @Json(name = "courier_mission_escrow") courierMissionEscrow("courier_mission_escrow"),
        @Json(name = "cspa") cspa("cspa"),
        @Json(name = "cspaofflinerefund") cspaofflinerefund("cspaofflinerefund"),
        @Json(name = "datacore_fee") datacoreFee("datacore_fee"),
        @Json(name = "dna_modification_fee") dnaModificationFee("dna_modification_fee"),
        @Json(name = "docking_fee") dockingFee("docking_fee"),
        @Json(name = "duel_wager_escrow") duelWagerEscrow("duel_wager_escrow"),
        @Json(name = "duel_wager_payment") duelWagerPayment("duel_wager_payment"),
        @Json(name = "duel_wager_refund") duelWagerRefund("duel_wager_refund"),
        @Json(name = "ess_escrow_transfer") essEscrowTransfer("ess_escrow_transfer"),
        @Json(name = "factory_slot_rental_fee") factorySlotRentalFee("factory_slot_rental_fee"),
        @Json(name = "gm_cash_transfer") gmCashTransfer("gm_cash_transfer"),
        @Json(name = "industry_job_tax") industryJobTax("industry_job_tax"),
        @Json(name = "infrastructure_hub_maintenance") infrastructureHubMaintenance("infrastructure_hub_maintenance"),
        @Json(name = "inheritance") inheritance("inheritance"),
        @Json(name = "insurance") insurance("insurance"),
        @Json(name = "item_trader_payment") itemTraderPayment("item_trader_payment"),
        @Json(name = "jump_clone_activation_fee") jumpCloneActivationFee("jump_clone_activation_fee"),
        @Json(name = "jump_clone_installation_fee") jumpCloneInstallationFee("jump_clone_installation_fee"),
        @Json(name = "kill_right_fee") killRightFee("kill_right_fee"),
        @Json(name = "lp_store") lpStore("lp_store"),
        @Json(name = "manufacturing") manufacturing("manufacturing"),
        @Json(name = "market_escrow") marketEscrow("market_escrow"),
        @Json(name = "market_fine_paid") marketFinePaid("market_fine_paid"),
        @Json(name = "market_transaction") marketTransaction("market_transaction"),
        @Json(name = "medal_creation") medalCreation("medal_creation"),
        @Json(name = "medal_issued") medalIssued("medal_issued"),
        @Json(name = "mission_completion") missionCompletion("mission_completion"),
        @Json(name = "mission_cost") missionCost("mission_cost"),
        @Json(name = "mission_expiration") missionExpiration("mission_expiration"),
        @Json(name = "mission_reward") missionReward("mission_reward"),
        @Json(name = "office_rental_fee") officeRentalFee("office_rental_fee"),
        @Json(name = "operation_bonus") operationBonus("operation_bonus"),
        @Json(name = "opportunity_reward") opportunityReward("opportunity_reward"),
        @Json(name = "planetary_construction") planetaryConstruction("planetary_construction"),
        @Json(name = "planetary_export_tax") planetaryExportTax("planetary_export_tax"),
        @Json(name = "planetary_import_tax") planetaryImportTax("planetary_import_tax"),
        @Json(name = "player_donation") playerDonation("player_donation"),
        @Json(name = "player_trading") playerTrading("player_trading"),
        @Json(name = "project_discovery_reward") projectDiscoveryReward("project_discovery_reward"),
        @Json(name = "project_discovery_tax") projectDiscoveryTax("project_discovery_tax"),
        @Json(name = "reaction") reaction("reaction"),
        @Json(name = "release_of_impounded_property") releaseOfImpoundedProperty("release_of_impounded_property"),
        @Json(name = "repair_bill") repairBill("repair_bill"),
        @Json(name = "reprocessing_tax") reprocessingTax("reprocessing_tax"),
        @Json(name = "researching_material_productivity") researchingMaterialProductivity("researching_material_productivity"),
        @Json(name = "researching_technology") researchingTechnology("researching_technology"),
        @Json(name = "researching_time_productivity") researchingTimeProductivity("researching_time_productivity"),
        @Json(name = "resource_wars_reward") resourceWarsReward("resource_wars_reward"),
        @Json(name = "reverse_engineering") reverseEngineering("reverse_engineering"),
        @Json(name = "security_processing_fee") securityProcessingFee("security_processing_fee"),
        @Json(name = "shares") shares("shares"),
        @Json(name = "skill_purchase") skillPurchase("skill_purchase"),
        @Json(name = "sovereignity_bill") sovereignityBill("sovereignity_bill"),
        @Json(name = "store_purchase") storePurchase("store_purchase"),
        @Json(name = "store_purchase_refund") storePurchaseRefund("store_purchase_refund"),
        @Json(name = "structure_gate_jump") structureGateJump("structure_gate_jump"),
        @Json(name = "transaction_tax") transactionTax("transaction_tax"),
        @Json(name = "upkeep_adjustment_fee") upkeepAdjustmentFee("upkeep_adjustment_fee"),
        @Json(name = "war_ally_contract") warAllyContract("war_ally_contract"),
        @Json(name = "war_fee") warFee("war_fee"),
        @Json(name = "war_fee_surrender") warFeeSurrender("war_fee_surrender");
    }
}


# GetCorporationsCorporationIdWalletsDivisionJournal200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **kotlin.Double** | The amount of ISK given or taken from the wallet as a result of the given transaction. Positive when ISK is deposited into the wallet and negative when ISK is withdrawn |  [optional]
**balance** | **kotlin.Double** | Wallet balance after transaction occurred |  [optional]
**contextId** | **kotlin.Long** | An ID that gives extra context to the particular transaction. Because of legacy reasons the context is completely different per ref_type and means different things. It is also possible to not have a context_id |  [optional]
**contextIdType** | [**inline**](#ContextIdTypeEnum) | The type of the given context_id if present |  [optional]
**date** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of transaction | 
**description** | **kotlin.String** | The reason for the transaction, mirrors what is seen in the client | 
**firstPartyId** | **kotlin.Int** | The id of the first party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name |  [optional]
**id** | **kotlin.Long** | Unique journal reference ID | 
**reason** | **kotlin.String** | The user stated reason for the transaction. Only applies to some ref_types |  [optional]
**refType** | [**inline**](#RefTypeEnum) | \&quot;The transaction type for the given. transaction. Different transaction types will populate different attributes. Note: If you have an existing XML API application that is using ref_types, you will need to know which string ESI ref_type maps to which integer. You can look at the following file to see string-&gt;int mappings: https://github.com/ccpgames/eve-glue/blob/master/eve_glue/wallet_journal_ref.py\&quot; | 
**secondPartyId** | **kotlin.Int** | The id of the second party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name |  [optional]
**tax** | **kotlin.Double** | Tax amount received. Only applies to tax related transactions |  [optional]
**taxReceiverId** | **kotlin.Int** | The corporation ID receiving any tax paid. Only applies to tax related transactions |  [optional]


<a name="ContextIdTypeEnum"></a>
## Enum: context_id_type
Name | Value
---- | -----
contextIdType | structure_id, station_id, market_transaction_id, character_id, corporation_id, alliance_id, eve_system, industry_job_id, contract_id, planet_id, system_id, type_id


<a name="RefTypeEnum"></a>
## Enum: ref_type
Name | Value
---- | -----
refType | acceleration_gate_fee, advertisement_listing_fee, agent_donation, agent_location_services, agent_miscellaneous, agent_mission_collateral_paid, agent_mission_collateral_refunded, agent_mission_reward, agent_mission_reward_corporation_tax, agent_mission_time_bonus_reward, agent_mission_time_bonus_reward_corporation_tax, agent_security_services, agent_services_rendered, agents_preward, alliance_maintainance_fee, alliance_registration_fee, asset_safety_recovery_tax, bounty, bounty_prize, bounty_prize_corporation_tax, bounty_prizes, bounty_reimbursement, bounty_surcharge, brokers_fee, clone_activation, clone_transfer, contraband_fine, contract_auction_bid, contract_auction_bid_corp, contract_auction_bid_refund, contract_auction_sold, contract_brokers_fee, contract_brokers_fee_corp, contract_collateral, contract_collateral_deposited_corp, contract_collateral_payout, contract_collateral_refund, contract_deposit, contract_deposit_corp, contract_deposit_refund, contract_deposit_sales_tax, contract_price, contract_price_payment_corp, contract_reversal, contract_reward, contract_reward_deposited, contract_reward_deposited_corp, contract_reward_refund, contract_sales_tax, copying, corporate_reward_payout, corporate_reward_tax, corporation_account_withdrawal, corporation_bulk_payment, corporation_dividend_payment, corporation_liquidation, corporation_logo_change_cost, corporation_payment, corporation_registration_fee, courier_mission_escrow, cspa, cspaofflinerefund, datacore_fee, dna_modification_fee, docking_fee, duel_wager_escrow, duel_wager_payment, duel_wager_refund, ess_escrow_transfer, factory_slot_rental_fee, gm_cash_transfer, industry_job_tax, infrastructure_hub_maintenance, inheritance, insurance, item_trader_payment, jump_clone_activation_fee, jump_clone_installation_fee, kill_right_fee, lp_store, manufacturing, market_escrow, market_fine_paid, market_transaction, medal_creation, medal_issued, mission_completion, mission_cost, mission_expiration, mission_reward, office_rental_fee, operation_bonus, opportunity_reward, planetary_construction, planetary_export_tax, planetary_import_tax, player_donation, player_trading, project_discovery_reward, project_discovery_tax, reaction, release_of_impounded_property, repair_bill, reprocessing_tax, researching_material_productivity, researching_technology, researching_time_productivity, resource_wars_reward, reverse_engineering, security_processing_fee, shares, skill_purchase, sovereignity_bill, store_purchase, store_purchase_refund, structure_gate_jump, transaction_tax, upkeep_adjustment_fee, war_ally_contract, war_fee, war_fee_surrender




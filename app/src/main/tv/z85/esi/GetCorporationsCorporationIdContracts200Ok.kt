package tv.z85.tv.z85.esi

import tv.z85.domain.Contract
import tv.z85.esi.models.GetCorporationsCorporationIdContracts200Ok

fun GetCorporationsCorporationIdContracts200Ok.map(): Contract =
    Contract(
        acceptorId = this.acceptorId,
        assigneeId = this.assigneeId,
        availability = this.availability.map(),
        buyout = this.buyout,
        collateral = this.collateral,
        contractId = this.contractId,
        dateAccepted = this.dateAccepted,
        dateCompleted = this.dateCompleted,
        dateExpired = this.dateAccepted,
        dateIssued = this.dateIssued,
        daysToComplete = this.daysToComplete,
        endLocationId = this.endLocationId,
        forCorporation = this.forCorporation,
        issuerCorporationId = this.issuerCorporationId,
        issuerId = this.issuerId,
        price = this.price,
        reward = this.reward,
        startLocationId = this.startLocationId,
        status = this.status.map(),
        title = this.title,
        type = this.type.map(),
        volume = this.volume
    )

fun GetCorporationsCorporationIdContracts200Ok.Availability.map(): Contract.Availability =
    when (this) {
        GetCorporationsCorporationIdContracts200Ok.Availability.Public -> Contract.Availability.Public
        GetCorporationsCorporationIdContracts200Ok.Availability.Personal -> Contract.Availability.Personal
        GetCorporationsCorporationIdContracts200Ok.Availability.Corporation -> Contract.Availability.Corporation
        GetCorporationsCorporationIdContracts200Ok.Availability.Alliance -> Contract.Availability.Alliance
    }

fun GetCorporationsCorporationIdContracts200Ok.Status.map(): Contract.Status =
    when (this) {
        GetCorporationsCorporationIdContracts200Ok.Status.outstanding -> Contract.Status.Outstanding
        GetCorporationsCorporationIdContracts200Ok.Status.inProgress -> Contract.Status.InProgress
        GetCorporationsCorporationIdContracts200Ok.Status.finishedIssuer -> Contract.Status.FinishedIssuer
        GetCorporationsCorporationIdContracts200Ok.Status.finishedContractor -> Contract.Status.FinishedContractor
        GetCorporationsCorporationIdContracts200Ok.Status.finished -> Contract.Status.Finished
        GetCorporationsCorporationIdContracts200Ok.Status.cancelled -> Contract.Status.Cancelled
        GetCorporationsCorporationIdContracts200Ok.Status.rejected -> Contract.Status.Rejected
        GetCorporationsCorporationIdContracts200Ok.Status.failed -> Contract.Status.Failed
        GetCorporationsCorporationIdContracts200Ok.Status.deleted -> Contract.Status.Deleted
        GetCorporationsCorporationIdContracts200Ok.Status.reversed -> Contract.Status.Reversed
    }

fun GetCorporationsCorporationIdContracts200Ok.Type.map(): Contract.Type =
    when (this) {
        GetCorporationsCorporationIdContracts200Ok.Type.unknown -> Contract.Type.Unknown
        GetCorporationsCorporationIdContracts200Ok.Type.itemExchange -> Contract.Type.ItemExchange
        GetCorporationsCorporationIdContracts200Ok.Type.auction -> Contract.Type.Auction
        GetCorporationsCorporationIdContracts200Ok.Type.courier -> Contract.Type.Courier
        GetCorporationsCorporationIdContracts200Ok.Type.loan -> Contract.Type.Loan
    }
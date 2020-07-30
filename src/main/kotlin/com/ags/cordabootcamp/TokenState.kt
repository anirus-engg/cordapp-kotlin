package com.ags.cordabootcamp

import net.corda.core.contracts.ContractState
import net.corda.core.identity.AbstractParty
import net.corda.core.identity.Party

class TokenState(val issuer: Party, val owner: Party, val amount: Int): ContractState {
    override val participants: List<AbstractParty>
        get() = listOf(issuer, owner)
}
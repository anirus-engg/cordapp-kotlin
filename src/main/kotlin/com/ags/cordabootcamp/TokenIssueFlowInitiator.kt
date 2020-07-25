package com.ags.cordabootcamp

import net.corda.core.flows.CollectSignaturesFlow
import net.corda.core.flows.FinalityFlow
import net.corda.core.flows.FlowLogic
import net.corda.core.flows.FlowSession
import net.corda.core.identity.Party
import net.corda.core.transactions.SignedTransaction
import net.corda.core.transactions.TransactionBuilder
import net.corda.core.utilities.ProgressTracker


class TokenIssueFlowInitiator(val owner: Party, val amount: Int): FlowLogic<SignedTransaction>() {
    override val progressTracker: ProgressTracker = ProgressTracker()

    override fun call(): SignedTransaction {
        // We choose our transaction's notary (the notary prevents double-spends).
        // We get a reference to our own identity.

        /* ============================================================================
         *         TODO 1 - Create our TokenState to represent on-ledger tokens!
         * ===========================================================================*/
        // We create our new TokenState.
        val tokenState: TokenState? = null

        /* ============================================================================
         *      TODO 3 - Build our token issuance transaction to update the ledger!
         * ===========================================================================*/
        // We build our transaction.
        val transactionBuilder: TransactionBuilder? = null

        /* ============================================================================
         *          TODO 2 - Write our TokenContract to control token issuance!
         * ===========================================================================*/
        // We check our transaction is valid based on its contracts.
        transactionBuilder!!.verify(serviceHub)

        val session: FlowSession = initiateFlow(owner)

        // We sign the transaction with our private key, making it immutable
        val signedTransaction: SignedTransaction = serviceHub.signInitialTransaction(transactionBuilder)

        // The counter-party signs the transaction
        val fullySignedTransaction: SignedTransaction = subFlow(CollectSignaturesFlow(signedTransaction, listOf(session)))

        // We get the transaction notarised and recorded automatically by the platform
        return subFlow(FinalityFlow(fullySignedTransaction, listOf(session)))
    }

}
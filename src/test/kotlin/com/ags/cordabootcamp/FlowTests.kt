package com.ags.cordabootcamp

import net.corda.core.concurrent.CordaFuture
import net.corda.core.transactions.SignedTransaction
import net.corda.testing.node.MockNetwork
import net.corda.testing.node.MockNetworkParameters
import net.corda.testing.node.StartedMockNode
import net.corda.testing.node.TestCordapp
import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class FlowTests {
    var network: MockNetwork? = null
    var nodeA: StartedMockNode? = null
    var nodeB: StartedMockNode? = null

    @Before
    fun setup() {
        network = MockNetwork(MockNetworkParameters(
            listOf(TestCordapp.findCordapp("bootcamp"))
        ))
        nodeA = network!!.createPartyNode(null)
        nodeB = network!!.createPartyNode(null)
        network!!.runNetwork();
    }

    @After
    fun tearDown() {
        network!!.stopNodes()
    }

/*    @Test
    fun transactionConstructedByFlowUsesTheCorrectNotary() {
        var flow = TokenIssueFlowInitiator(nodeB.info.legalIdentities[0], 99)
        var future: CordaFuture<SignedTransaction> = nodeA.startFlow(flow)
        network.runNetwork()

        var signedTransaction = future.get()
        assertEquals(1, signedTransaction.tx.outputStates.size)

        var output = signedTransaction.tx.outputStates[0]
        assertEquals(network.notaryNodes[0].info.legalIdentities[0], output.notary)
    }

    @Test
    fun transactionConstructedByFlowHasOneOutputUsingTheCorrectContract() {
        var flow = TokenIssueFlowInitiator(nodeB.info.legalIdentities[0], 99)
        var future: CordaFuture<SignedTransaction> = nodeA.startFlow(flow)
        network.runNetwork()

        var signedTransaction = future.get()
        assertEquals(1, signedTransaction.tx.outputStates.size)

        var output = signedTransaction.tx.outputStates[0]
        assertEquals(network.notaryNodes[0].info.legalIdentities[0], output.notary)
    }

    @Test
    fun transactionConstructedByFlowHasOneIssueCommand() {
        val flow = TokenIssueFlowInitiator(nodeB.info.legalIdentities[0], 99)
        val future: CordaFuture<SignedTransaction> = nodeA.startFlow(flow)
        network.runNetwork()

        var signedTransaction = future.get()
        assertEquals(1, signedTransaction.tx.commands.size)

        var command = signedTransaction.tx.commands[0]
        assertEquals(command.value is TokenContract.Commands.Issue)
    }

    @Test
    fun transactionConstructedByFlowHasOneCommandWithTheIssuerAndTheOwnerAsASigners() {
        val flow = TokenIssueFlowInitiator(nodeB.info.legalIdentities[0], 99)
        val future: CordaFuture<SignedTransaction> = nodeA.startFlow(flow)
        network.runNetwork()

        var signedTransaction = future.get()
        assertEquals(1, signedTransaction.tx.commands.size)

        var command = signedTransaction.tx.commands[0]
        assertEquals(2, command.signers.size)
        assertTrue(command.signers.contains(nodeA.info.legalIdentities[0].owningKey))
        assertTrue(command.signers.contains(nodeB.info.legalIdentities[0].owningKey))
    }

    @Test
    fun transactionConstructedByFlowHasNoInputsAttachmentsOrTimeWindows() {
        val flow = TokenIssueFlowInitiator(nodeB.info.legalIdentities[0], 99)
        val future: CordaFuture<SignedTransaction> = nodeA.startFlow(flow)
        network.runNetwork()

        var signedTransaction = future.get()
        assertEquals(0, signedTransaction.tx.inputs.size)

        // The single attachment is in the Corda contract
        assertEquals(1, signedTransaction.tx.attachments.size)
        assertNull(signedTransaction.tx.timeWindow)
    }*/
}
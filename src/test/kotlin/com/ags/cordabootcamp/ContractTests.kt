package com.ags.cordabootcamp

import net.corda.core.contracts.Contract
import net.corda.core.identity.CordaX500Name
import net.corda.testing.contracts.DummyContract
import net.corda.testing.contracts.DummyState
import net.corda.testing.core.DummyCommandData
import net.corda.testing.core.TestIdentity
import net.corda.testing.node.MockServices
import org.junit.Test

class ContractTests {
/*    val alice = TestIdentity(CordaX500Name("Alice", "", "GB"))
    val bob = TestIdentity(CordaX500Name("Bob", "", "GB"))
    val ledgerServices = MockServices(TestIdentity(CordaX500Name("TestId", "", "GB")))

    private val tokenState = TokenState(alice, bob, 1)

    @Test
    fun tokenContractImplementsContract() {
        assert(TokenContract() is Contract);
    }

    @Test
    fun tokenContractRequiresZeroInputsInTheTransaction() {
        transaction(ledgerServices, tx -> {
            // Has an input, will fail
            tx.input(TokenContract.ID, tokenState)
            tx.output(TokenContract.ID, tokenState)
            tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
            tx.fails()
            return null
        })

        transaction(ledgerServices, tx -> {
            // Has no input, will verify
            tx.output(TokenContract.ID, tokenState)
            tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
            tx.verifies()
            return null
        })
    }

    @Test
    fun tokenContractRequiresOneOutputInTheTransaction() {
        transaction(ledgerServices, tx -> {
            // Has two outputs, will fail
            tx.output(TokenContract.ID, tokenState)
            tx.output(TokenContract.ID, tokenState)
            tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
            tx.fails()
            return null
        })

        transaction(ledgerServices, tx -> {
            // Has one output, will verify
            tx.output(TokenContract.ID, tokenState)
            tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
            tx.verifies()
            return null
        })
    }

    @Test
    fun tokenContractRequiresOneCommandInTheTransaction() {
        transaction(ledgerServices, tx -> {
            tx.output(TokenContract.ID, tokenState)
            // Has two commands, will fail
            tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
            tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
            tx.fails()
            return null
        })

        transaction(ledgerServices, tx -> {
            tx.output(TokenContract.ID, tokenState)
            // Has one command, will verify
            tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
            tx.verifies()
            return null
        })
    }

    @Test
    fun tokenContractRequiresTheTransactionsOutputToBeATokenState() {
        transaction(ledgerServices, tx -> {
            // Has wrong output, will fail
            tx.output(TokenContract.ID, DummyState())
            tx.command(listOf(alice.publicKey, bob.publicKey, TokenContract.Commands.Issue()))
            tx.fails()
            return null
        })

        transaction(ledgerServices, tx -> {
            // Has correct output, will verify
            tx.output(TokenContract.ID, tokenState)
            tx.command(listOf(alice.publicKey, bob.publicKey, TokenContract.Commands.Issue()))
            tx.verifies()
            return null
        })

        @Test
        fun tokenContractRequiresTheTransactionsOutputToHaveAPositiveAmount() {
            val zeroTokenState = TokenState(alice.party, bob.party, 0)
            val negativeTokenState = TokenState(alice.party, bob.party, -1)
            val positiveTokenState = TokenState(alice.party, bob.party, 2)

            transaction(ledgerServices, tx -> {
                // Has zero amount TokenState, will fail
                tx.output(TokenContract.ID, zeroTokenState)
                tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
                tx.fails()
                return null
            })

            transaction(ledgerServices, tx -> {
                // Has negative amount TokenState, will fail
                tx.output(TokenContract.ID, negativeTokenState)
                tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
                tx.fails()
                return null
            })

            transaction(ledgerServices, tx -> {
                // Has positive amount TokenState, will verify
                tx.output(TokenContract.ID, positiveTokenState)
                tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
                tx.verifies()
                return null
            })

            transaction(ledgerServices, tx -> {
                // Has negative amount TokenState, will verify
                tx.output(TokenContract.ID, tokenState)
                tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Commands.Issue())
                tx.verifies()
                return null
            })
        }

        @Test
        fun tokenContractRequiresTheTransactionsCommandToBeAnIssueCommand() {
            transaction(ledgerServices, tx -> {
                // Has wrong command type, will fail
                tx.output(TokenContract.ID, tokenState)
                tx.command(listOf(alice.publicKey, bob.publicKey), DummyCommandData.INSTANCE)
                tx.fails()
                return null
            })

            transaction(ledgerServices, tx -> {
                // Has correct command type, will verify
                tx.output(TokenContract.ID, tokenState)
                tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Command.Issue())
                tx.verifies()
                return null
            })
        }

        @Test
        fun tokenContractRequiresTheIssuerToBeARequiredSignerInTheTransaction() {
            val tokenStateWhereBobIsIssuer = TokenState(bob.party, alice.party, 1)

            transaction(ledgerServices, tx -> {
                // Issuer is not a required signer, will fail
                tx.output(TokenContract.ID, tokenState)
                tx.command(bob.publicKey, TokenContract.Command.Issue())
                tx.fails()
                return null
            })

            transaction(ledgerServices, tx -> {
                // Issuer is also not a required signer, will fail
                tx.output(TokenContract.ID, tokenState)
                tx.command(alice.publicKey, TokenContract.Command.Issue())
                tx.fails()
                return null
            })

            transaction(ledgerServices, tx -> {
                // Issuer is a required signer, will verify
                tx.output(TokenContract.ID, tokenState)
                tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Command.Issue())
                tx.verifies()
                return null
            })

            transaction(ledgerServices, tx -> {
                // Issuer is also a required signer, will verify
                tx.output(TokenContract.ID, tokenStateWhereBobIsIssuer)
                tx.command(listOf(alice.publicKey, bob.publicKey), TokenContract.Command.Issue())
                tx.verifies()
                return null
            })
        }
    }
    */
}
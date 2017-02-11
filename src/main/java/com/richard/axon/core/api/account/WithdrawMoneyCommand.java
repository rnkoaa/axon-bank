package com.richard.axon.core.api.account;

import lombok.Value;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * Created on 2/10/2017.
 */
@Value
public class WithdrawMoneyCommand {

    @TargetAggregateIdentifier
    private final String accountId;
    private final String transactionId;
    private final int amount;
}

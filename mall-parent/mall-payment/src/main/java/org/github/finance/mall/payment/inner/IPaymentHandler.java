package org.github.finance.mall.payment.inner;

import org.github.finance.mall.payment.domain.PaymentDomain;
import org.github.finance.mall.payment.exception.MallPaymentException;
import org.github.finance.mall.payment.inner.impl.PaymentHandler.PaymentWay;

/**
 * @author ligaofeng 2017年1月13日 下午1:13:57
 */
public interface IPaymentHandler {

    /**
     * @param paymentDomain
     * @return
     * @throws MallPaymentException
     */
    public PaymentWay.PaymentResult applyPayment(PaymentDomain paymentDomain) throws MallPaymentException;
}

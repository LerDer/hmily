// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.2.
// **********************************************************************

package org.dromara.hmily.demo.tars.account.servant.accountapp;

import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.annotation.*;
import com.qq.tars.common.support.Holder;

@Servant
public interface AccountServant {

	 void payment(@TarsMethodParameter(name="userId")String userId, @TarsMethodParameter(name="amount")double amount);
}
package org.feign;

import java.util.List;

import org.bouncycastle.util.Store;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("ss")
public interface StoreClient {
	@RequestMapping(method = RequestMethod.GET, value = "/")
	String getStores();


}

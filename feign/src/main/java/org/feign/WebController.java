package org.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="/test1", tags="测试接口模块")
@RequestMapping
public class WebController {
	@Autowired
	StoreClient storeClient;

    @ApiOperation(value="展示首页信息value", notes = "展示首页信息notes")
	@RequestMapping
	public String home() {
		return storeClient.getStores();
	}
}
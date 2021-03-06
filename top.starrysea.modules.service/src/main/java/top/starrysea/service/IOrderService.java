package top.starrysea.service;

import top.starrysea.common.Condition;
import top.starrysea.common.ServiceResult;
import top.starrysea.object.dto.OrderDetail;
import top.starrysea.object.dto.Orders;
import top.starrysea.object.dto.WorkType;
import top.starrysea.object.view.in.ExportXlsCondition;
import top.starrysea.object.view.in.OrderDetailForAddOrder;

import java.util.List;

public interface IOrderService {

	ServiceResult queryAllOrderService(Condition condition, Orders order);

	ServiceResult queryOrderService(Orders order);

	ServiceResult addOrderService(Orders order, List<OrderDetail> orderDetails);

	ServiceResult modifyOrderService(Orders order);

	ServiceResult removeOrderService(Orders order);

	ServiceResult queryAllProvinceService();

	ServiceResult queryWorkTypeStock(List<WorkType> workType);

	ServiceResult exportOrderToXlsService(ExportXlsCondition exportXlsCondition);

	ServiceResult resendEmailService(Orders order);

	ServiceResult queryAllWorkTypeForShoppingCarService(List<WorkType> workTypes);

	ServiceResult modifyAddressService(Orders order);

	ServiceResult modifyAddressEmailService(Orders order);

	ServiceResult queryShoppingCarListService(String redisKey);

	ServiceResult addorModifyWorkToShoppingCarService(String redisKey,
	                                                  List<OrderDetailForAddOrder> orderDetailForAddOrders);

	ServiceResult removeShoppingCarListService(String redisKey);

	ServiceResult notifyOrderService(Orders orders);

	void cancelOrderService(String message);

	ServiceResult getPostageMoney(int provinceId);
}

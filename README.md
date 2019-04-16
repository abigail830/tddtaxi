## 出租车问题
### 我们考虑出租车计价问题: 
* 不大于2公里时只收起步价6元
* 超过2公里时每公里0.8元  
* 超过8公里则每公里加收50%长途费    
* 停车等待时加收每分钟0.25元
* 最后计价的时候司机(Driver)会四舍五入只收(Charge)到元 。 

### 请写一个程序计算司机最终收费的数额。  

#### 提示：
* 创建Taxi和Driver类
* Taxi#calculate()方法计算实际车费
* Driver#charge()计算四舍五入后的收费
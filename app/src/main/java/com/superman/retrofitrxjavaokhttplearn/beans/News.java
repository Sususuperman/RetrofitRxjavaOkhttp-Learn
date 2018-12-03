package com.superman.retrofitrxjavaokhttplearn.beans;

import java.io.Serializable;
import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/11/28 18:13.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public class News implements Serializable {


    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"da6ef1fc5279dc2305c3b42828055e76","title":"想摆脱肌肉腿？尝试一下这两个动作，让你的训练事半功倍","date":"2018-11-29 09:30","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/181129093032117.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129_502c89c013e226f3ed7e466faefb9f11_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129_2a1734eefb615f471c0480e992fc99ec_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129_6611fb46c31826c5c0ebb3337eaba396_cover_mwpm_03200403.jpg"},{"uniquekey":"2dab7ba8de2087bcbec2c8120486e96b","title":"为什么要去南宁跑马拉松？","date":"2018-11-29 09:21","category":"头条","author_name":"马拉松跑步","url":"http://mini.eastday.com/mobile/181129092116220.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181129/20181129092116_9db2705763b6250d51b42b2de5688b1c_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181129/20181129092116_9db2705763b6250d51b42b2de5688b1c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181129/20181129092116_9db2705763b6250d51b42b2de5688b1c_2_mwpm_03200403.jpg"},{"uniquekey":"53ac797c51aaa903124b07f5e80b426d","title":"伊朗将军体验\u201c枭龙\u201d 或考虑采购取代F14米格29","date":"2018-11-29 09:20","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/181129092049578.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181129/20181129092049_27979cb739795122de9654e7fa31e01f_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181129/20181129092049_27979cb739795122de9654e7fa31e01f_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181129/20181129092049_27979cb739795122de9654e7fa31e01f_2_mwpm_03200403.jpg"},{"uniquekey":"e5638cbb4c9794084683bcf562a943f4","title":"全国政协十三届常委会第四次会议开幕 汪洋出席","date":"2018-11-29 09:20","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/181129092034952.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181129/20181129092034_95215756827458538c66afa1e9f208cd_1_mwpm_03200403.jpg"},{"uniquekey":"512f624eefe670795b83188074d5d0c6","title":"台湾海基会前副董事长高孔廉：两岸好，台湾才会好","date":"2018-11-29 09:18","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/181129091841090.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181129/20181129091841_4b5a7c779285cf697c166d66702f4288_1_mwpm_03200403.jpg"},{"uniquekey":"94384b34686775342b8f66e28b23c3e3","title":"赵丽颖再登杂志封面，时尚造型尽显摩登气息，网友：像个大头娃娃","date":"2018-11-29 09:13","category":"头条","author_name":"潮流女人范","url":"http://mini.eastday.com/mobile/181129091321992.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181129/20181129_e3dd2cd668e2b35a794ecc16f840d4ef_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181129/20181129_3039f57b77661134736e2f43243b20b1_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181129/20181129_81075c8c7aa47589a2127e4283af804c_cover_mwpm_03200403.jpg"},{"uniquekey":"159f9fb144e8e131d46e09462551cb8a","title":"重绘\u201c太平洋战争剧本\u201d?美针对中国制定新战术","date":"2018-11-29 09:09","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/181129090934134.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181129/20181129090934_22b1c645fd5d5fb6b7f0f87e6c287c87_1_mwpm_03200403.jpg"},{"uniquekey":"68c046d3716ad611dbe0add1a1af042b","title":"离开詹皇都以为他废了，但如今却场均10+3.3，再现顶尖3D球员水准","date":"2018-11-29 09:09","category":"头条","author_name":"一起看球吧","url":"http://mini.eastday.com/mobile/181129090925265.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181129/20181129090925_0189c6e01558d244ac4925eff39f0e8c_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181129/20181129090925_0189c6e01558d244ac4925eff39f0e8c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20181129/20181129090925_0189c6e01558d244ac4925eff39f0e8c_3_mwpm_03200403.jpg"},{"uniquekey":"76fff2638441ab6211c314b7f9d87201","title":"欧冠赛场爆发大规模冲突！汽油炸弹爆炸，多人受伤流血直流","date":"2018-11-29 09:09","category":"头条","author_name":"体育卡卡说","url":"http://mini.eastday.com/mobile/181129090910479.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181129/20181129090910_dc4c4c535a8b7b977f9c8e42f1b3e499_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181129/20181129090910_dc4c4c535a8b7b977f9c8e42f1b3e499_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181129/20181129090910_dc4c4c535a8b7b977f9c8e42f1b3e499_5_mwpm_03200403.jpg"},{"uniquekey":"a8ba8d1b71544fde7afaaff63a8de26a","title":"白扁豆、紫扁豆、黑扁豆各有什么功效？一分钟带你弄懂","date":"2018-11-29 09:06","category":"头条","author_name":"瘦身是种深情","url":"http://mini.eastday.com/mobile/181129090626611.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129090626_388db63e05ffd96b602a6d04a3a26833_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129090626_388db63e05ffd96b602a6d04a3a26833_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129090626_388db63e05ffd96b602a6d04a3a26833_4_mwpm_03200403.jpg"},{"uniquekey":"9ea09657349e66a29a492c285fb5886e","title":"镜报：因落选欧冠大名单，桑切斯和穆帅关系濒临破灭","date":"2018-11-29 09:01","category":"头条","author_name":"虎扑体育","url":"http://mini.eastday.com/mobile/181129090117886.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181129/20181129090117_d6b5d92284c3f5bd10beffae5fc08e1e_1_mwpm_03200403.jpg"},{"uniquekey":"c95dfe53eeff00e4d6cdc09ac07135d7","title":"分析师：鲍威尔一手推动加元急升逾百点 油价再跌恐带来拖累","date":"2018-11-29 09:01","category":"头条","author_name":"中金网","url":"http://mini.eastday.com/mobile/181129090114626.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129090114_aa79f2bab3e564dcdcf2de7bdf292411_1_mwpm_03200403.jpg"},{"uniquekey":"b3c26706ca19e4c0f53b8fae32ea2f82","title":"《声入人心》选手颜值逆天，旧照流出惊呆网友：胖子都是潜力股！","date":"2018-11-29 08:59","category":"头条","author_name":"毒说娱乐","url":"http://mini.eastday.com/mobile/181129085937751.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181129/20181129_0004ad5116f9e37fae1fcd993a11a565_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181129/20181129_7c61ca770c4dd0fca3f25470a8818e31_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181129/20181129_43022a067f4c00455b233b32ab0fba0e_mwpm_03200403.jpg"},{"uniquekey":"c4a82b7cdec9261281ef220b88f0e300","title":"英国女子肚子涨大以为怀有身孕，医生却发现她腹中是巨大肿块","date":"2018-11-29 08:58","category":"头条","author_name":"无问西东","url":"http://mini.eastday.com/mobile/181129085802872.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181129/20181129_916bfbdca92365886ea9a93541b9ccb8_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181129/20181129_441f9396da9bcbceefb55af3156124b1_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181129/20181129_be73ece625b2610a04877d84d7789304_cover_mwpm_03200403.jpg"},{"uniquekey":"38a6edeec8041cd9c03b2bdf5b6fb4f8","title":"排超联赛不敌山东遭遇两连败，江苏女排未来该何去何从？","date":"2018-11-29 08:56","category":"头条","author_name":"AR追风","url":"http://mini.eastday.com/mobile/181129085649154.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181129/20181129_7544d48ce2aff7c7dbecaf028b031c25_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181129/20181129_5d9f7cb41d44b9c7baad19701f243f9b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181129/20181129_f3bce31d2c87fcf1bf7bf8a21b32beb2_cover_mwpm_03200403.jpg"},{"uniquekey":"e998f431fa479301ce57d8aa2e546ad4","title":"《你和我的倾城时光》几大主演均人气暴涨！唯独他被\u201c骂惨\u201d","date":"2018-11-29 08:56","category":"头条","author_name":"向往自由的追风者","url":"http://mini.eastday.com/mobile/181129085618961.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181129/20181129085618_d2a1189141161ac3acc5c94af30e53c1_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181129/20181129085618_d2a1189141161ac3acc5c94af30e53c1_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181129/20181129085618_d2a1189141161ac3acc5c94af30e53c1_6_mwpm_03200403.jpg"},{"uniquekey":"6975d719c86e6a931c8cca71f09112ec","title":"鲁能足协杯决赛会变阵？25岁快马状态低迷：首发或被U23国脚取代","date":"2018-11-29 08:55","category":"头条","author_name":"体坛部落","url":"http://mini.eastday.com/mobile/181129085527475.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181129/20181129085527_f254554b5dabc2c180fda4a16dd4c17e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181129/20181129085527_f254554b5dabc2c180fda4a16dd4c17e_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181129/20181129085527_f254554b5dabc2c180fda4a16dd4c17e_3_mwpm_03200403.jpg"},{"uniquekey":"73468449d20212b2a94c8bd6652a8462","title":"体育产业早餐11.29 | 王霜荣获亚洲足球小姐 深圳半马21人永久禁赛","date":"2018-11-29 08:55","category":"头条","author_name":"体育产业早餐","url":"http://mini.eastday.com/mobile/181129085521142.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181129/20181129085521_efa4a076648547c2097dd8410e38af0d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181129/20181129085521_efa4a076648547c2097dd8410e38af0d_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181129/20181129085521_efa4a076648547c2097dd8410e38af0d_6_mwpm_03200403.jpg"},{"uniquekey":"d136a0d5f6d5ff795573c2debc9e723d","title":"亚裔夫妇美国购物时顺手买彩票竟中数千万大奖，立即决定退休","date":"2018-11-29 08:55","category":"头条","author_name":"无问西东","url":"http://mini.eastday.com/mobile/181129085509392.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181129/20181129_f6b6054138f7afb052cc1fd227fe7994_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181129/20181129_2c2b5167b90aabb42f4c11d973ef65ef_cover_mwpm_03200403.jpg"},{"uniquekey":"7c9e6c89b906933e68c5e1a8e3d7f2ea","title":"世界上三轮车最多的城市， 整个城市有70万辆","date":"2018-11-29 08:53","category":"头条","author_name":"侃侃儿谈","url":"http://mini.eastday.com/mobile/181129085320640.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181129/20181129_e5a95b170622739635c49b0cc207c3ad_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181129/20181129_8d4f112a7e5134b5af549d49d3ddf6db_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181129/20181129_7d31ca3f9410e3536e8ef460bc5fed99_mwpm_03200403.jpg"},{"uniquekey":"03c3dfdad3ed570dc39bea83681f8ff0","title":"特朗普再威胁：不给50亿美元，就关闭政府","date":"2018-11-29 08:52","category":"头条","author_name":"观察者网","url":"http://mini.eastday.com/mobile/181129085237819.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181129/20181129085237_8472f2f3609b7202f6aa52f9a8646100_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181129/20181129085237_b6e29c74830752044e3537291dcd4d8c_2_mwpm_03200403.jpg"},{"uniquekey":"d8be2aa27ab914190db46179bf1707f9","title":"在11、12月，掰下2种\u201c树\u201d的枝条，遇土就活，6天冒出根，好养！","date":"2018-11-29 08:52","category":"头条","author_name":"多肉植物聚集地","url":"http://mini.eastday.com/mobile/181129085223592.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129085223_6e77e85b0586c90873b1f52e51d850f9_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129085223_6e77e85b0586c90873b1f52e51d850f9_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129085223_6e77e85b0586c90873b1f52e51d850f9_2_mwpm_03200403.jpg"},{"uniquekey":"f4cd8401774194f384add6f6fe61099c","title":"花生和此物一起吃，皮肤细腻，大肚子没了，不想每天疲惫不堪试试","date":"2018-11-29 08:51","category":"头条","author_name":"长寿课堂","url":"http://mini.eastday.com/mobile/181129085144225.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129085144_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129085144_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129085144_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg"},{"uniquekey":"56c71e0159e53baa0acac16215bf1c66","title":"横店\u201c小杨幂\u201d身世之谜将揭开？DNA对比结果出炉","date":"2018-11-29 08:51","category":"头条","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/181129085100244.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181129/20181129085100_49b83d0bc44f43f2d70f61cefe9aed22_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181129/20181129085100_49b83d0bc44f43f2d70f61cefe9aed22_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181129/20181129085100_49b83d0bc44f43f2d70f61cefe9aed22_1_mwpm_03200403.jpg"},{"uniquekey":"f24df834a9507e6925cb7ca01cbd6569","title":"谌龙至今仍没有开启自己的时代，有这3个原因！","date":"2018-11-29 08:50","category":"头条","author_name":"何必再说何必何必再","url":"http://mini.eastday.com/mobile/181129085009715.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181129/20181129085009_3d6d473a2ca2e1a2926816002f0dfb0a_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181129/20181129085009_3d6d473a2ca2e1a2926816002f0dfb0a_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181129/20181129085009_3d6d473a2ca2e1a2926816002f0dfb0a_1_mwpm_03200403.jpg"},{"uniquekey":"7f05e5a69579996fd2dfd4d713da595a","title":"《王者荣耀》王昭君冻不到人怎么办？小编给你支四招","date":"2018-11-29 08:49","category":"头条","author_name":"游娱大事件","url":"http://mini.eastday.com/mobile/181129084931595.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181129/20181129084931_bad062bc23bb02c163d42eeab02b5951_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181129/20181129084931_bad062bc23bb02c163d42eeab02b5951_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181129/20181129084931_bad062bc23bb02c163d42eeab02b5951_2_mwpm_03200403.jpg"},{"uniquekey":"fbe4c1de8d645700b0c3fc2cc771cd24","title":"数据揭秘张常宁曾春蕾等名将状态低迷，如此用人难求一胜遭质疑！","date":"2018-11-29 08:48","category":"头条","author_name":"萤火评球","url":"http://mini.eastday.com/mobile/181129084845451.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181129/20181128_20bea1a86eb58751ddaabf9ad80c0f8d_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181129/20181128_7ef96a5303dea1b3727f684845b16a3f_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181129/20181128_df94c946ee6d956d2dfb2126fa929c26_mwpm_03200403.jpg"},{"uniquekey":"5e116f29130b0cb28ee8d0cee56eac8b","title":"有财有运笑开颜！再过5天财路增宽，钱财飞涨的3生肖，财福双旺","date":"2018-11-29 08:48","category":"头条","author_name":"财运风水师","url":"http://mini.eastday.com/mobile/181129084837257.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129_f7a59998149ea2fb4e0fb3fe0ed42ad0_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129_03b4f9c793381eaf798678c8f0a17d9a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129_782f2fcd92b16f00e863e55cae5b09e6_cover_mwpm_03200403.jpg"},{"uniquekey":"5b35a6ee7b7447ac1984b38ed552806d","title":"中国移动副总裁李正茂：5G联合创新产业基金首期100亿元募集完成","date":"2018-11-29 08:48","category":"头条","author_name":"CCTIME飞象网","url":"http://mini.eastday.com/mobile/181129084812738.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181129/20181129084812_4efc3c3d6eb92a87bf5882da94c55429_1_mwpm_03200403.jpg"},{"uniquekey":"2b2efc1165bc52b867e9e84e7d686c44","title":"内马尔大腿级表现再证巴黎老大 与姆巴佩1举动证明皇马巴萨没戏","date":"2018-11-29 08:47","category":"头条","author_name":"纳什均衡点","url":"http://mini.eastday.com/mobile/181129084743834.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181129/20181129084743_5c818349186f5ddfe6b86a40d2f1f69b_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181129/20181129084743_5c818349186f5ddfe6b86a40d2f1f69b_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181129/20181129084743_5c818349186f5ddfe6b86a40d2f1f69b_7_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"da6ef1fc5279dc2305c3b42828055e76","title":"想摆脱肌肉腿？尝试一下这两个动作，让你的训练事半功倍","date":"2018-11-29 09:30","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/181129093032117.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129_502c89c013e226f3ed7e466faefb9f11_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129_2a1734eefb615f471c0480e992fc99ec_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129_6611fb46c31826c5c0ebb3337eaba396_cover_mwpm_03200403.jpg"},{"uniquekey":"2dab7ba8de2087bcbec2c8120486e96b","title":"为什么要去南宁跑马拉松？","date":"2018-11-29 09:21","category":"头条","author_name":"马拉松跑步","url":"http://mini.eastday.com/mobile/181129092116220.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181129/20181129092116_9db2705763b6250d51b42b2de5688b1c_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181129/20181129092116_9db2705763b6250d51b42b2de5688b1c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181129/20181129092116_9db2705763b6250d51b42b2de5688b1c_2_mwpm_03200403.jpg"},{"uniquekey":"53ac797c51aaa903124b07f5e80b426d","title":"伊朗将军体验\u201c枭龙\u201d 或考虑采购取代F14米格29","date":"2018-11-29 09:20","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/181129092049578.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181129/20181129092049_27979cb739795122de9654e7fa31e01f_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181129/20181129092049_27979cb739795122de9654e7fa31e01f_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181129/20181129092049_27979cb739795122de9654e7fa31e01f_2_mwpm_03200403.jpg"},{"uniquekey":"e5638cbb4c9794084683bcf562a943f4","title":"全国政协十三届常委会第四次会议开幕 汪洋出席","date":"2018-11-29 09:20","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/181129092034952.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181129/20181129092034_95215756827458538c66afa1e9f208cd_1_mwpm_03200403.jpg"},{"uniquekey":"512f624eefe670795b83188074d5d0c6","title":"台湾海基会前副董事长高孔廉：两岸好，台湾才会好","date":"2018-11-29 09:18","category":"头条","author_name":"解放网","url":"http://mini.eastday.com/mobile/181129091841090.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181129/20181129091841_4b5a7c779285cf697c166d66702f4288_1_mwpm_03200403.jpg"},{"uniquekey":"94384b34686775342b8f66e28b23c3e3","title":"赵丽颖再登杂志封面，时尚造型尽显摩登气息，网友：像个大头娃娃","date":"2018-11-29 09:13","category":"头条","author_name":"潮流女人范","url":"http://mini.eastday.com/mobile/181129091321992.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181129/20181129_e3dd2cd668e2b35a794ecc16f840d4ef_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181129/20181129_3039f57b77661134736e2f43243b20b1_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181129/20181129_81075c8c7aa47589a2127e4283af804c_cover_mwpm_03200403.jpg"},{"uniquekey":"159f9fb144e8e131d46e09462551cb8a","title":"重绘\u201c太平洋战争剧本\u201d?美针对中国制定新战术","date":"2018-11-29 09:09","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/181129090934134.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181129/20181129090934_22b1c645fd5d5fb6b7f0f87e6c287c87_1_mwpm_03200403.jpg"},{"uniquekey":"68c046d3716ad611dbe0add1a1af042b","title":"离开詹皇都以为他废了，但如今却场均10+3.3，再现顶尖3D球员水准","date":"2018-11-29 09:09","category":"头条","author_name":"一起看球吧","url":"http://mini.eastday.com/mobile/181129090925265.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181129/20181129090925_0189c6e01558d244ac4925eff39f0e8c_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181129/20181129090925_0189c6e01558d244ac4925eff39f0e8c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20181129/20181129090925_0189c6e01558d244ac4925eff39f0e8c_3_mwpm_03200403.jpg"},{"uniquekey":"76fff2638441ab6211c314b7f9d87201","title":"欧冠赛场爆发大规模冲突！汽油炸弹爆炸，多人受伤流血直流","date":"2018-11-29 09:09","category":"头条","author_name":"体育卡卡说","url":"http://mini.eastday.com/mobile/181129090910479.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181129/20181129090910_dc4c4c535a8b7b977f9c8e42f1b3e499_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181129/20181129090910_dc4c4c535a8b7b977f9c8e42f1b3e499_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181129/20181129090910_dc4c4c535a8b7b977f9c8e42f1b3e499_5_mwpm_03200403.jpg"},{"uniquekey":"a8ba8d1b71544fde7afaaff63a8de26a","title":"白扁豆、紫扁豆、黑扁豆各有什么功效？一分钟带你弄懂","date":"2018-11-29 09:06","category":"头条","author_name":"瘦身是种深情","url":"http://mini.eastday.com/mobile/181129090626611.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129090626_388db63e05ffd96b602a6d04a3a26833_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129090626_388db63e05ffd96b602a6d04a3a26833_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129090626_388db63e05ffd96b602a6d04a3a26833_4_mwpm_03200403.jpg"},{"uniquekey":"9ea09657349e66a29a492c285fb5886e","title":"镜报：因落选欧冠大名单，桑切斯和穆帅关系濒临破灭","date":"2018-11-29 09:01","category":"头条","author_name":"虎扑体育","url":"http://mini.eastday.com/mobile/181129090117886.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181129/20181129090117_d6b5d92284c3f5bd10beffae5fc08e1e_1_mwpm_03200403.jpg"},{"uniquekey":"c95dfe53eeff00e4d6cdc09ac07135d7","title":"分析师：鲍威尔一手推动加元急升逾百点 油价再跌恐带来拖累","date":"2018-11-29 09:01","category":"头条","author_name":"中金网","url":"http://mini.eastday.com/mobile/181129090114626.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129090114_aa79f2bab3e564dcdcf2de7bdf292411_1_mwpm_03200403.jpg"},{"uniquekey":"b3c26706ca19e4c0f53b8fae32ea2f82","title":"《声入人心》选手颜值逆天，旧照流出惊呆网友：胖子都是潜力股！","date":"2018-11-29 08:59","category":"头条","author_name":"毒说娱乐","url":"http://mini.eastday.com/mobile/181129085937751.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181129/20181129_0004ad5116f9e37fae1fcd993a11a565_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181129/20181129_7c61ca770c4dd0fca3f25470a8818e31_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20181129/20181129_43022a067f4c00455b233b32ab0fba0e_mwpm_03200403.jpg"},{"uniquekey":"c4a82b7cdec9261281ef220b88f0e300","title":"英国女子肚子涨大以为怀有身孕，医生却发现她腹中是巨大肿块","date":"2018-11-29 08:58","category":"头条","author_name":"无问西东","url":"http://mini.eastday.com/mobile/181129085802872.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181129/20181129_916bfbdca92365886ea9a93541b9ccb8_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181129/20181129_441f9396da9bcbceefb55af3156124b1_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181129/20181129_be73ece625b2610a04877d84d7789304_cover_mwpm_03200403.jpg"},{"uniquekey":"38a6edeec8041cd9c03b2bdf5b6fb4f8","title":"排超联赛不敌山东遭遇两连败，江苏女排未来该何去何从？","date":"2018-11-29 08:56","category":"头条","author_name":"AR追风","url":"http://mini.eastday.com/mobile/181129085649154.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181129/20181129_7544d48ce2aff7c7dbecaf028b031c25_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181129/20181129_5d9f7cb41d44b9c7baad19701f243f9b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181129/20181129_f3bce31d2c87fcf1bf7bf8a21b32beb2_cover_mwpm_03200403.jpg"},{"uniquekey":"e998f431fa479301ce57d8aa2e546ad4","title":"《你和我的倾城时光》几大主演均人气暴涨！唯独他被\u201c骂惨\u201d","date":"2018-11-29 08:56","category":"头条","author_name":"向往自由的追风者","url":"http://mini.eastday.com/mobile/181129085618961.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181129/20181129085618_d2a1189141161ac3acc5c94af30e53c1_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181129/20181129085618_d2a1189141161ac3acc5c94af30e53c1_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181129/20181129085618_d2a1189141161ac3acc5c94af30e53c1_6_mwpm_03200403.jpg"},{"uniquekey":"6975d719c86e6a931c8cca71f09112ec","title":"鲁能足协杯决赛会变阵？25岁快马状态低迷：首发或被U23国脚取代","date":"2018-11-29 08:55","category":"头条","author_name":"体坛部落","url":"http://mini.eastday.com/mobile/181129085527475.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181129/20181129085527_f254554b5dabc2c180fda4a16dd4c17e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181129/20181129085527_f254554b5dabc2c180fda4a16dd4c17e_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181129/20181129085527_f254554b5dabc2c180fda4a16dd4c17e_3_mwpm_03200403.jpg"},{"uniquekey":"73468449d20212b2a94c8bd6652a8462","title":"体育产业早餐11.29 | 王霜荣获亚洲足球小姐 深圳半马21人永久禁赛","date":"2018-11-29 08:55","category":"头条","author_name":"体育产业早餐","url":"http://mini.eastday.com/mobile/181129085521142.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181129/20181129085521_efa4a076648547c2097dd8410e38af0d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20181129/20181129085521_efa4a076648547c2097dd8410e38af0d_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20181129/20181129085521_efa4a076648547c2097dd8410e38af0d_6_mwpm_03200403.jpg"},{"uniquekey":"d136a0d5f6d5ff795573c2debc9e723d","title":"亚裔夫妇美国购物时顺手买彩票竟中数千万大奖，立即决定退休","date":"2018-11-29 08:55","category":"头条","author_name":"无问西东","url":"http://mini.eastday.com/mobile/181129085509392.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181129/20181129_f6b6054138f7afb052cc1fd227fe7994_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181129/20181129_2c2b5167b90aabb42f4c11d973ef65ef_cover_mwpm_03200403.jpg"},{"uniquekey":"7c9e6c89b906933e68c5e1a8e3d7f2ea","title":"世界上三轮车最多的城市， 整个城市有70万辆","date":"2018-11-29 08:53","category":"头条","author_name":"侃侃儿谈","url":"http://mini.eastday.com/mobile/181129085320640.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181129/20181129_e5a95b170622739635c49b0cc207c3ad_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181129/20181129_8d4f112a7e5134b5af549d49d3ddf6db_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181129/20181129_7d31ca3f9410e3536e8ef460bc5fed99_mwpm_03200403.jpg"},{"uniquekey":"03c3dfdad3ed570dc39bea83681f8ff0","title":"特朗普再威胁：不给50亿美元，就关闭政府","date":"2018-11-29 08:52","category":"头条","author_name":"观察者网","url":"http://mini.eastday.com/mobile/181129085237819.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181129/20181129085237_8472f2f3609b7202f6aa52f9a8646100_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181129/20181129085237_b6e29c74830752044e3537291dcd4d8c_2_mwpm_03200403.jpg"},{"uniquekey":"d8be2aa27ab914190db46179bf1707f9","title":"在11、12月，掰下2种\u201c树\u201d的枝条，遇土就活，6天冒出根，好养！","date":"2018-11-29 08:52","category":"头条","author_name":"多肉植物聚集地","url":"http://mini.eastday.com/mobile/181129085223592.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129085223_6e77e85b0586c90873b1f52e51d850f9_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129085223_6e77e85b0586c90873b1f52e51d850f9_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129085223_6e77e85b0586c90873b1f52e51d850f9_2_mwpm_03200403.jpg"},{"uniquekey":"f4cd8401774194f384add6f6fe61099c","title":"花生和此物一起吃，皮肤细腻，大肚子没了，不想每天疲惫不堪试试","date":"2018-11-29 08:51","category":"头条","author_name":"长寿课堂","url":"http://mini.eastday.com/mobile/181129085144225.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129085144_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129085144_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129085144_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg"},{"uniquekey":"56c71e0159e53baa0acac16215bf1c66","title":"横店\u201c小杨幂\u201d身世之谜将揭开？DNA对比结果出炉","date":"2018-11-29 08:51","category":"头条","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/181129085100244.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181129/20181129085100_49b83d0bc44f43f2d70f61cefe9aed22_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181129/20181129085100_49b83d0bc44f43f2d70f61cefe9aed22_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181129/20181129085100_49b83d0bc44f43f2d70f61cefe9aed22_1_mwpm_03200403.jpg"},{"uniquekey":"f24df834a9507e6925cb7ca01cbd6569","title":"谌龙至今仍没有开启自己的时代，有这3个原因！","date":"2018-11-29 08:50","category":"头条","author_name":"何必再说何必何必再","url":"http://mini.eastday.com/mobile/181129085009715.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181129/20181129085009_3d6d473a2ca2e1a2926816002f0dfb0a_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181129/20181129085009_3d6d473a2ca2e1a2926816002f0dfb0a_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181129/20181129085009_3d6d473a2ca2e1a2926816002f0dfb0a_1_mwpm_03200403.jpg"},{"uniquekey":"7f05e5a69579996fd2dfd4d713da595a","title":"《王者荣耀》王昭君冻不到人怎么办？小编给你支四招","date":"2018-11-29 08:49","category":"头条","author_name":"游娱大事件","url":"http://mini.eastday.com/mobile/181129084931595.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181129/20181129084931_bad062bc23bb02c163d42eeab02b5951_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181129/20181129084931_bad062bc23bb02c163d42eeab02b5951_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181129/20181129084931_bad062bc23bb02c163d42eeab02b5951_2_mwpm_03200403.jpg"},{"uniquekey":"fbe4c1de8d645700b0c3fc2cc771cd24","title":"数据揭秘张常宁曾春蕾等名将状态低迷，如此用人难求一胜遭质疑！","date":"2018-11-29 08:48","category":"头条","author_name":"萤火评球","url":"http://mini.eastday.com/mobile/181129084845451.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181129/20181128_20bea1a86eb58751ddaabf9ad80c0f8d_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181129/20181128_7ef96a5303dea1b3727f684845b16a3f_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181129/20181128_df94c946ee6d956d2dfb2126fa929c26_mwpm_03200403.jpg"},{"uniquekey":"5e116f29130b0cb28ee8d0cee56eac8b","title":"有财有运笑开颜！再过5天财路增宽，钱财飞涨的3生肖，财福双旺","date":"2018-11-29 08:48","category":"头条","author_name":"财运风水师","url":"http://mini.eastday.com/mobile/181129084837257.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181129/20181129_f7a59998149ea2fb4e0fb3fe0ed42ad0_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181129/20181129_03b4f9c793381eaf798678c8f0a17d9a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181129/20181129_782f2fcd92b16f00e863e55cae5b09e6_cover_mwpm_03200403.jpg"},{"uniquekey":"5b35a6ee7b7447ac1984b38ed552806d","title":"中国移动副总裁李正茂：5G联合创新产业基金首期100亿元募集完成","date":"2018-11-29 08:48","category":"头条","author_name":"CCTIME飞象网","url":"http://mini.eastday.com/mobile/181129084812738.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181129/20181129084812_4efc3c3d6eb92a87bf5882da94c55429_1_mwpm_03200403.jpg"},{"uniquekey":"2b2efc1165bc52b867e9e84e7d686c44","title":"内马尔大腿级表现再证巴黎老大 与姆巴佩1举动证明皇马巴萨没戏","date":"2018-11-29 08:47","category":"头条","author_name":"纳什均衡点","url":"http://mini.eastday.com/mobile/181129084743834.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181129/20181129084743_5c818349186f5ddfe6b86a40d2f1f69b_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181129/20181129084743_5c818349186f5ddfe6b86a40d2f1f69b_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181129/20181129084743_5c818349186f5ddfe6b86a40d2f1f69b_7_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : da6ef1fc5279dc2305c3b42828055e76
             * title : 想摆脱肌肉腿？尝试一下这两个动作，让你的训练事半功倍
             * date : 2018-11-29 09:30
             * category : 头条
             * author_name :  运动发骚客
             * url : http://mini.eastday.com/mobile/181129093032117.html
             * thumbnail_pic_s : http://04imgmini.eastday.com/mobile/20181129/20181129_502c89c013e226f3ed7e466faefb9f11_cover_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://04imgmini.eastday.com/mobile/20181129/20181129_2a1734eefb615f471c0480e992fc99ec_cover_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://04imgmini.eastday.com/mobile/20181129/20181129_6611fb46c31826c5c0ebb3337eaba396_cover_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}

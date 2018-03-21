<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>消费echarts图表</title>
<meta name="decorator" content="default" />
<script src="${ctxStatic}/echarts/esl.js"></script>
<script src="${ctxStatic}/echarts/echarts.js"></script>
<script>
	var theme = {

		color : [ '#2ec7c9', '#b6a2de', '#5ab1ef', '#ffb980', '#d87a80',
				'#8d98b3', '#e5cf0d', '#97b552', '#95706d', '#dc69aa',
				'#07a2a4', '#9a7fd1', '#588dd5', '#f5994e', '#c05050',
				'#59678c', '#c9ab00', '#7eb00a', '#6f5553', '#c14089' ],

		title : {
			textStyle : {
				fontWeight : 'normal',
				color : '#008acd'
			}
		},

		dataRange : {
			itemWidth : 15,
			color : [ '#5ab1ef', '#e0ffff' ]
		},

		toolbox : {
			color : [ '#1e90ff', '#1e90ff', '#1e90ff', '#1e90ff' ],
			effectiveColor : '#ff4500'
		},

		tooltip : {
			backgroundColor : 'rgba(50,50,50,0.5)',
			axisPointer : {
				type : 'line',
				lineStyle : {
					color : '#008acd'
				},
				crossStyle : {
					color : '#008acd'
				},
				shadowStyle : {
					color : 'rgba(200,200,200,0.2)'
				}
			}
		},

		dataZoom : {
			dataBackgroundColor : '#efefff',
			fillerColor : 'rgba(182,162,222,0.2)',
			handleColor : '#008acd'
		},

		grid : {
			borderColor : '#eee'
		},

		categoryAxis : {
			axisLine : {
				lineStyle : {
					color : '#008acd'
				}
			},
			splitLine : {
				lineStyle : {
					color : [ '#eee' ]
				}
			}
		},

		valueAxis : {
			axisLine : {
				lineStyle : {
					color : '#008acd'
				}
			},
			splitArea : {
				show : true,
				areaStyle : {
					color : [ 'rgba(250,250,250,0.1)', 'rgba(200,200,200,0.1)' ]
				}
			},
			splitLine : {
				lineStyle : {
					color : [ '#eee' ]
				}
			}
		},

		polar : {
			axisLine : {
				lineStyle : {
					color : '#ddd'
				}
			},
			splitArea : {
				show : true,
				areaStyle : {
					color : [ 'rgba(250,250,250,0.2)', 'rgba(200,200,200,0.2)' ]
				}
			},
			splitLine : {
				lineStyle : {
					color : '#ddd'
				}
			}
		},

		timeline : {
			lineStyle : {
				color : '#008acd'
			},
			controlStyle : {
				normal : {
					color : '#008acd'
				},
				emphasis : {
					color : '#008acd'
				}
			},
			symbol : 'emptyCircle',
			symbolSize : 3
		},

		bar : {
			itemStyle : {
				normal : {
					barBorderRadius : 5
				},
				emphasis : {
					barBorderRadius : 5
				}
			}
		},

		line : {
			smooth : true,
			symbol : 'emptyCircle',
			symbolSize : 3
		},

		k : {
			itemStyle : {
				normal : {
					color : '#d87a80',
					color0 : '#2ec7c9',
					lineStyle : {
						color : '#d87a80',
						color0 : '#2ec7c9'
					}
				}
			}
		},

		scatter : {
			symbol : 'circle',
			symbolSize : 4
		},

		radar : {
			symbol : 'emptyCircle',
			symbolSize : 3
		//symbol: null,        
		//symbolRotate : null, 
		},

		map : {
			itemStyle : {
				normal : {
					areaStyle : {
						color : '#ddd'
					},
					label : {
						textStyle : {
							color : '#d87a80'
						}
					}
				},
				emphasis : {
					areaStyle : {
						color : '#fe994e'
					}
				}
			}
		},

		force : {
			itemStyle : {
				normal : {
					linkStyle : {
						color : '#1e90ff'
					}
				}
			}
		},

		chord : {
			itemStyle : {
				normal : {
					borderWidth : 1,
					borderColor : 'rgba(128, 128, 128, 0.5)',
					chordStyle : {
						lineStyle : {
							color : 'rgba(128, 128, 128, 0.5)'
						}
					}
				},
				emphasis : {
					borderWidth : 1,
					borderColor : 'rgba(128, 128, 128, 0.5)',
					chordStyle : {
						lineStyle : {
							color : 'rgba(128, 128, 128, 0.5)'
						}
					}
				}
			}
		},

		gauge : {
			axisLine : {
				lineStyle : {
					color : [ [ 0.2, '#2ec7c9' ], [ 0.8, '#5ab1ef' ],
							[ 1, '#d87a80' ] ],
					width : 10
				}
			},
			axisTick : {
				splitNumber : 10,
				length : 15,
				lineStyle : {
					color : 'auto'
				}
			},
			splitLine : {
				length : 22,
				lineStyle : {
					color : 'auto'
				}
			},
			pointer : {
				width : 5
			}
		},

		textStyle : {
			fontFamily : '微软雅黑, Arial, Verdana, sans-serif'
		}
	};
	var labelTop = {
		normal : {
			label : {
				show : true,
				position : 'center',
				formatter : '{b}',
				textStyle : {
					fontSize : 12,
					baseline : 'bottom'
				}
			},
			labelLine : {
				show : false
			}
		}
	};
	var labelFromatter = {
		normal : {
			label : {
				formatter : function(params) {
					return 100 - params.value + '人次'
				},
				textStyle : {
					fontSize : 18,
					baseline : 'top'
				}
			}
		},
	}
	var xlabelFromatter = {
			normal : {
				label : {
					show: false,
					formatter : function(a,b,c) {
						return b + "\n" + c + '人民币'
					},
					textStyle : {
						fontSize : 22,
						baseline : 'bottom'
					}
				}
	
			},
			labelLine: {
				   show: false,
				   length:0.001
				}
	}
	var xxlabelFromatter = {
		normal : {
			label : {
				show: false,
				formatter : function(a,b,c) {
					return b + "\n" + c + '人民币'
				},
				textStyle : {
					fontSize : 20,
					baseline : 'bottom'
				}
			}
		},
		labelLine: {
		   show: false,
		   length:0.001
		}
	}
	var labelBottom = {
		normal : {
			color : '#ccc',
			label : {
				show : true,
				position : 'center'
			},
			labelLine : {
				show : false
			},
			textStyle : {
				fontSize : 20
			}
		},
		emphasis : {
			color : 'rgba(0,0,0,0)'
		}
	};
	var xlabelTop = {
		normal : {
			label : {
				show : true,
				position : 'center',
				textStyle : {
					baseline : 'bottom'
				}
			},
			labelLine : {
				show : false
			}
		}
	};
	var radius = [ 50, 60 ];
	var radiuss = [ 70, 80 ];
</script>
</head>
<body> 
	<div id="xftj"
		style="width:100%; height: 400px;">
	</div>　
	<script>
	var echarts;
	function index() {
		require(['echarts'], function(ec,pie){
		    //将对象保存下来
		    console.log(ec);
		    echarts = ec;
		});
		//initXftj();
	}

	function initXftj() {
		var myChart = echarts.init(document.getElementById('xftj'));
		option = {
				series : [ {
					type : 'pie',
					center : [ '50%', '38.2%' ],
					radius : [ 75, 90 ],
					y : '15%',
					x : '0%', // for funnel
					itemStyle : xlabelFromatter,
					data : [ {
						name : '剩于',
						value : ${over},
						sort : 0,
						itemStyle : xlabelTop
					} ]
				}, {
					type : 'pie',
					center : [ '12%', '38.2%' ],
					radius : radiuss,
					y : '55%',
					x : '40%', // for funnel
					itemStyle : xxlabelFromatter,
					data : [{
						name : '支出',
						value : ${consume},
						sort : 1,
						itemStyle : xlabelTop
					} ]
				},{
					type : 'pie',
					center : [ '84%', '38.2%' ],
					radius : radiuss,
					y : '100%',
					x : '0%', // for funnel
					itemStyle : xxlabelFromatter,
					data : [{
						name : '收入',
						value : ${income},
						sort : 2,
						itemStyle : xlabelTop
					} ]
				}]
			};
	   myChart.on('click', function(param) {
		});
		myChart.setOption(option);
	}
	
	$(function() {
		index();
	});
</script>
</body>
</html>
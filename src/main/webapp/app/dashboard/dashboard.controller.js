/**
 * 
 */
angular.module("Emp")

.controller('DashboardController', ['$scope', '$state',
	function($scope, $state) {
	
	var vs = this;
	
	/*ktm.addEmp = addEmp;
	
	function addEmp() {	
	}*/
	
	vs.addEmp = function() {
		$state.go('add');
	}
	
	vs.viewEmp = function() {
		$state.go('view');
	}
	
}])




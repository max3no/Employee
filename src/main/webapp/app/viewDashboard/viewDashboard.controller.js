/**
 * 
 */

angular.module("Emp")

.controller('ViewController', ['$scope', '$state', 'ViewService',
	function($scope, $state, ViewService) {
	  var vs = this;
	  vs.empList = [];
	  vs.err = "";
	  vs.getEmp = function(){
		  ViewService.getEmp().then(
					function(response){
						vs.empList = response.data;
						if(response.data == null){
							vs.err = response.message;
						}
					},function(error){
						console.log("some error occured");
					})
	  }
	  vs.getEmp();
	  
	  vs.dashboard = function(){
		  $state.go('dashboard');
	  }
}])

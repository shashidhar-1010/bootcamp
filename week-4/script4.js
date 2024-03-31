function addEmployee() {
    var id = document.getElementById('empId').value;
    var name = document.getElementById('empName').value;
   
    if (!id || !name) {
      alert('Please enter both id and name.');
      return;
    }
   
    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'http://localhost:8081/api/employee', true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onreadystatechange = function() {
      if (xhr.readyState === XMLHttpRequest.DONE) {
        if (xhr.status === 200) {
          alert('Employee added successfully.');
          
          document.getElementById('id').value = '';
          document.getElementById('name').value = '';
          
          getEmployees();
        } else {
          alert('Failed to add the employee details.');
        }
      }
    };
    xhr.send(JSON.stringify({id: id, name: name}));
  }
   
  function getEmployees() {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'http://localhost:8081/api/getemp', true);
    xhr.onreadystatechange = function() {
      if (xhr.readyState === XMLHttpRequest.DONE) {
        if (xhr.status === 200) {
          var employees = JSON.parse(xhr.responseText);
          displayEmployees(employees);
        } else {
          alert('Failed to get details.');
        }
      }
    };
    xhr.send();
  }
   
  function displayEmployees(employees) {
    var employeeData = document.getElementById('employeeData');
    employeeData.innerHTML = '';
    employees.forEach(function(employee) {
      var li = document.createElement('li');
      li.textContent = employee.name + ' - ' + employee.position;
      employeeData.appendChild(li);
    });
  }
   
  
  getEmployees();
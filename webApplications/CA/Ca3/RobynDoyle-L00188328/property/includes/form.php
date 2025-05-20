<form style="width: 26rem;" action="messageprocess.php" method="post">
    <!-- Name input -->
    <div data-mdb-input-init class="form-outline mb-4">
        <label class="form-label" for="form4Example1">Name:</label>
            <i class="bi bi-person-fill"></i>
            <input type="text" id="form4Example1" name="name" class="form-control" placeholder="Enter your name" required>
    </div>
    <!-- Email input -->
    <div data-mdb-input-init class="form-outline mb-4">
        <label class="form-label" for="form4Example2">Email address:</label>
        
            <i class="bi bi-envelope-fill"></i>
        
            <input type="email" id="form4Example2" name="email" class="form-control" placeholder="Enter your email address" required>
            </div>
    <div class="mb-3">
        <label for="exampleSelect" class="form-label">Choose a service</label>
        <i class="bi bi-house-fill"></i>
        <select class="form-select" id="exampleSelect" name="service" required>
        <option value="Buy">Buying a property</option>
        <option value="Sell">Selling a property</option>
        <option value="First">First time buyers calculator</option>
        <option value="Holiday">Holiday Homes Buyers support</option>
        <option value="Invest">Investment opportunites</option>
        <option value="Hub">Start-Up Property Hub</option>
        <option value="Other">Other</option>
        </select>
        </div>
    <div data-mdb-input-init class="form-outline mb-4">
        <label class="form-label" for="form4Example3">Message</label>
        
            <i class="bi bi-chat-left-dots-fill"></i>
        
            <textarea class="form-control" id="form4Example3" name="message" rows="4" placeholder="Enter your message" required></textarea>
    </div>
   
    <div class="text-center">  
    <button type="submit" name="submit" class="btn btn-warning btn-block mb-4 w-100">Send</button>
    </div>
</form>